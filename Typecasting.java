import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();
        System.out.println(num);


        // typecasting :-
        // narrowing conversion float to int
        int  n=(int)(64.25f);
        System.out.println(n);
        // automatic type promotion in expression
         int a=257;
         byte b =(byte)(a); // 257%256 =1
         System.out.println(b);
        
         // java is unicode

         char c = 65 ;
         System.out.println(c);
    }
}
