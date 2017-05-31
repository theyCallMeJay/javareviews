/*Java HashSet is the most popular implementation of Set interface. 
java.util.HashSet is backed by a HashMap. 
HashSet extends AbstractSet class and implements Set, Cloneable and Serializable interfaces.

features:
	HashSet doesn’t allow duplicate entries.
	HashSet allows null as a value.
	HashSet doesn’t guarantee the insertion order of elements.
	HashSet is not thread-safe. You can get thread-safe HashSet using Collections.synchronizedSet method at the cost of performance. You can also use CopyOnWriteArraySet concurrency class for thread safety.
	HashSet iterator methods are fail-fast. So any structural modification to the set after creation of iterator will throw ConcurrentModificationException.
	HashSet supports Generics, this is the recommended approach to avoid ClassCastException at runtime.
	HashSet uses HashMap for storing elements, so the objects should provide good implementation of hashCode() and equals() method to avoid unwanted results.
*/

package com.jun.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetExample {
	public static void main(String[]  args){
		
		Set<String> fruits = new HashSet<>();
		
		//add
		fruits.add("Apple");
		fruits.add("Banana");
		
		//isempty
		System.out.println("fruit set is empty " + fruits.isEmpty());
		
		//contains
		System.out.println("fruit set contains apple: " + fruits.contains("Apple"));
		
		//remove
		System.out.println("remove apple from set: " + fruits.remove("Apple"));
		System.out.println("remove mango from set: " + fruits.remove("Mango"));
		
		//size
		System.out.println("the size of the set: " + fruits.size());
		
		//addall
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		
		System.out.println("fruits set before add all: " + fruits);
		System.out.println("list: " + list);
		fruits.addAll(list);
		
		System.out.println("fruit set after add all: " + fruits);
		
		//removeall
		fruits.add("Orange");
		System.out.println("fruit set before removeAll: " + fruits);
		System.out.println("list: " + list);
		fruits.removeAll(list);
		
		System.out.println("fruit set after removeAll: " + fruits);
		
		//clear
		fruits.clear();
		System.out.println("the set is empty: " + fruits.isEmpty());
		
		
		
	}
}
