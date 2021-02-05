package com.hemebiotech.analytics;
/**
 * Interface ISymptomReader
 * modification date : 29.01.21
 */
import java.io.Reader;
import java.util.List;

/**
 * Anything that will read symptom data from a reader
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications.
 * 
 * The implementation does not need to order the list.
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data reader, duplicates are possible/probable
	 */
	List<String> getSymptomsFrom (Reader reader);
}
