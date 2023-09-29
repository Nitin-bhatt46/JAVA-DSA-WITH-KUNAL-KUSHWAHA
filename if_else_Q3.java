/* 3. Take a number in input (ex n) and print the corresponding
month to it. Ex: for n=1, print january, n=2, print feburary like
this you need to give output. It is given that n will be greater
than 0 and less than 13..*/
import java.util.Scanner;
public class if_else_Q3{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter the month nummber [1 to 12]");
        int month = sc.nextInt();
    
         
        if(month == 1){
            System.out.println("January");
        }
        else if(month == 2)
        {
            System.out.println("February");
        }
        else if(month == 3)
        {
            System.out.println("March");
        }
        else if(month == 4)
        {
            System.out.println("April");
        }
        else if(month == 5)
        {
            System.out.println("May");
        }
        else if(month == 6)
        {
            System.out.println("June");
        }
        else if(month == 7)
        {
            System.out.println("July");
        }
        else if(month == 8)
        {
            System.out.println("august");
        }
        else if(month == 9)
        {
            System.out.println("september");
        }
        else if(month == 10)
        {
            System.out.println("october");
        }
        else if(month == 11)
        {
            System.out.println("November");
        }
        else if(month == 12)
        {
            System.out.println("December");
        }
        else{
            System.out.println("not valid");
        }

        sc.close();
    }
}