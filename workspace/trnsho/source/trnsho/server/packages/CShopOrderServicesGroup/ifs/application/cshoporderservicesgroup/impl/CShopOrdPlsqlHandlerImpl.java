/*
* ==================================================================================
* File:             CShopOrdPlsqlHandlerImpl.java
* Software Package: CShopOrderServicesGroup
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup.impl;

import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import ifs.fnd.record.*;
import ifs.application.cshoporderservicesgroup.*;

/**
 * Implementation of the <code>CShopOrdPlsqlHandler</code> handler.
 */
public abstract class CShopOrdPlsqlHandlerImpl extends CShopOrdPlsqlHandlerImplBase {

   /**
    * <p><b>Remarks:</b>
    * @param String RequisitionNo
    * @param String Action
    * @return void
    * @throws IfsException
    */
   public void changePrStatus(String requisitionNo, String action) throws IfsException {
      super.plsqlChangePrStatus(new FndText("RequisitionNo",requisitionNo),
                                new FndText("Action", action));
   }
}
