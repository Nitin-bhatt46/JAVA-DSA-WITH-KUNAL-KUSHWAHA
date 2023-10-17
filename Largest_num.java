import java.util.Scanner;

public class Largest_num {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("enter the numbers");
int a= input.nextInt();
int b= input.nextInt();
int c= input.nextInt();


if(a>b){
    if(a>c){
        System.out.println("a is the greatest");
    }
    else{
        System.out.println("c is the greatest");
    }
}
else{
     if(b>c){
    System.out.println("b is the greatest");

}
else{
    System.out.println("c is the greatest.");
}
}
  

}
}