package com.java.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Example {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Iterator<Integer> it =list.iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		
		
		Myconsumer cons = new Myconsumer();
		list.forEach(cons);
         
	}

}

class Myconsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Class: "+t);
		
	}
	
}
