package com.demo;

public class Employee {
	
 Employee(){
	 System.out.println("default constructor");
 }
	
	Employee(int a){
		System.out.println("single argumentconstructor called " +a);
	}
	
	 
	
	
	public void display() {
		System.out.println("Employee method");
	}
}
