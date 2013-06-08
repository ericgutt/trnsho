/*
* ==================================================================================
* File:             CPartCatalogPlsqlAPIImpl.java
* Software Package: CPartCatalogServiceGroup
*
* ==================================================================================
*/

package ifs.application.cpartcatalogservicegroup.impl;

import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import ifs.fnd.record.*;
import ifs.application.cpartcatalogservicegroup.*;

/**
 * Implementation of the <code>CPartCatalogPlsqlAPI</code> handler.
 */
public abstract class CPartCatalogPlsqlAPIImpl extends CPartCatalogPlsqlAPIImplBase {

   /**
    * <p><b>Remarks:</b>
    * @param String PartNo
    * @param String Description
    * @param String UnitCode
    * @return void
    * @throws IfsException
    */
   public void createPartCatalog(String partNo, String description, String unitCode) throws IfsException {
      super.plsqlCreatePartCatalog(new FndText("partNo",partNo),
                                   new FndText("description",description),
                                   new FndText("unitCode",unitCode));
   }
}
