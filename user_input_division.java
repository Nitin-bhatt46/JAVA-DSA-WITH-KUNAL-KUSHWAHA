import java.util.Scanner;
public class user_input_division {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number");
    int a= sc.nextInt();
    System.out.print("enter the number");
    int b= sc.nextInt();
    float d= a/b;
    System.out.println(a+"/"+b+"="+d);  
 }   
}
