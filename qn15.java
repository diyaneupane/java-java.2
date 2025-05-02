import java.util.Scanner;

public class qn15 {

    public static void countUppercaseLowercase(String str) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
            else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        
        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        countUppercaseLowercase(inputString);

        scanner.close();
    }
}