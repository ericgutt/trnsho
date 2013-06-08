/*
* ==================================================================================
* File:             ChangePrStatusReturnMessageArray.java
* Software Package: CShopOrderServicesGroup
*
* DO NOT EDIT this file. It was generated and will be overwritten at next generation
*
* ==================================================================================
*/

package ifs.application.cshoporderservicesgroup;

import ifs.fnd.record.*;
import ifs.fnd.record.serialization.*;
import ifs.fnd.base.*;

/** 
 * Array of <code>ChangePrStatusReturnMessage</code>.
 */
public class ChangePrStatusReturnMessageArray extends FndAbstractArray {

   public ChangePrStatusReturnMessageArray() {
      super();
   }

   public ChangePrStatusReturnMessageArray(FndAttributeMeta meta) {
      super(meta);
   }

   public ChangePrStatusReturnMessageArray(FndAttributeMeta meta, FndCompoundReference parentKeyInParent) {
      super(meta, parentKeyInParent);
   }

   public boolean add(ChangePrStatusReturnMessage record) {
      return internalAdd(record);
   }

   public void add(int index, ChangePrStatusReturnMessage record) {
      internalAdd(index, record);
   }

   public void add(ChangePrStatusReturnMessageArray array) {
      internalAdd(array);
   }

   public void assign(ChangePrStatusReturnMessageArray from) throws SystemException {
      assign(from, true);
   }

   public boolean contains(ChangePrStatusReturnMessage record) {
      return internalContains(record);
   }

   public boolean equals(ChangePrStatusReturnMessage record) {
      return internalEquals(record);
   }

   public ChangePrStatusReturnMessage firstElement() {
      return (ChangePrStatusReturnMessage)internalFirstElement();
   }

   public ChangePrStatusReturnMessage get(int index) {
      return (ChangePrStatusReturnMessage)internalGet(index);
   }

   public int indexOf(ChangePrStatusReturnMessage record) {
      return internalIndexOf(record);
   }

   public ChangePrStatusReturnMessage lastElement() {
      return (ChangePrStatusReturnMessage)internalLastElement();
   }

   public int lastIndexOf(ChangePrStatusReturnMessage record) {
      return internalLastIndexOf(record);
   }

   public ChangePrStatusReturnMessage remove(int index) {
      return (ChangePrStatusReturnMessage)internalRemove(index);
   }

   public ChangePrStatusReturnMessage set(int index, ChangePrStatusReturnMessage record) {
      return (ChangePrStatusReturnMessage)internalSet(index, record);
   }

   public FndAbstractRecord newRecord() {
      return new ChangePrStatusReturnMessage();
   }

   protected FndAbstractRecord newRecord(FndTokenReader stream) throws ParseException {
      ChangePrStatusReturnMessage record = new ChangePrStatusReturnMessage();
      record.parse(stream);
      return record;
   } 

   protected FndAttribute newAttribute(FndAttributeMeta meta) {
       return new ChangePrStatusReturnMessageArray(meta);
   }
}