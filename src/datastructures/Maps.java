package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		Map<Integer,String> hMap = new LinkedHashMap<Integer,String>();
		mapUtil(hMap);
	}
	
	public static void mapUtil(Map<Integer,String> map) {
		// 1. add key-value pairs
		map.put(101,"Steve");
		map.put(502,"Justin");
		map.put(302,"Jennifer");
		map.put(102,"Bob");
		
		// 2. expose/access elements
		System.out.println("see all the keys: " + map.keySet());
		System.out.println("see all key-value pairs: " + map);
		System.out.println(map.get(502));
		
		// 3. iterate through a map of key-value pairs
		for (int key : map.keySet()) {
			System.out.println("[key:" + key + " value:" + map.get(key) + "]");
		}
	}

}
