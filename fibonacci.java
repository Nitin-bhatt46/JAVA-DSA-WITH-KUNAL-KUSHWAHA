
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number till you want output : ");
        int n = input.nextInt();
        int i0 = 0;
        int i1 = 1;
int temp = 0;

        for(int i=0 ;i<n;i++){
            System.out.println(i0);
            temp=i0+i1;
            i0=i1;
            i1=temp;

        }



    }
}
