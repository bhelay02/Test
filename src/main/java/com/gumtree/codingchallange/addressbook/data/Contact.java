package com.gumtree.codingchallange.addressbook.data;

import java.time.LocalDate;
import java.util.Date;

/**
*
*This is model implementation for a contact
*
* @author Gurpreet Singh
*/
public class Contact {
	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate date;

	
	 /**
     * Constructs a contact object
     *
     * @param firstName the first name to set
     * @param lastName the last name to set
     * @param gender the gender to set
     * @param date the date of birth to set
     */
	public Contact(String firstName,String lastName,Gender gender,LocalDate date){
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.date=date;
	}
	
	/**
    *
    * @return the first name of the contact
    */
	public String getFirstName() {
		return firstName;
	}
	
    /**
     * Sets the first name of the contact.
     *
     * @param firstName the first name to set
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	/**
     * Sets the last name of the contact.
     *
     * @param lastName the last name to set
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
     *
     * @return the gender of the contact
     */
	public Gender getGender() {
		return gender;
	}
	
	/**
     * Sets the gender of the contact.
     *
     * @param gender the gender to set
     */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
    /**
    *
    * @return the date of birth of the contact
    */
	public LocalDate getDate() {
		return date;
	}
	
	/**
     * Sets the date of birth of the contact.
     *
     * @param date the date of birth to set
     */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
