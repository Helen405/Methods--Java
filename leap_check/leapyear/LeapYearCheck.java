package leapyear;

import java.util.Scanner;

public class LeapYearCheck {
    public void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("The year you entered is " + (isLeap ? "" : "not ") + "a leap year.");
    }
}
