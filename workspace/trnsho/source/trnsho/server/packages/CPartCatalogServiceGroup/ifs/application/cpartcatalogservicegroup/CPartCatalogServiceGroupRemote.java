/*
* ==================================================================================
* File:             CPartCatalogServiceGroup.java
* Software Package: CPartCatalogServiceGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cpartcatalogservicegroup;

import java.rmi.*;
import ifs.fnd.remote.j2ee.*;
import ifs.fnd.sf.j2ee.*;
import ifs.fnd.record.*;
import ifs.fnd.remote.*;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;

public interface CPartCatalogServiceGroupRemote extends FndRemoteInterface {
   public FndArrayResultWrapper cPartCatalogService_CCreatePartCatalog(CPartCatalogRequestArray inRecord, FndContext ctx)  throws IfsException, RemoteException;

   public FndInvocationResult cPartCatalogService_CCreatePartCatalog(FndSkeletonParameter fndSecurity, byte[] inHeader, byte[] inBody)  throws RemoteException;


}