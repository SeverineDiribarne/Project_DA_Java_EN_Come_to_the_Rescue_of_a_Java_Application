package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.nio.file.Files;

/**
 * Class Analytics Counter : class that contains the entry point.
 * @author Sèverine
 * modification date : 04.02.21
 */
public class AnalyticsCounter {
	
	/**
	 * Entry Point
	 * @param args
	 * @throws Exception
	 */
	public static void main(String [] args) throws Exception {
		
		// retrieving and reading the text file
		File symptomsFile = new File("C:\\Users\\Sèverine\\Documents\\1.Informatique\\Professionnel\\2.OpenClassrooms\\1.Openclassrooms_Projets\\P2\\Developpements\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\resources\\config\\symptoms.txt");
		FileReader fileReader = new FileReader (symptomsFile);
		
		// Passing the content of the symptom list and creating the ArrayList using 
		//the "getSymptomsFrom" method.
		ISymptomReader reader = new ReadSymptomDataFromFile();
		List<String> allSymptoms = reader.getSymptomsFrom(fileReader);
		

		// create a new Map and switch the list of symptoms to the "countTheOccurences" 
		//method which counts the occurrences of each symptom present in the list and 
		//which returns the Map with its counted content.
		SymptomCounter DictionaryOfSymptoms = new SymptomCounter();
		Map<String, Integer> occurencesCounter = DictionaryOfSymptoms.countTheOccurencesOf(allSymptoms);
		

		// Creation of a new Map and passage of the "occurrencesCounter" Map in the
		// "sortMapByKey" method which sorts its content and returns a new Map sorted 
		//in alphabetical order
		SortKey keySorting  = new SortKey(occurencesCounter);
		Map<String, Integer> sortKey = keySorting.sortMapByKey();
	
		//creation of a new instance of the WriteSymptomDataFile class which calls its 
		//method to generate a new text file whose content is counted and sorted
    	WriteSymptomDataFile writeSymptomDataFile = new WriteSymptomDataFile(sortKey);
		writeSymptomDataFile.setSymptomsBy();
	}	
}
