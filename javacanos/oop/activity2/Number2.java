package javacanos.oop.activity2;

import java.util.Scanner;


public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input c: ");
        double c = input.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if(discriminant > 0) {
        	double root1,root2;
        	
        	root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }else if(discriminant == 0) {
        	double root;
        	
        	root = -b / (2 * a);
            System.out.println("The root is: " + root);
        }else {
        	System.out.println("The input numbers has no real roots.");
        }
		
		
		input.close();
	}

}
