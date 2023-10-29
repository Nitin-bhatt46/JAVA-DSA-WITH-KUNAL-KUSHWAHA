
// passing value in the function

import java.util.Scanner;

public class calling_value_func{
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
    int num1,num2;

    System.out.println("enter the number ");
num1= input.nextInt();
 System.out.println("enter the number ");
num2= input.nextInt();
int ans =sum(num1,num2);
input.close();

System.out.println("the sum is :"+ans);
}
    
 static int sum(int a, int b){
    int sum;
sum = a+b;

 return sum ;

 

 }
}
    
