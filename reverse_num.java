import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int a = input.nextInt();
        int rem, ans=0;
        int num = a;
        while (num > 0) {
            rem = num % 10;// 2 ,1
            num /= 10; // 1, 0
           ans = rem + ans * 10 ; // 2 , 21
        }

        System.out.println(ans);
        input.close();
    }

}
