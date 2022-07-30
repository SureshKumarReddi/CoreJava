package com.demo;

public class SwitchDemo {

	public static void main(String[] args) {

		int i = 2;

		switch (i) {
		case 1:
			System.out.println("january calculation");
			//break;
		case 2:
			System.out.println("feb calculation");

			//break;
		case 3:
			System.out.println("march calculaction");

			//break;

		default:
			System.out.println("default case");
			//break;
		}

		char c = '+';

		switch (c) {
		case '+':
			System.out.println("vowel letter ++++++");
			break;

		case 115:
			System.out.println("vowel letter");
			break;
		case 'i':
			System.out.println("vowel letter");
			break;
		case 'o':
			System.out.println("vowel letter");
			break;
		case 'u':
			System.out.println("vowel letter");
			break;

		default:
			System.out.println("Given character is not vowel");
			break;
		}

		switch (Something.FRIDAY) {

		case SUNDAY:
			System.out.println("sunday");
			break;

		case MONDAY:
			System.out.println("monday");
			break;
		case TUESDAY:
			System.out.println("tuesday");
			break;
		case WEDNESDAY:
			System.out.println("wednesday");
			break;

		default:
			System.out.println("No day ");
			break;
		}

		String str = "word";
		switch (str) {
		case "word":
			System.out.println("word found ");
			break;
			
		case "hello":
			System.out.println("hello found ");
			break;


		default:
			System.out.println("default case");
			break;
		}
		System.out.println("after exitied switch case");
	}

}
