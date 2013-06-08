/*
* ==================================================================================
* File:             CShopOrdPlsqlHandlerImplBase.java
* Software Package: CShopOrderServicesGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup;

import java.util.Date;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import ifs.fnd.sf.storage.*;
import ifs.fnd.record.*;
import ifs.fnd.sf.storage.FndAbstractHandler;
import ifs.fnd.sf.storage.FndPlsqlAccess;
import ifs.fnd.services.plsqlserver.AttributeString;

/**
 * Base implementation of the <code>CShopOrdPlsqlHandler</code> handler.
 */
public abstract class CShopOrdPlsqlHandlerImplBase extends FndAbstractHandler implements CShopOrdPlsqlHandler.Operations {

   protected final FndPlsqlAccess plsqlAccess = new FndPlsqlAccess();

   private static final String stmt_CHANGEPRSTATUS0  = 
      "BEGIN &AO.SHOP_ORD_BIZ_API.CHANGE_PR_STATUS (" + 
         ":REQUISITION_NO_," + 
         ":ACTION_);" +
      "END;";

   /**
    * <p><b>Remarks:</b>
    * @param FndText requisition_no_
    * @param FndText action_
    * @return void
    * @throws IfsException
    */
   protected void plsqlChangePrStatus(final FndText requisition_no_, final FndText action_) throws IfsException {
      //Create bind variables
      FndRecord params = new FndRecord();
      params.add("REQUISITION_NO_", (requisition_no_ != null) ? requisition_no_ : new FndText(), "IN");
      params.add("ACTION_", (action_ != null) ? action_ : new FndText(), "IN");
      //Execute the PL/SQL method
      plsqlAccess.execute(stmt_CHANGEPRSTATUS0, params);
      //Return data to caller
   }
}
