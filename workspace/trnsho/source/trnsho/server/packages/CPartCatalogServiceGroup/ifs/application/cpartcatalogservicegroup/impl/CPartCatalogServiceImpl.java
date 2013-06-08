/*
* ==================================================================================
* File:             CPartCatalogServiceImpl.java
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
 * Implementation of the <code>CPartCatalogService</code> handler.
 */
public abstract class CPartCatalogServiceImpl extends CPartCatalogServiceImplBase {

   /**
    * <p><b>Remarks:</b>
    * @param CPartCatalogRequestArray PartCatalogRequest
    * @return CPartCatalogResponseArray
    * @throws IfsException
    */
   public CPartCatalogResponseArray cCreatePartCatalog(CPartCatalogRequestArray partCatalogRequest) throws IfsException {
      
      CPartCatalogResponseArray responseArray = new CPartCatalogResponseArray();
      
      ifs.application.cpartcatalogservicegroup.CPartCatalogPlsqlAPI h = ifs.application.cpartcatalogservicegroup.CPartCatalogPlsqlAPIFactory.getHandler();
      
      CPartCatalogRequest partRec;
      
      for (int i =0; i < partCatalogRequest.size(); i++){
         
         partRec = partCatalogRequest.get(i);
         CPartCatalogResponse response = new CPartCatalogResponse();
         
         try {
            h.createPartCatalog(partRec.partNo.getValue(),partRec.description.getValue(),partRec.unitCode.getValue());
            
            response.partNo.setValue(partRec.partNo.getValue());
            response.statusCode.setValue("OK");
            response.returnMessage.setValue("Created without errors");
            
         }
         catch (Exception ex){
            
            response.partNo.setValue(partRec.partNo.getValue());
            response.statusCode.setValue("ERROR");
            response.returnMessage.setValue(ex.getMessage());            
         }
         
         responseArray.add(i,response);
      }
      
      return responseArray;
      
   }
}
