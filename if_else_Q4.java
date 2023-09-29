// dicount age <12 give 65 % discount
import java.util.Scanner;

public class if_else_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age to get 65% discount");
        int age = sc.nextInt();

        if (age > 0 && age <= 12) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}