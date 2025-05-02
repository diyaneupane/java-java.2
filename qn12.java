import java.util.Scanner;

public class qn12 {

    public static boolean isDuckNumber(int num) {
        String numStr = Integer.toString(num);
        
        if (numStr.charAt(0) == '0') {
            return false; 
        }
        
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is NOT a Duck number.");
        }

        scanner.close();
    }
}
