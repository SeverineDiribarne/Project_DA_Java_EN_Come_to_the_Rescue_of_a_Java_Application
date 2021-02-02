package com.hemebiotech.analytics;
import java.util.HashMap;
import java.util.List;

/**
 * Symptom Counter class
 * @author Sèverine
 * @version 1.0
 */
public class SymptomCounter {

	private HashMap<String, Integer> symptomsDictionary;

	/**
	 * class constructor
	 */
	public SymptomCounter() {
		this.symptomsDictionary = new HashMap<>();
	}

	/**
	 * Count occurences of List allSymptoms
	 * @param allSymptoms
	 * @return Symptoms Dictionary
	 */
	public HashMap<String, Integer> countTheOccurencesOf(List<String> allSymptoms) {

		for (String element : allSymptoms) {
			
				if (symptomsDictionary.containsKey(element)) { 
					symptomsDictionary.put(element, symptomsDictionary.get(element)+1);
				}
				else {
					symptomsDictionary.put(element, 1);
				}
		}
		return symptomsDictionary;
	}
}
