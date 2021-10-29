package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int number = scanner.nextInt();
            LeapYear leapYear = new LeapYear(number);
            System.out.println("Is leap year = " + leapYear.isLeapYear(number));
        } else {
            System.out.println("Invalid number");
        }
        scanner.nextLine();
        scanner.close();
    }
}
