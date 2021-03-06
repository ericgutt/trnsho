/*
* ==================================================================================
* File:             CShopOrderServicesBean.java
* Software Package: CShopOrderServicesGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup;

import ifs.application.cshoporderservicesgroup.impl.CShopOrderServicesImpl;
import ifs.fnd.record.*;
import ifs.fnd.sf.j2ee.*;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import javax.ejb.*;

public class CShopOrderServicesBean extends FndImplementationBean {
   private CShopOrderServicesImpl implementation;

   public void ejbCreate() throws CreateException {
      super.ejbCreate();
      implementation = new CShopOrderServicesWrapper();
   }

   public ChangePrStatusReturnMessage cChangePrStatus(ChangePrStatusInput changePrStatusInput) throws IfsException {
      try {
         beforeCall();
         return implementation.cChangePrStatus(changePrStatusInput);
      }
      catch (IfsException e) {
         rollback();
         throw e;
      }
      finally {
         afterCall();
      }
   }


   public ShopOrd cGetShopOrderRequest(ShopOrd shopOrd) throws IfsException {
      try {
         beforeCall();
         return implementation.cGetShopOrderRequest(shopOrd);
      }
      finally {
         afterCall();
      }
   }


   public ShopOrd cQueryShopOrderRequest(ShopOrd shopOrd) throws IfsException {
      try {
         beforeCall();
         return implementation.cQueryShopOrderRequest(shopOrd);
      }
      finally {
         afterCall();
      }
   }


   public void cReceiveShopOrder(ShopOrd shopOrd) throws IfsException {
      try {
         beforeCall();
         implementation.cReceiveShopOrder(shopOrd);
      }
      catch (IfsException e) {
         rollback();
         throw e;
      }
      finally {
         afterCall();
      }
   }


   public ShopOrd cSendShopOrder(ShopOrd shopOrd) throws IfsException {
      try {
         beforeCall();
         return implementation.cSendShopOrder(shopOrd);
      }
      finally {
         afterCall();
      }
   }

}