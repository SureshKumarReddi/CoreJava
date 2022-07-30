package DesignPatterns;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonBreaking2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// here we will do serialization

		Employee obj = new Employee(101, "Suresh Kumar Reddy");
		FileOutputStream p = new FileOutputStream("/Users/sresh/Desktop/File.txt");
		ObjectOutputStream output = new ObjectOutputStream(p);
		output.writeObject(obj);
		System.out.println("Object saved successfully");
		
		//now we will deserialize the saved obj and compare both of the hashcodes
		
		FileInputStream file = new FileInputStream("/Users/sresh/Desktop/File.txt");
		ObjectInputStream input = new ObjectInputStream(file);
		Employee emp = (Employee)input.readObject();
		
		
		System.out.println("*****Now comparing the hashcodes of 2 objects");
		System.out.println(obj.hashCode());
		System.out.println("Deserialized object "  +emp.hashCode());
	}

}

class Employee implements Serializable{
	private int id;
	private String name;

	Employee() {
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}