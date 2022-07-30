package Generics;

import java.util.ArrayList;
import java.util.List;

//https://techwithmaddy.com/wildcards-in-java

public class UnBoundedExanple {
	
	
	public void getList(List<?> list)
	{
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		
		UnBoundedExanple ube = new UnBoundedExanple();
		ube.getList(list);
		
	}

}
