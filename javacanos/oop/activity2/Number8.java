package javacanos.oop.activity2;

import java.util.Scanner;

public class Number8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a letter: ");
		String userInput = input.nextLine();

		if(userInput.length() == 1) {
			char letter = userInput.charAt(0);
			if((letter >= 'a' && letter <= 'z')||(letter >= 'A' && letter <= 'Z') ) {
				if((letter == 'a') ||(letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u') || (letter == 'A') || (letter == 'E') ||(letter == 'I') || (letter == 'O') || (letter == 'U')){
					System.out.println("The letter is Vowel");
				}else {
					System.out.println("The letter is Consonant");
				}
			}else {
				System.out.println("Error, Input is not a letter");
			}
			
		}else {
			System.out.println("Error, Please input a single letter.");
		}
		input.close();
	}
}
