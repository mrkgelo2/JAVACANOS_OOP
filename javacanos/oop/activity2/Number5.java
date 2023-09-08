package javacanos.oop.activity2;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner week = new Scanner(System.in);
        System.out.print("please enter a number  from 1-7: ");
        int num = week.nextInt();
        
        String nameofWeek = getName(num);
        
        if (nameofWeek != null) {
            System.out.println(nameofWeek);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        week.close();
	}

	public static String getName(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return null;
        }
    }
}
