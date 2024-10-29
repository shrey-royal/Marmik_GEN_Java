import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        // A leap year is divisible by 4
        // but not divisible by 100 unless it is also divisible by 400
        if (year % 4 == 0) {
            if(year % 100 == 0) {
                isLeapYear = (year % 400 == 0);
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
