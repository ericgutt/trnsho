/*
 * IFSPartCatalogResponseToFlat.java
 *
 * Created on June 6, 2013, 4:20 PM
 */

/**
 *
 * @author Administrator
 */

/* IMPORTANT !!!
 * Do not place this class inside a package. It should be
 * in the default package.
 */

import ifs.fnd.base.IfsException;
import ifs.fnd.tc.framework.xml.Transformer;

public class IFSPartCatalogResponseToFlat implements Transformer {
   
   public void init() throws IfsException {
   }
   
   public String transform(String sIn) throws IfsException {
      // The Connect framework passes the output view from the BizApi serialized to a string to the transformer.
      // The first thing you want to do is to convert it back to the view format.
            
      ifs.application.cpartcatalogservicegroup.CPartCatalogResponseArray partCatalogResponseArray = new ifs.application.cpartcatalogservicegroup.CPartCatalogResponseArray();
      try{
         ifs.fnd.record.serialization.FndXmlUtil.parseRecordArray(sIn.getBytes("UTF-8"),partCatalogResponseArray,true,null);
      } catch (java.io.IOException ioe){
         throw new ifs.fnd.base.ApplicationException(ioe.toString());
      }      
      // Place the transformation code here
      StringBuffer out = new StringBuffer();
      for (int i=0; i < partCatalogResponseArray.size(); i++){
         ifs.application.cpartcatalogservicegroup.CPartCatalogResponse cPartCatalogResponse = partCatalogResponseArray.get(i);
         out.append("HEAD;");
         out.append(cPartCatalogResponse.partNo.getValue() +";");
         out.append(cPartCatalogResponse.statusCode.getValue() +";");
         out.append(cPartCatalogResponse.returnMessage.getValue() +";");
         out.append("\n");
      }
      return out.toString();      
   }
}
