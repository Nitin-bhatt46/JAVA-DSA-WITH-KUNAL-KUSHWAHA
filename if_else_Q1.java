/* 1. Two numbers are given, print the bigger number, It is given that
both numbers can’t be the same.*/
import java.util.Scanner;
public class if_else_Q1{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);

         System.out.println(" Both number must be different");
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();
         
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(b>a)
        {
            System.out.println("b is greater than a");
        }
        sc.close();
    }
}