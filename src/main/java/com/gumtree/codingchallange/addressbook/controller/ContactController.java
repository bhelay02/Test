package com.gumtree.codingchallange.addressbook.controller;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import com.gumtree.codingchallange.addressbook.data.Contact;
import com.gumtree.codingchallange.addressbook.data.ContactDAO;
import com.gumtree.codingchallange.addressbook.data.Gender;

/**
*
*This is controller implementation for a contact which includes processing different
*operations on the contact
*
* @author Gurpreet Singh
*/
public class ContactController {

	private ContactDAO contactDao  = new ContactDAO();
	private List<Contact> contacts = allContacts() ;
	
	/**
     * Returns all the contact records from underlying system. 
     *
     * @return the list of contact records
     */
	public List<Contact> allContacts(){
		return contactDao.readAllRecords();
	}
	
	
	
	/**
     * Returns all the contact records from underlying system based on the gender.  
     *
     * @param  gender the contact gender
     * @return the list of contact records
     */
	public List<Contact> contactsByGender(Gender gender){
		          return   contacts.
				           parallelStream().
				           filter(contact -> gender.equals(contact.getGender())).
				           collect(Collectors.toList());
	}
	
	/**
     * Returns the oldest contact record among contacts.  
     *
     * @return the contact record
     */
	public Contact oldestContact(){
            contacts.sort((Contact c1,Contact c2)->c1.getDate().compareTo(c2.getDate()));      
            return contacts.stream().findFirst().get();
	}
	
	
	/**
     * Returns the difference in days between two contact records  
     *
     * @param  first the first contact
     * @param  second the second contact
     * @return the list of contact records
     */
	public long olderAmongTwoContacts(Contact first,Contact second){
        return ChronoUnit.DAYS.between(first.getDate(), second.getDate());
    }
	
	
	/**
     * Returns the contact based on first name among the contacts  
     *
     * @param  firstName the first name of the  contact
     * @return the contact record
     */
	public Contact fetchContactByFirstName(String firstName) {
		return contacts.
				parallelStream().
				filter(contact -> firstName.equals(contact.getFirstName())).
				findFirst().
				orElseGet(null);
	}
	
}
