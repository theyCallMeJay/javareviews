package com.jun.collections;

import java.beans.Customizer;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample {
	public static void main(String[] args){
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 7; i++) {
			integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		
		for (int i = 0; i < 7; i++) {
			Integer in = integerPriorityQueue.poll();
			System.out.println("processing integer: " + in);
		}
		
		Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
		addDataToQueue(customerPriorityQueue);
		pollDataFromQueue(customerPriorityQueue);
		
	}
	
	
	public static Comparator<Customer> idComparator = new Comparator<Customer>() {
		
		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getId() - o2.getId();
		}
	};
	
	public static void addDataToQueue(Queue<Customer> customerPriorityQueue){
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			int id = rand.nextInt(100);
			customerPriorityQueue.add(new Customer(id, "Jun" + id));
		}
	}
	
	private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue){
		while (true) {
			Customer cust = customerPriorityQueue.poll();
			if (cust == null) {
				break;
			}else {
				System.out.println("Processing customer with ID: " + cust.getId());
			}
		}
	}
}
