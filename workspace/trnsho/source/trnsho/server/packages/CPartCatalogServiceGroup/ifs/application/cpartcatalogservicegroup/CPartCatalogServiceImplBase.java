/*
* ==================================================================================
* File:             CPartCatalogServiceImplBase.java
* Software Package: CPartCatalogServiceGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cpartcatalogservicegroup;

import java.util.Date;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;
import ifs.fnd.sf.storage.*;
import ifs.fnd.record.*;
import ifs.fnd.sf.storage.FndAbstractHandler;

/**
 * Base implementation of the <code>CPartCatalogService</code> handler.
 */
public abstract class CPartCatalogServiceImplBase extends FndAbstractHandler implements CPartCatalogService.Operations {

   /**
    * <p><b>Remarks:</b>
    * @param CPartCatalogRequestArray PartCatalogRequest
    * @return CPartCatalogResponseArray
    * @throws IfsException
    */
   public abstract CPartCatalogResponseArray cCreatePartCatalog(CPartCatalogRequestArray partCatalogRequest) throws IfsException;
}
