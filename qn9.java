import java.util.Scanner;

public class qn9 {

    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = findSum(n);
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
