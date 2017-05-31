package com.jun.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HashmapReplaceAllExample {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put(null, "100");
		
		System.out.println("map before replaceall: " + map);
		BiFunction<String, String, String> function = new MyBiFunction();
		map.replaceAll(function);
		System.out.println("map after replaceall: " + map);
	}
	
}

class MyBiFunction implements BiFunction<String, String, String>{

	@Override
	public String apply(String t, String u) {
		if (t != null) {
			return t + u;
		}else {
			return u;
		}
	}
	
}
