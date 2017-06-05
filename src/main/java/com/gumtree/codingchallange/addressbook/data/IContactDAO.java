package com.gumtree.codingchallange.addressbook.data;

import java.util.List;
/**
*
*This is interface for retrieving contact records
*
* @author Gurpreet Singh
*/
public interface IContactDAO {
	
	/**
     * Returns the number of contact records. 
     *
     * @return the number of contact records
     */
       public List<Contact> readAllRecords();
       
       
}
