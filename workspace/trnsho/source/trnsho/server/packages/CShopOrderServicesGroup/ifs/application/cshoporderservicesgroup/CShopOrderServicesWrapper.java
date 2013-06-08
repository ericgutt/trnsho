/*
* ==================================================================================
* File:             CShopOrderServicesWrapper.java
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
import ifs.application.cshoporderservicesgroup.impl.CShopOrderServicesImpl;

/**
 * Handler implementation wrapper instantitated by <code>CShopOrderServicesFactory</code>.
 */
class CShopOrderServicesWrapper extends CShopOrderServicesImpl {

   protected CShopOrderServicesWrapper() {
      setActivityName("CShopOrderServices");
   }

   /**
    * <p><b>Remarks:</b>
    * @param ChangePrStatusInput ChangePrStatusInput
    * @return ChangePrStatusReturnMessage
    * @throws IfsException
    */
   public ChangePrStatusReturnMessage cChangePrStatus(ChangePrStatusInput changePrStatusInput) throws IfsException {
      beforeCall("cChangePrStatus");
      try {
         return super.cChangePrStatus(changePrStatusInput);
      }
      finally {
         afterCall();
      }
   }

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cGetShopOrderRequest(ShopOrd shopOrd) throws IfsException {
      beforeCall("cGetShopOrderRequest");
      try {
         return super.cGetShopOrderRequest(shopOrd);
      }
      finally {
         afterCall();
      }
   }

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cQueryShopOrderRequest(ShopOrd shopOrd) throws IfsException {
      beforeCall("cQueryShopOrderRequest");
      try {
         return super.cQueryShopOrderRequest(shopOrd);
      }
      finally {
         afterCall();
      }
   }

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return void
    * @throws IfsException
    */
   public void cReceiveShopOrder(ShopOrd shopOrd) throws IfsException {
      beforeCall("cReceiveShopOrder");
      try {
         super.cReceiveShopOrder(shopOrd);
      }
      finally {
         afterCall();
      }
   }

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cSendShopOrder(ShopOrd shopOrd) throws IfsException {
      beforeCall("cSendShopOrder");
      try {
         return super.cSendShopOrder(shopOrd);
      }
      finally {
         afterCall();
      }
   }
}