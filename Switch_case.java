import java.util.Scanner;
public class Switch_case {
  

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        System.out.println("enter the fruit name");
        System.out.println("Mango");
        System.out.println("Orange");
        String fruit = in.next();

       switch(fruit){
        case "Mango":
            System.out.println("king of fruit");
            break;
        case "Orange":
        System.out.println("a round fruit");
        break;
        default:
        System.out.println("please enter the valid fruit");    
       }
    }
}
    
