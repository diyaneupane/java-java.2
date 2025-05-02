import java.util.Scanner;

public class qn5 {

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100, time);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        double amount = calculateCompoundInterest(principal, rate, time);
        double interest = amount - principal;

        System.out.printf("Total amount after %.1f years: $%.2f%n", time, amount);
        System.out.printf("Compound interest earned: $%.2f%n", interest);
    }
}