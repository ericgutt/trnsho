/*
* ==================================================================================
* File:             CShopOrdPlsqlHandlerBean.java
* Software Package: CShopOrderServicesGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup;

import ifs.application.cshoporderservicesgroup.impl.CShopOrdPlsqlHandlerImpl;
import ifs.fnd.record.*;
import ifs.fnd.sf.j2ee.*;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import javax.ejb.*;

public class CShopOrdPlsqlHandlerBean extends FndImplementationBean {
   private CShopOrdPlsqlHandlerImpl implementation;

   public void ejbCreate() throws CreateException {
      super.ejbCreate();
      implementation = new CShopOrdPlsqlHandlerWrapper();
   }

   public void changePrStatus(String requisitionNo, String action) throws IfsException {
      try {
         beforeCall();
         implementation.changePrStatus(requisitionNo, action);
      }
      catch (IfsException e) {
         rollback();
         throw e;
      }
      finally {
         afterCall();
      }
   }

}