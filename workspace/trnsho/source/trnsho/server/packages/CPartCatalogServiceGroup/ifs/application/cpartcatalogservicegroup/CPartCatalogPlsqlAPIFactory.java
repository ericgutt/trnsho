/*
* ==================================================================================
* File:             CPartCatalogPlsqlAPIFactory.java
* Software Package: CPartCatalogServiceGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cpartcatalogservicegroup;

import ifs.fnd.base.*;
import ifs.fnd.sf.j2ee.*;

public class CPartCatalogPlsqlAPIFactory {
   private static final String jndiName = "CPartCatalogPlsqlAPI";
   /**
    * Get an instance of a <code>[CPartCatalogPlsqlAPI]</code>.
    * @return An instance of a <code>[CPartCatalogPlsqlAPI]</code>.
    * @throws SystemException If there is a serious problem locating the handler. May indicate a deployment error.
    */
   public static CPartCatalogPlsqlAPI getHandler() throws SystemException {
      FndServiceLocator serviceLocator = FndServiceLocator.getInstance();
      try {
         CPartCatalogPlsqlAPIHome home = (CPartCatalogPlsqlAPIHome) serviceLocator.getLocalHome(jndiName);
         return home.create();
      }
      catch (SystemException e) {
         serviceLocator.invalidateCachedHome(jndiName);
         throw e;
      }
      catch (Exception e) {
         serviceLocator.invalidateCachedHome(jndiName);
         throw new SystemException(e, "EJB_CREATE_ERROR: Unable to create &1. Reason: &2", jndiName, e.toString());
      }
   }
}
