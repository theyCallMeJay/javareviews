package com.jun.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashmapForeachExample {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "1");
		map.put("2", null);
		map.put(null, "100");
		
		/*BiConsumer<String, String> action = new MyBiConsumer();
		map.forEach(action);*/
		System.out.println("\nHashMap forEach lambda example\n");
		map.forEach((k, v) -> {System.out.println("key = " + k + ", " + "value = " + v);});
		
	}
	
	class MyBiConsumer implements BiConsumer<String, String>{

		@Override
		public void accept(String t, String u) {
			System.out.println("key = " + t);
			System.out.println("processing on value = " + u);
		}
		
	}
}
