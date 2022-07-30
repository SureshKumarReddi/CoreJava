package TrickyQuestionsUnderstanding;

public class GenerateRandomNumberInRange {

	public static void main(String[] args) {
	
		randomNumberBetween(10,20);
		
	}

	private static void randomNumberBetween(int min, int max) {
		
		//logic 
		
		int random = (int)(Math.random() * (max-min)) + min;
		System.out.println(random);
	}

}

//Math.random() gives the double value which is greater than 0.0  and lessthan 1.0