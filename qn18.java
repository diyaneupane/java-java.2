import java.util.Scanner;

public class qn18 {

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " "); 
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second; 
            System.out.print(nextTerm + " "); 
            first = second; 
            second = nextTerm; 
        }
        
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        generateFibonacci(n);

        scanner.close();
    }
}
