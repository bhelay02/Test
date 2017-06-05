package com.gumtree.codingchallange.addressbook.controller;

import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import com.gumtree.codingchallange.addressbook.data.Gender;

import static org.hamcrest.CoreMatchers.*;

public class ContactControllerTest {

	private ContactController controller;
	@Before
	public void init(){
		controller = new ContactController();
	}
	@Test
	public void readAllContacts(){
		assertThat(controller.allContacts().size(), is(5));
	}
	
	@Test
	public void maleContacts(){
		assertThat(controller.contactsByGender(Gender.Male).size(), is(3));
	}
	
	@Test(expected=NullPointerException.class)
	public void maleContactsInvalidInput(){
		controller.contactsByGender(null);
	}
	
	@Test
	public void oldestContact(){
		assertThat(controller.oldestContact().getFirstName(), is("Wes"));
	}
	
	@Test
	public void olderAmongTwo(){
		assertThat(controller.olderAmongTwoContacts(controller.fetchContactByFirstName("Bill"),
				controller.fetchContactByFirstName("Paul"))  ,is(Long.valueOf(2862)));
	}
	
	@Test(expected=NullPointerException.class)
	public void olderAmongTwoInvalidInput(){
		controller.olderAmongTwoContacts(null,
				controller.fetchContactByFirstName("Paul"));
	}
}
