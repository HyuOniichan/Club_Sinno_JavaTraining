// 5.4
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (full name, abbreviation, or number): ");
        String monthInput = scanner.nextLine().trim();

        System.out.print("Enter the year (non-negative integer): ");
        String yearInput = scanner.nextLine().trim();

        // Validate year
        if (!isValidYear(yearInput)) {
            System.out.println("Invalid year.");
            return;
        }

        int year = Integer.parseInt(yearInput);

        // Determine the number of days in the specified month
        int days = getDaysInMonth(monthInput, year);

        if (days == -1) {
            System.out.println("Invalid month input.");
        } else {
            System.out.println("Number of days in " + monthInput + " " + year + ": " + days);
        }

        scanner.close();
    }

    private static boolean isValidYear(String yearInput) {
        return yearInput.matches("\\d{1,4}") && Integer.parseInt(yearInput) >= 0;
    }

    private static int getDaysInMonth(String monthInput, int year) {
        // Months array for days in each month (1-indexed for convenience)
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if input is a number
        try {
            int monthNumber = Integer.parseInt(monthInput);
            if (monthNumber >= 1 && monthNumber <= 12) {
                return getDaysInMonthByNumber(monthNumber, year);
            }
        } catch (NumberFormatException e) {
            // Not a number, continue to check string inputs
        }

        // Check month name or abbreviation
        switch (monthInput.toLowerCase()) {
            case "january":
            case "jan":
            case "jan.":
                return daysInMonth[1];
            case "february":
            case "feb":
            case "feb.":
                return isLeapYear(year) ? 29 : daysInMonth[2];
            case "march":
            case "mar":
            case "mar.":
                return daysInMonth[3];
            case "april":
            case "apr":
            case "apr.":
                return daysInMonth[4];
            case "may":
                return daysInMonth[5];
            case "june":
            case "jun":
            case "jun.":
                return daysInMonth[6];
            case "july":
            case "jul":
            case "jul.":
                return daysInMonth[7];
            case "august":
            case "aug":
            case "aug.":
                return daysInMonth[8];
            case "september":
            case "sep":
            case "sep.":
                return daysInMonth[9];
            case "october":
            case "oct":
            case "oct.":
                return daysInMonth[10];
            case "november":
            case "nov":
            case "nov.":
                return daysInMonth[11];
            case "december":
            case "dec":
            case "dec.":
                return daysInMonth[12];
            default:
                return -1; // Invalid month
        }
    }

    private static int getDaysInMonthByNumber(int month, int year) {
        // Return days based on month number
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}[month];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
