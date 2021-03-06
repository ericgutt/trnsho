/*
* ==================================================================================
* File:             CShopOrderServices.java
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
import javax.ejb.EJBLocalObject;

/**
 * Interface for the <code>CShopOrderServices</code> handler.
 */
public interface CShopOrderServices extends EJBLocalObject {
   /**
    * <p><b>Remarks:</b>
    * @param ChangePrStatusInput ChangePrStatusInput
    * @return ChangePrStatusReturnMessage
    * @throws IfsException
    */
   public ChangePrStatusReturnMessage cChangePrStatus(ChangePrStatusInput changePrStatusInput) throws IfsException;

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cGetShopOrderRequest(ShopOrd shopOrd) throws IfsException;

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cQueryShopOrderRequest(ShopOrd shopOrd) throws IfsException;

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return void
    * @throws IfsException
    */
   public void cReceiveShopOrder(ShopOrd shopOrd) throws IfsException;

   /**
    * <p><b>Remarks:</b>
    * @param ShopOrd ShopOrd
    * @return ShopOrd
    * @throws IfsException
    */
   public ShopOrd cSendShopOrder(ShopOrd shopOrd) throws IfsException;

   public interface Operations   {

      /**
       * <p><b>Remarks:</b>
       * @param ChangePrStatusInput ChangePrStatusInput
       * @return ChangePrStatusReturnMessage
       * @throws IfsException
       */
      public ChangePrStatusReturnMessage cChangePrStatus(ChangePrStatusInput changePrStatusInput) throws IfsException;

      /**
       * <p><b>Remarks:</b>
       * @param ShopOrd ShopOrd
       * @return ShopOrd
       * @throws IfsException
       */
      public ShopOrd cGetShopOrderRequest(ShopOrd shopOrd) throws IfsException;

      /**
       * <p><b>Remarks:</b>
       * @param ShopOrd ShopOrd
       * @return ShopOrd
       * @throws IfsException
       */
      public ShopOrd cQueryShopOrderRequest(ShopOrd shopOrd) throws IfsException;

      /**
       * <p><b>Remarks:</b>
       * @param ShopOrd ShopOrd
       * @return void
       * @throws IfsException
       */
      public void cReceiveShopOrder(ShopOrd shopOrd) throws IfsException;

      /**
       * <p><b>Remarks:</b>
       * @param ShopOrd ShopOrd
       * @return ShopOrd
       * @throws IfsException
       */
      public ShopOrd cSendShopOrder(ShopOrd shopOrd) throws IfsException;
   }
}