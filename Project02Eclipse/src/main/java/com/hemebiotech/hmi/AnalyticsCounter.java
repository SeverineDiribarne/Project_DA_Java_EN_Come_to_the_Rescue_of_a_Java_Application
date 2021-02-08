package main.java.com.hemebiotech.hmi;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import main.java.com.hemebiotech.data.*;

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
		
		// Reading and recovering the symptoms file
		File symptomsFile = new File ("src\\resources\\config\\symptoms.txt");
		FileReader fileReader = new FileReader (symptomsFile);
		ISymptomReader reader = new ReadSymptomDataFromFile();
		List<String> allSymptoms = reader.getSymptomsFrom(fileReader);
		
		//Sorting and counting the symptoms
		SymptomCounter DictionaryOfSymptoms = new SymptomCounter();
		Map<String, Integer> occurencesCounter = DictionaryOfSymptoms.countTheOccurencesOf(allSymptoms);
		SortKey keySorting  = new SortKey(occurencesCounter);
		Map<String, Integer> sortKey = keySorting.sortMapByKey();
    	WriteSymptomDataFile writeSymptomDataFile = new WriteSymptomDataFile(sortKey);
		writeSymptomDataFile.setSymptomsBy();
	}	
}
