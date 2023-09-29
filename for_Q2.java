// Odd numbers from 1 to n,
import java.util.*;
public class for_Q2 {
public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number till you want odd number");
    int num =sc.nextInt();

    for(int a=1;a<=num;a++){
        if(a%2!=0){
    System.out.println("odd number"+a);
        }    
}
    
    sc.close();
}
    
}
