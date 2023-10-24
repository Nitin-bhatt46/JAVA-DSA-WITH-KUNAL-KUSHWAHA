import java.util.Scanner;

public class weekday_end {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day number in a week ");
        int a = input.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("week days");
                break;
            case 6:
            case 7:
                System.out.println("weekend days");
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
