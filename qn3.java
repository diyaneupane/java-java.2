import java.util.Scanner;

public class qn3 {

    public static boolean isHarshad(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return original % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        }
    }
}