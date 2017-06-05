package com.gumtree.codingchallenge.addressbook;

import com.gumtree.codingchallange.addressbook.controller.ContactController;
import com.gumtree.codingchallange.addressbook.data.Contact;
import com.gumtree.codingchallange.addressbook.data.Gender;




/**
*
*This is implementation for a App to process all the questions as follows
*
*How many males are in the address book?
*
*Who is the oldest person in the address book?
*
*How many days older is Bill than Paul?
*
* @author Gurpreet Singh
*/
public class App 
{
    public static void main( String[] args )
    {
             ContactController contactController = new ContactController();
              Questions.getQuestions().forEach(
        		 (k,v) -> {
        			System.out.println(k+". "+v);
        		    switch(k) {
        		       case 1: 
        		    	   		System.out.println(contactController.contactsByGender(Gender.Male).size());
        		    	   		break;
        		       case 2: 
        		               { 
        		    	         Contact oldest = contactController.oldestContact();
        		    	         System.out.println(oldest.getFirstName()+" "+oldest.getLastName());
        		                }
        		    	   	    break;
        		       case 3: 
        		    	   System.out.println(contactController.olderAmongTwoContacts(contactController.fetchContactByFirstName("Bill"),
											  contactController.fetchContactByFirstName("Paul")));
        		    	   break;
        		        default: System.out.println("No data found");
        		    	   break;
        		                         
        		    }
        		}
        		                        	 
        );
        
    }

     
}
