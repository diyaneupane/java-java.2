import java.util.Scanner;

public class qn17 {

    public static int reverseNumber(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit; 
            num /= 10;                    
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
