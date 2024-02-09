import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int wristBand =21;
        int age= 0;
        String trash ="";
        boolean done= false;
        do
        {
            System.out.print("Enter your age: " );
            if (in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine();
                if (age >= wristBand)
                {
                    System.out.println("You get a wristband!");
                    done = true;
                }
            }
            else
            {
                trash= in.nextLine();
                System.out.println("You entered a invalid number, you put: " +trash);
            }
        } while(!done);
    }
}