package main.java.com.hemebiotech.data;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class Symptom Counter : class which counts the occurrences of the list of symptoms entered 
 * as a parameter of the method.
 * @author Sèverine
 * creation date : 29.01.21
 */
public class SymptomCounter {

	private HashMap<String, Integer> symptomsDictionary;

	/**
	 * Constructor
	 */
	public SymptomCounter() {
		this.symptomsDictionary = new HashMap<>();
	}

	/**
	 * Method that counts the number of occurrences of each symptom and adds them 
	 * to a dictionary (key / value)
	 * @param allSymptoms list.
	 * @return the full symptom dictionary.
	 */
	public Map<String, Integer> countTheOccurencesOf(List<String> allSymptoms) {

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
