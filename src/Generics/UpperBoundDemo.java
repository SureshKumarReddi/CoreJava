package Generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundDemo {

	public static void main(String[] args) {
		
		List<Number> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		UpperBound obj = new UpperBound();
		//obj.display(list);
		
	}
}


class UpperBound{
	
	public void display(List<? extends Integer> list) {
		//this method which will accepts only subclass of Integer and Integer only
	}
}