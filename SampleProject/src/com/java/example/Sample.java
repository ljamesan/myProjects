package com.java.example;

public class Sample {
	
	static Sample sample = new Sample();
	
	private Sample() {
		
	}
	
	public static Sample getExample() {
		return sample;
	}
	
	private void draw() {
		System.out.println("draw");
	}
	
	public static void main(String[] args) {
		Sample s = Sample.getExample();
		s.draw();
		
	}

}
