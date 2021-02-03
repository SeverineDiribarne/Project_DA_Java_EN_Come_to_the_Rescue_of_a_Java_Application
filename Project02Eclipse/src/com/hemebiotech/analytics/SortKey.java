package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SortKey{
	
	private HashMap<String, Integer> sortHashMap;

	/**
	 * class constructor
	 */
	public SortKey() {
		this.sortHashMap = new HashMap<>();
	}

	public HashMap<String,Integer>sortHashMapByKey(HashMap<String, Integer> symptomsDictionary){
								
		HashMap<String, Integer>sortHashmap = symptomsDictionary;
		Map<String,Integer>map = new TreeMap<String,Integer>(sortHashmap);
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		return sortHashmap;
	}
}