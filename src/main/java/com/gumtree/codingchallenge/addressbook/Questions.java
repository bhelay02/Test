package com.gumtree.codingchallenge.addressbook;

import java.util.HashMap;
import java.util.Map;
/**
*
*This is list of questions in the application
*
* @author Gurpreet Singh
*/
public class Questions {

	 /**
     * Sets and initialises all the questions.
     *
     * @return the map of questions
     */
	public static Map<Integer,String> getQuestions(){
		Map<Integer,String> questions = new HashMap<>();
		questions.put(1, "How many males are in the address book?");
		questions.put(2, "Who is the oldest person in the address book?");
		questions.put(3, "How many days older is Bill than Paul?");
		return questions;
	}
	
}
