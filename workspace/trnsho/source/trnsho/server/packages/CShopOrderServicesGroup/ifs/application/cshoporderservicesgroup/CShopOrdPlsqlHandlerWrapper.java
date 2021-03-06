/*
* ==================================================================================
* File:             CShopOrdPlsqlHandlerWrapper.java
* Software Package: CShopOrderServicesGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup;

import java.util.Date;
import ifs.fnd.base.*;
import ifs.fnd.record.*;
import ifs.fnd.sf.*;
import ifs.fnd.sf.storage.*;
import ifs.application.cshoporderservicesgroup.impl.CShopOrdPlsqlHandlerImpl;

/**
 * Handler implementation wrapper instantitated by <code>CShopOrdPlsqlHandlerFactory</code>.
 */
class CShopOrdPlsqlHandlerWrapper extends CShopOrdPlsqlHandlerImpl {

   protected CShopOrdPlsqlHandlerWrapper() {
      setActivityName(null);
   }

   /**
    * <p><b>Remarks:</b>
    * @param String RequisitionNo
    * @param String Action
    * @return void
    * @throws IfsException
    */
   public void changePrStatus(String requisitionNo, String action) throws IfsException {
      beforeCall("changePrStatus");
      try {
         super.changePrStatus(requisitionNo, action);
      }
      finally {
         afterCall();
      }
   }
}
