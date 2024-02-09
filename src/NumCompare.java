import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        int num1 =0;
        int num2 =0;
        boolean done= false;
        String trash= "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter first number: ");
            if (in.hasNextInt())
            {
                num1 = in.nextInt();
                in.nextLine();
                done =true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please try again!");
            }
        }while (!done);
        done=false;
        do {
            System.out.print("Enter second number: ");
            if (in.hasNextInt())
            {
                num2 = in.nextInt();
                in.nextLine();
                done =true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please try again!");
            }
        }while (!done);

        if (num1==num2)
        {
            System.out.println("These two numbers are equal!");
        }
        else if (num1<num2)
        {
            System.out.println("The first number is less than the second number.");
        }
        else
        {
            System.out.println("The second number is less than the first number.");
        }
    }
}
