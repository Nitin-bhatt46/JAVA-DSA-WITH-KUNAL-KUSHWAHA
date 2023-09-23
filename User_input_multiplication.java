import java.util.Scanner;
public class User_input_multiplication {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        int c=a*b;
        System.out.println(a+"*"+b+"="+c);
    }
}
