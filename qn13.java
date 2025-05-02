public class qn13 {

    public static void printMultiplicationTables() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        printMultiplicationTables();
    }
}
