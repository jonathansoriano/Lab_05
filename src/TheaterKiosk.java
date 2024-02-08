import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int wristBand =21;
        int age= 0;

        System.out.print("Enter your age: ");
        age = in.nextInt();
        if (age >= wristBand)
        {
            System.out.println("You get a wristband!");
        }
    }
}