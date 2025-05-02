import java.util.Scanner;

public class qn6 {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static boolean isPalindromePrime(int num) {
        return isPrime(num) && isPalindrome(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindromePrime(number)) {
            System.out.println(number + " is a palindrome prime.");
        } else {
            System.out.println(number + " is NOT a palindrome prime.");
        }

        scanner.close();
    }
}
