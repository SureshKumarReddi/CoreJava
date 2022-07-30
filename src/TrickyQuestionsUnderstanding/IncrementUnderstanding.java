package TrickyQuestionsUnderstanding;

public class IncrementUnderstanding {

// this is pass by value example quiz asked in plural sight
	
	public static void main(String[] args) {
		int count =0;
		increment(count);
		System.out.println("before incrementing " +count);
		count++;
		System.out.println("count " + count);
	}

	private static void increment(int count) {
		count++;
		System.out.println("Countinside the method " +count);
	}

}
