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
import javax.ejb.*;

/** 
 * Home interface for the <code>CShopOrderServicesGroup</code> Activity Group.
 */
public interface CShopOrderServicesGroupHome extends EJBHome {
   CShopOrderServicesGroupRemote create()  throws RemoteException, CreateException ;
}
