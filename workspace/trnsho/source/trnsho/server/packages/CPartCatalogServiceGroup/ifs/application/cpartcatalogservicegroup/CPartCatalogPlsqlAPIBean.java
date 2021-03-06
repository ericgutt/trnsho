/*
* ==================================================================================
* File:             CPartCatalogPlsqlAPIBean.java
* Software Package: CPartCatalogServiceGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cpartcatalogservicegroup;

import ifs.application.cpartcatalogservicegroup.impl.CPartCatalogPlsqlAPIImpl;
import ifs.fnd.record.*;
import ifs.fnd.sf.j2ee.*;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import javax.ejb.*;

public class CPartCatalogPlsqlAPIBean extends FndImplementationBean {
   private CPartCatalogPlsqlAPIImpl implementation;

   public void ejbCreate() throws CreateException {
      super.ejbCreate();
      implementation = new CPartCatalogPlsqlAPIWrapper();
   }

   public void createPartCatalog(String partNo, String description, String unitCode) throws IfsException {
      try {
         beforeCall();
         implementation.createPartCatalog(partNo, description, unitCode);
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