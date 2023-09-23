import java.util.Scanner;

public class User_input_substract {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sub=a-b;
        System.out.println(a+"-"+b+"="+sub);
    }
    
}
