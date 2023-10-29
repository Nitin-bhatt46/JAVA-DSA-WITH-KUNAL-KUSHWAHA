// sum function without return 

import java.util.Scanner;

public class fun{
   public static void main(String[] args) {
sum();
   }
    
 static void sum(){
    Scanner input = new Scanner(System.in);
    int num1,num2,sum;

    System.out.println("enter the number ");
num1= input.nextInt();
 System.out.println("enter the number ");
num2= input.nextInt();

 sum = num1+num2;
 System.out.println("the sum "+ sum);

 input.close();

 }
}
    
 



