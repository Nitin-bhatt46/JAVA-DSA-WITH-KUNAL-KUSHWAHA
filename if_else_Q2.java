/* 2. Age of a person is given, print Adult if his/her age is greater
than 18, otherwise print Teenager..*/
import java.util.Scanner;
public class if_else_Q2{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);

      System.out.println("enter the age if you are above 11 year old");
        System.out.println("Enter the age  ");
        int age = sc.nextInt();
    
         
        if(age>18){
            System.out.println("You are adult");
        }
        else if(18<age)
        {
            System.out.println("you are a teenager");
        }
        sc.close();
    }
}
