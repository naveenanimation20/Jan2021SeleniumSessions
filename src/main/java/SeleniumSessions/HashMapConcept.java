package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		
		//collection -- dynamic
		//stores values -K,V
		//can have only one null key
		//can have any number of null values
		
		Map<String, String> empMap = new HashMap<String, String>();
		empMap.put("name", "Tom");
		empMap.put("ID", "101");
		empMap.put("city", "Bangalore");
		empMap.put("Country", "IN");
		empMap.put(null, "selenium");
		empMap.put(null, "QTP");
		empMap.put("phone", null);
		empMap.put("address", null);
		empMap.put("name", "Lisa");


		System.out.println(empMap.get("name"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("phone"));
		
		//to iterate map:
		//entryset: to fetch all key-values:
		for(Map.Entry<String, String> entry : empMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
		}
		
		//keySet(): for getting the keys
		for(String s : empMap.keySet()) {
			System.out.println("Key = " + s);
		}
		
		//values(): for getting the values
		for(String v : empMap.values()) {
			System.out.println("value = " +v);
		}
		
		//Lambda:
		empMap.forEach((k,v) -> System.out.println("Key = " + k + " value = " +v));


		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		
		

		
		
	}

}
