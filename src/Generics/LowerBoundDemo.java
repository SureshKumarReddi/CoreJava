package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundDemo {

	public static void main(String[] args) {
		 
		List<Number> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		LowerBound obj = new LowerBound();
		obj.display(list);
	}

}


class LowerBound{
	
	public void display(List<? super Integer> list) {
		 //this will accepts only the super class of Integer and
		//subclass of Integer
	}
}