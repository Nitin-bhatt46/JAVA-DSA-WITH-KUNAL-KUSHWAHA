// all numbers from 1 to n, which is divisible by 4.
import java.util.*;
public class for_Q3 {
public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number till you want to find which are divisible by 4");
    int num =sc.nextInt();
System.out.println("divisible by 4 till = "+num);
    for(int a=1;a<=num;a++){
        if(a%4==0){
    System.out.println("divisible by 4 = "+a);
        }    
}
    
    sc.close();
}
    
}
