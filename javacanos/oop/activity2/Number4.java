package javacanos.oop.activity2;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		
		System.out.print("Enter a number: "+ Math.abs(num));
		
		
        if (num == 0) {
            System.out.println("The number is Zero");
        } else if (num > 0) {
            if (Math.abs(num) < 1) {
                System.out.println("The number is Positive small");
            } else if (num > 1000000) {
                System.out.println("The number is Positive large");
            } else {
                System.out.println("The number is Positive");
            }
        } else {
            if (Math.abs(num) < 1) {
                System.out.println("The number is Negative small");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("The number is Negative large");
            } else {
                System.out.println("The number is Negative");
            }
        }
        input.close();
	}

}
