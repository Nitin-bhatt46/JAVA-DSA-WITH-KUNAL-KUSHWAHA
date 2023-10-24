import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("employee Id");
        int emp_id = input.nextInt();
        System.out.println("enter your department");
        String depart = input.next();
        switch (emp_id) {
            case 1:
                System.out.print("Welcome :");
                System.out.println("khan sir");
                System.out.println("YOUR ID"+emp_id);

                switch (depart) {
                    case "IT":
                        System.out.println("YOU ARE IT DEPARTMENT");
                        break;
                    case "Management":
                        System.out.println("YOU ARE Management DEPARTMENT");
                        break;
                }
                break;
            case 2:
               System.out.print("Welcome :");
                System.out.println("rakesh sir");
                System.out.println("YOUR ID"+emp_id);

                switch (depart) {
                    case "IT":
                        System.out.println("YOU ARE IT DEPARTMENT");
                        break;
                    case "Management":
                        System.out.println("YOU ARE Management DEPARTMENT");
                        break;
                }
                break;
            case 3:
                System.out.print("Welcome :");
                System.out.println("mahesh sir");
               System.out.println("YOUR ID"+   emp_id);

                switch (depart) {
                    case "IT":
                        System.out.println("YOU ARE IT DEPARTMENT");
                        break;
                    case "Management":
                        System.out.println("YOU ARE Management DEPARTMENT");
                        break;
                }
                break;
            
            default:
                System.out.println("wrong input");
        }
    }
}
