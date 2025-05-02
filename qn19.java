import java.util.Scanner;

public class qn19 {

    public static int getAsciiValue(char character) {
        return (int) character;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        int asciiValue = getAsciiValue(inputChar);
        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

        scanner.close();
    }
}
