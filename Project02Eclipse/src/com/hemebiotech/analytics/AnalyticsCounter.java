package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileReader;
import java.util.List;


public class AnalyticsCounter {
	
	/**
	 * Analytics Counter
	 * @author Sèverine
	 * @version 1.2
	 */
	public static void main(String args[]) throws Exception {
		File symptomsFile = new File("C:\\Users\\Sèverine\\Documents\\1.Informatique\\Professionnel\\2.OpenClassrooms\\1.Openclassrooms_Projets\\P2\\Developpements\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		FileReader fileReader = new FileReader (symptomsFile);

		ISymptomReader reader = new ReadSymptomDataFromFile();
		List<String> allSymptoms = reader.getSymptomsFrom(fileReader);
		System.out.println(allSymptoms);
	}
}
