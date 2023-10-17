
import java.util.Scanner;

public class Typecheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char a = sc.next().charAt(0);
        if(a >='a' && a<='z'){
            System.out.println("it is small letter");
        }
        else if (a>='A' && a<='Z'){
            System.out.println(" capital letter");
        }
        else{
            System.out.println("invalid entry");
        }

        // casting and conversion

    }
}
