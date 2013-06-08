using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using IFS.MainForm;
using IFS.Data;

namespace IFS.MainConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            using (IFS_Data data = new IFS_Data("http://mkevmtrn-v11:59080","ifsapp","ifsapp"))
            {

                var resultString = data.ExecutePlSql("EDG-110", "EDG-110", "*");
                Console.WriteLine(String.Format( "Result: {0}", resultString));

                var result = data.Execute("A");

                foreach (var item in result)
                {
                    Console.WriteLine(item);
                }

            }
            //MainForm form = new MainForm();
            //Application.Run(form);
        }
    }
}
