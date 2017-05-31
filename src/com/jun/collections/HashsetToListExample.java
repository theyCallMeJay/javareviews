package com.jun.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetToListExample {
	public static void main(String[] args){
		Set<String> vowels = new HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		
		//set to list
		List<String> vowelList = new ArrayList<>(vowels);
		System.out.println("vowels set: " + vowels);
		System.err.println("vowe list: " + vowelList);
		
		vowels.add("o");
		vowelList.add("a");
		vowelList.add("u");
		System.out.println("vowels set: " + vowels);
		System.err.println("vowe list: " + vowelList);
		
		//list to set
		vowels = new HashSet<>(vowelList);
		System.out.println("vowels set: " + vowels);
	}
}
