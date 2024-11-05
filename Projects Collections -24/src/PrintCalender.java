import java.util.Scanner;

public class PrintCalender {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.println("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        printCalender(year, month);
        input.close();
    }

    // Whole body calendar
    public static void printCalender(int year, int month) {
        System.out.print("           ");
        monthName(month);
        System.out.println("  " + year);

        System.out.println("-----------------------------------------");
        System.out.println("Sun   Mon   Tues   Wed   Thu   Fri   Sat");
        finalMonth(year, month);
    }

    public static void finalMonth(int year, int month) {  
        int startDay = firstDay(year, month);
        int actualNumberOfDaysInMonth = numberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("      ");
        }

        for (int i = 1; i <= actualNumberOfDaysInMonth; i++) {
            System.out.printf("%-6d", i);

            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Printing Months
    public static void monthName(int month) {
        String neededMonth = "";
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", 
                           "August", "September", "October", "November", "December"};

        for (int i = 0; i < arr.length; i++) {
            if (month == arr[i]) {
                neededMonth = months[i];
                System.out.printf("%s", neededMonth);
            }
        }
    }

    // First day of the month
    public static int firstDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = totalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    // Last day of the months
    public static int numberOfDaysInMonth(int year, int month) {
        int[] arr = {31, 1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int lastDay = arr[month - 1];

        if (lastDay == 1) {
            return isLeapYear(year) ? 29 : 28; // Important use here
        }
        return lastDay;
    }

    public static int totalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total number of days from 1800;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) { // isLeapYear method
                total += 366;
            } else {
                total += 365;
            }
        }

        // Add the days from January to the months prior to the calendar month
        for (int i = 1; i < month; i++) {
            total += numberOfDaysInMonth(year, i);
        }

        return total;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
