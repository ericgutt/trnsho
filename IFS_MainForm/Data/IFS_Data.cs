using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Ifs.Fnd;
using Ifs.Fnd.AccessProvider;
using Ifs.Fnd.AccessProvider.PLSQL;
using Ifs.Fnd.Data;

namespace IFS.Data
{
    public class IFS_Data : IDisposable
    {
        FndConnection _connection = null;
        string _selectStatement = @"SELECT * FROM CUSTOMER_INFO WHERE NAME LIKE :NAME";

        public IFS_Data(string connectionString, string user= null, string password = null)
            : this(new FndConnection(connectionString, user, password))
        {
        }

        public IFS_Data(FndConnection connection)
        {
            _connection = connection;
            _connection.CatchExceptions = false;
        }

        public List<String> Execute(string commandParameter)
        {
            if (_connection == null)
                throw new ApplicationException("Error Getting Connection");

            FndPLSQLSelectCommand command = new FndPLSQLSelectCommand(_connection, _selectStatement);
            command.BindVariables.Add(
                new FndBindVariable(
                    FndBindVariableDirection.In,
                    "NAME",
                    new FndTextAttribute(string.Concat(commandParameter, "%")))
                    );

            FndDataTable returnTable = command.ExecuteReader("CUSTOMER_INFO");

            var returnNames = new List<String>();
            foreach(FndDataRow item in returnTable.Rows)
            {
                returnNames.Add(item["NAME"].ToString());
            }

           return returnNames;
        }

        public string ExecutePlSql(string partNo, string description, string unitCode )
        {

            string resultString;

            //            CREATE OR REPLACE PACKAGE BODY C_PART_CATALOG_API IS
            //-----------------------------------------------------------------------------
            //-------------------- LU SPECIFIC PUBLIC METHODS -----------------------------
            //-----------------------------------------------------------------------------
            //          PROCEDURE Create_Part_Catalog(part_no_ IN VARCHAR2,
            //                              description_ IN VARCHAR2,
            //                              unit_code_ IN VARCHAR2)
            string sqlCommand = @"C_PART_CATALOG_API.Create_Part_Catalog(:PART_NO,:DESC,:UNIT_CODE)";

            try
            {
                FndPLSQLCommand command = new FndPLSQLCommand(_connection, sqlCommand);
                command.BindVariables.AddFndTextVariable("PART_NO", partNo, FndBindVariableDirection.In);
                command.BindVariables.AddFndTextVariable("DESC", description, FndBindVariableDirection.In);
                command.BindVariables.AddFndTextVariable("UNIT_CODE", unitCode, FndBindVariableDirection.In);

                command.ExecuteNonQuery();

                resultString = "SUSCCESS";
            }
            catch (Exception ex)
            {
                resultString = String.Format("{0}\n{1}", ex.Message, (ex.InnerException != null ? ex.InnerException.Message : ""));
            }

            return resultString;
        }

        public void Dispose()
        {
            if (_connection != null)
            {
                _connection.CloseDedicatedSession();
                _connection = null;
            }
        }
    }
}
