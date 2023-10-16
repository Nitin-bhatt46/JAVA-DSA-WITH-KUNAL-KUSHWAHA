import java.util.Scanner;
public class Condition_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary");
        int salary =input.nextInt();

        if(salary>=500){
            System.out.println("you bonus is ="+(salary+250));
        }
        else{
            System.out.println("your salary is "+ (salary+100));
        }
    }
}
