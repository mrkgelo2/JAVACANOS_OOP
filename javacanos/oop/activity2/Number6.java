package javacanos.oop.activity2;

import java.util.Scanner;

public class Number6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter First Number");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter Second Number");
		double num2 = scanner.nextDouble();
		
		if(num1==num2) {
			System.out.println("Both Number are equal");
				
			}
			
			else {
				System.out.println("Both number is not equal");
			}
		
		scanner.close();
	}

}
