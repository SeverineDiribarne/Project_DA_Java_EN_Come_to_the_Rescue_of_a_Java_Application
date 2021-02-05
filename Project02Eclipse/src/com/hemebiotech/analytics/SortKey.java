package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
/**
 * Class SortKey : class which sorts in alphabetical order the dictionary keys taken as a parameter
 * of the constructor.
 * @author Sèverine
 * creation date : 03.02.21
 */

public class SortKey{
	
	private Map<String, Integer> sortHashMap;

	/**
	 * Constructor
	 * @param occurencesCounter Map
	 */
	public SortKey(Map<String, Integer> occurencesCounter) {
		this.sortHashMap = occurencesCounter;
	}

	/**
	 * method which takes the Map of the occurrences counted as input by the constructor
	 * and which returns the sorted Map on output.
	 * @return sorting the Map
	 */
	public Map<String,Integer> sortMapByKey(){
								
		Map<String,Integer>map = new TreeMap<String,Integer>(sortHashMap);
		return map;
	}
}