package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

/**
 * Class WriteSymptomDataFile : class which takes the Map as input of the constructor and
 *  which writes in the method, the result of the Map in an output text file.
 * @author Sèverine
 * creation date : 04.02.21
 */
public class WriteSymptomDataFile{
	
	
	
	Map<String, Integer> sortKey;
	
	/**
	 * Constructor
	 * @param sortKey
	 */
	public WriteSymptomDataFile(Map<String, Integer> sortKey) {
		this.sortKey = sortKey;
	}

	/**
	 * method which creates a new text file named "results" and which contains the sorted Map
	 * and the number of occurrences of each symptom.
	 */
	public void setSymptomsBy() {
		
		try {
		FileWriter fileWriter = new FileWriter("results.out");
		for(Map.Entry<String, Integer> entry : this.sortKey.entrySet()) {
			String tmp = entry.getKey() + " : " + entry.getValue() + System.lineSeparator();
			fileWriter.write(tmp);
		}
		fileWriter.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}