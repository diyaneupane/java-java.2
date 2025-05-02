import java.util.Scanner;

public class qn16 {

    public static boolean isKaprekar(int num) {
        int square = num * num;  
        int numDigits = Integer.toString(num).length();  
        int rightPart = square % (int) Math.pow(10, numDigits);  
        int leftPart = square / (int) Math.pow(10, numDigits);   

        if (leftPart == 0) {
            leftPart = 0;
        }

        return (leftPart + rightPart == num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is NOT a Kaprekar number.");
        }

        scanner.close();
    }
}