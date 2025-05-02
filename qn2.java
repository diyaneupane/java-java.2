import java.util.Scanner;

public class qn2 {

    public static void convertDays(int totalDays) {
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Equivalent time:");
        System.out.println(years + " year(s), " + months + " month(s), " + days + " day(s)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        convertDays(days);

        scanner.close();
    }
}