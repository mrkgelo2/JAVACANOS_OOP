package javacanos.oop.activity2;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner results = new Scanner(System.in);
        
        System.out.print("enter a number plz:");
        int num = results.nextInt();
        
        if (num > 0) {
            System.out.println("congrats its positive");
        } else if (num < 0) {
            System.out.println("Oh no its negative");
        } else {
            System.out.println("the number is zero");
        }
		results.close();
	}

}
