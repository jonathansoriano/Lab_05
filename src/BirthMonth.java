import java.util.Scanner;

import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        boolean done= false;
        do {
            System.out.print("Enter your birth month [1 - 12]: ");

            if (in.hasNextInt())
            {
                birthMonth = in.nextInt();
                in.nextLine();
                if (birthMonth >= 1 && birthMonth <= 12)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You entered an incorrect month value: " + birthMonth);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an incorrect month value: " + trash);
            }
        }
        while (!done);

        System.out.println("Your birth month is " + birthMonth);
    }
}
