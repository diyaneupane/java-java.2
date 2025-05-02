import java.util.Scanner;
public class qn1{
    public static void oddNumber(int num){
        for(int i=1; i<=num; i ++){
           if(i%2!=0){
              System.out.println(i);
          }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        oddNumber(num);
        sc.close();
 
    }
}