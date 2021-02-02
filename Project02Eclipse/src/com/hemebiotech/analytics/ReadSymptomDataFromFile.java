package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * method that gets the reading of a text file and writes it to an ArrayList
	 * @param Reader
	 * @return all symptoms collected in an ArrayList
	 */
	@Override
	public List<String> getSymptomsFrom(Reader reader) {
		ArrayList<String> result = new ArrayList<>();
		
			try {
				BufferedReader bufferedReader = new BufferedReader (reader);
				String line = bufferedReader.readLine();
				
				while (line != null) {
					result.add(line);
					line = bufferedReader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return result;
	}

}
