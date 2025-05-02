import java.util.Scanner;

public class qn11 {

    public static int calculateCube(int num) {
        return num * num * num; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int cube = calculateCube(number);
        System.out.println("The cube of " + number + " is: " + cube);

        scanner.close();
    }
}
