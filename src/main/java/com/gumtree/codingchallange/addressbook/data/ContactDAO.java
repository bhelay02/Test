package com.gumtree.codingchallange.addressbook.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.gumtree.codingchallange.addressbook.utils.Constants;

/**
*
*This is implementation for a contact to read data from underlying system (In this case file system)
*
* @author Gurpreet Singh
*/
public class ContactDAO implements IContactDAO{

	/**
     * Returns all the contact records from underlying system. 
     *
     * @return the list of contact records
     */
	@Override
	public List<Contact> readAllRecords() {
		
		List<Contact> contacts = new ArrayList<Contact>();		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT);
		
		for(String[] inputLine : readCSVData()){
			String[] name = inputLine[0].split(Constants.SPACE_REGEX); 
			LocalDate dateOfBirth = LocalDate.parse(inputLine[2].trim(),formatter);
            contacts.add(new Contact(name[0], name[1], Gender.valueOf(inputLine[1].trim()),dateOfBirth));
		}
		return contacts;
	}


	/**
     * Returns the parsed data from a csv file separated by comma
     *
     * @return the list of parsed records
     */
     private  List<String[]> readCSVData(){
    	
    	List<String[]> data = new ArrayList<String[]>();
    	String csvFile="";

        try {
			csvFile = ContactDAO.class.getResource(Constants.FILE_PATH).toURI().getPath();
			String line = "";
	        String cvsSplitBy = ",";

        	BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split(cvsSplitBy);
                data.add(dataLine);
            }

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        } 
        return data;
    }
}
