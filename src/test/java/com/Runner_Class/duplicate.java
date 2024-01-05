package com.Runner_Class;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicate {
	public static void main(String[] args) {
	
	
	String firstword = "oh my god . oh my.";
	String[] word = firstword.split(" ");
	Map<String, Integer> secondword = new HashMap<String,Integer>();
	for (String String:word) {
		if (secondword.containsKey(String))
		{
			Integer thirdword = secondword.get(String);
			secondword.put(String, thirdword+1);}
		else
		{
		secondword.put(String,1);
		}
		} System.out.println("dupicate word = ");

		 Set<Entry<String, Integer>> entrySet = secondword.entrySet();
		for (Entry<String, Integer> s : entrySet){
			
				if(s.getValue()>1) {
					String key = s.getKey(); 
					 Integer value=s.getValue();
				System.out.println(key+"="+value);
				}
			}
		} 
}
