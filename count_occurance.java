
import java.util.Scanner;

public class count_occurance {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int a = input.nextInt();
        int rem, count=0;
        int num = a;
        while (num > 0) {
            rem = num % 10;// 2 ,1
          if( rem == 9){
            count ++;
          }
            num /= 10; // 1, 0
          
        }

        System.out.println(count);
        input.close();
    }
}
