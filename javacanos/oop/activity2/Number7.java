package javacanos.oop.activity2;

import java.util.Scanner;

public class Number7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {
            " ", "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        System.out.print("Enter a month number: ");
        int monthNumber = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number");
        }

        if (monthNumber == 2 && isLeapYear(year)) {
            days[monthNumber] = 29;
        }

        System.out.println(months[monthNumber] + " " + year + " has " + days[monthNumber] + " days");
        
        scanner.close();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
