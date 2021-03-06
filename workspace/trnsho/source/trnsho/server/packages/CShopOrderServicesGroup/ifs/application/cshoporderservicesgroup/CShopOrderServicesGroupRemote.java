/*
* ==================================================================================
* File:             CShopOrderServicesGroup.java
* Software Package: CShopOrderServicesGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup;

import java.rmi.*;
import ifs.fnd.remote.j2ee.*;
import ifs.fnd.sf.j2ee.*;
import ifs.fnd.record.*;
import ifs.fnd.remote.*;
import ifs.fnd.base.*;
import ifs.fnd.sf.*;

public interface CShopOrderServicesGroupRemote extends FndRemoteInterface {
   public FndRecordResultWrapper cShopOrderServices_CChangePrStatus(ChangePrStatusInput inRecord, FndContext ctx)  throws IfsException, RemoteException;

   public FndInvocationResult cShopOrderServices_CChangePrStatus(FndSkeletonParameter fndSecurity, byte[] inHeader, byte[] inBody)  throws RemoteException;

   public FndRecordResultWrapper cShopOrderServices_CGetShopOrderRequest(ShopOrd inRecord, FndContext ctx)  throws IfsException, RemoteException;

   public FndInvocationResult cShopOrderServices_CGetShopOrderRequest(FndSkeletonParameter fndSecurity, byte[] inHeader, byte[] inBody)  throws RemoteException;

   public FndRecordResultWrapper cShopOrderServices_CQueryShopOrderRequest(ShopOrd inRecord, FndContext ctx)  throws IfsException, RemoteException;

   public FndInvocationResult cShopOrderServices_CQueryShopOrderRequest(FndSkeletonParameter fndSecurity, byte[] inHeader, byte[] inBody)  throws RemoteException;

   public FndRecordResultWrapper cShopOrderServices_CReceiveShopOrder(ShopOrd inRecord, FndContext ctx)  throws IfsException, RemoteException;

   public FndInvocationResult cShopOrderServices_CReceiveShopOrder(FndSkeletonParameter fndSecurity, byte[] inHeader, byte[] inBody)  throws RemoteException;

   public FndRecordResultWrapper cShopOrderServices_CSendShopOrder(ShopOrd inRecord, FndContext ctx)  throws IfsException, RemoteException;

   public FndInvocationResult cShopOrderServices_CSendShopOrder(FndSkeletonParameter fndSecurity, byte[] inHeader, byte[] inBody)  throws RemoteException;


}