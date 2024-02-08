import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        String menuChoice = "";
        String menu = "D- Democrat\tR- Republican\tI- Independant\t";

        System.out.print(menu);
        menuChoice = in.nextLine();
        if (menuChoice.equalsIgnoreCase("D"))
            System.out.println("You get a Democratic Donkey.");
        else if (menuChoice.equalsIgnoreCase("R"))
            System.out.println("You get a Republican Elephant.");
        else if (menuChoice.equalsIgnoreCase("I"))
            System.out.println("You get an Independent Person.");
        else {
            System.out.println("You choose other.");
        }
    }
}