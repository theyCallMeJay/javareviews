/*Java HashMap is one of the most popular Collection classes in java. 
Java HashMap is Hash table based implementation. HashMap extends AbstractMap class that implements Map interface.
Java HashMap allows null key and null values.
HashMap is not an ordered collection. You can iterate over HashMap entries through keys set but they are not guaranteed to be in the order of their addition to the HashMap.
HashMap is almost similar to Hashtable except that it’s unsynchronized and allows null key and values.
HashMap uses it’s inner class Node<K,V> for storing map entries.
HashMap stores entries into multiple singly linked lists, called buckets or bins. Default number of bins is 16 and it’s always power of 2.
HashMap uses hashCode() and equals() methods on keys for get and put operations. So HashMap key object should provide good implementation of these methods. This is the reason immutable classes are better suitable for keys, for example String and Interger.
Java HashMap is not thread safe, for multithreaded environment you should use ConcurrentHashMap class or get synchronized map using Collections.synchronizedMap() method.*/

package com.jun.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", null);
		map.put(null, "100");
		
		String value = map.get("3");
		System.out.println("key = 3, value = " + value);
		
		value = map.getOrDefault("5", "Default value");
		System.out.println("key = 5, value = " + value);
		
		boolean keyExists = map.containsKey(null);
		boolean valueExists = map.containsValue("100");
		System.out.println("key exists: " + keyExists + ", " + "value exists: " + valueExists);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		System.out.println("map size = " + map.size());
		
		Map<String, String> map1 = new HashMap<>();
		map1.putAll(map);
		System.out.println("map1 mappings = " + map1);
		
		String nullKeyValue = map1.remove(null);
		System.out.println("map null key value = " + nullKeyValue);
		System.out.println("map1 after removing null key = " + map1);
		
		Set<String> keySet = map.keySet();
		System.out.println("map keys = " + keySet);
		
		Collection<String> values = map.values();
		System.out.println("map values = " + values);
		
		map.clear();
		System.out.println("map is empty: " + map.isEmpty());
		
		
	}
}
