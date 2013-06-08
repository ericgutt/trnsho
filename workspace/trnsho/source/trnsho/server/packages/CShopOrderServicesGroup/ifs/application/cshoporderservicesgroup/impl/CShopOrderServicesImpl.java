/*
* ==================================================================================
* File:             CShopOrderServicesImpl.java
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
 * Implementation of the <code>CShopOrderServices</code> handler.
 */
public abstract class CShopOrderServicesImpl extends CShopOrderServicesImplBase {
   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return void
    * @throws IfsException
    */
   public void cReceiveShopOrder(ShopOrd shopOrd) throws IfsException {
      shopOrd.setState(FndRecordState.NEW_RECORD);
      ifs.fnd.sf.storage.IFndLUWrapperHandler h = ifs.fnd.sf.storage.FndLUWrapperHandlerFactory.getHandler(shopOrd);
      h.save(shopOrd);
   }
   
      /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cGetShopOrderRequest(ShopOrd shopOrd) throws IfsException {
      ifs.fnd.sf.storage.IFndLUWrapperHandler h = ifs.fnd.sf.storage.FndLUWrapperHandlerFactory.getHandler(shopOrd);
      return (ShopOrd)h.get(shopOrd);
   }
   
      /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cSendShopOrder(ShopOrd shopOrd) throws IfsException {
      ifs.fnd.sf.storage.IFndLUWrapperHandler h = ifs.fnd.sf.storage.FndLUWrapperHandlerFactory.getHandler(shopOrd);
      return (ShopOrd)h.get(shopOrd);
   }
   
   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cQueryShopOrderRequest(ShopOrd shopOrd) throws IfsException {
      return shopOrd;
   }
   
   
      /**
    * <p><b>Remarks:</b>
    * @param ChangePrStatusInput ChangePrStatusInput
    * @return ChangePrStatusReturnMessage
    * @throws IfsException
    */
   public ChangePrStatusReturnMessage cChangePrStatus(ChangePrStatusInput changePrStatusInput) throws IfsException {
      ChangePrStatusReturnMessage returnMessage = new ChangePrStatusReturnMessage();
      try{
         ifs.application.cshoporderservicesgroup.CShopOrdPlsqlHandler h = ifs.application.cshoporderservicesgroup.CShopOrdPlsqlHandlerFactory.getHandler(); 
         
         h.changePrStatus(changePrStatusInput.requisitionNo.getValue(),changePrStatusInput.action.getValue());
         
         returnMessage.returnMessage.setValue("Successfully updated IFS record");
         returnMessage.requisitionNo.setValue(changePrStatusInput.requisitionNo + " - " + changePrStatusInput.action.toString());
         returnMessage.statusCode.setValue("OK");
      }
      catch (Exception ex){
         returnMessage.returnMessage.setValue(ex.getMessage());
         returnMessage.statusCode.setValue("ERROR");
         returnMessage.requisitionNo.setValue(changePrStatusInput.requisitionNo + " - " + changePrStatusInput.action.toString());
         return returnMessage;
      }
      return returnMessage;
   }
}
