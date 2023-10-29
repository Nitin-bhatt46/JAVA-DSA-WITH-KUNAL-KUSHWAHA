// sum function without return 

import java.util.Scanner;

public class return_fun{
   public static void main (String[] args) {
int ans =sum();

System.out.println("the sum is :"+ans);
}
    
 static int sum(){
    Scanner input = new Scanner(System.in);
    int num1,num2,sum;

    System.out.println("enter the number ");
num1= input.nextInt();
 System.out.println("enter the number ");
num2= input.nextInt();
sum = num1+num2;
input.close();
 return sum ;

 

 }
}
    
