package TrickyQuestionsUnderstanding;

//quiz from pluralsight does which constructor executed?

public class Holder {

	
	public static void main(String[] args) {
		Demo d = new Demo(20);
	}
}

class Demo{
	
	private int size = 10;
	
	Demo(){
	System.out.println("default constructor called ");	
	}
	
	Demo(int size){
		System.out.println("Parameterized constructor called ");
		this.size = size;
	}
}