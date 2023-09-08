package javacanos.oop.activity2;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner (System.in);	
		
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter Third Number");
		int num3 = scanner.nextInt();
		
		if(num1>num2 && num1>num3) {
			
			System.out.println("The Greatest number is:" + num1);
		}
		
		else if(num2>num3) {
			
			System.out.println("The Greatest number is:" + num2);
		}
		
		else{
			System.out.println("The Greatest number is:" + num3);
			
		}
		scanner.close();
	}

}
