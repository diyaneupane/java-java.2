import java.util.Scanner;

public class qn14 {

    public static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10; 
            sum += digit * digit; 
            num /= 10;
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of the digits of " + number + " is: " + result);

        scanner.close();
    }
}
}
