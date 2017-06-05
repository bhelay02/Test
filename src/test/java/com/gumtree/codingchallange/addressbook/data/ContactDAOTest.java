package com.gumtree.codingchallange.addressbook.data;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ContactDAOTest {

	
	private ContactDAO contact;
	@Before
	public void init()
	{
		contact =  new ContactDAO();
	}
	
	@Test
	public void readAll()
	{
		assertThat(contact.readAllRecords().size(), is(5));
	}
}
