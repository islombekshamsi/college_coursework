import java.util.Scanner;

public class madlibs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1, noun, adjective2, verb, adjective3;

        System.out.println("Enter an adjective (your mood)");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a place");
        noun = scanner.nextLine();
        System.out.println("Enter a adjective (description)");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb (action)");
        verb = scanner.nextLine();
        System.out.println("Enter adjective (description)?");
        adjective3 = scanner.nextLine();

        System.out.println("Today I am feeling " + adjective1);
        System.out.println("That's why I went to the " + noun);
        System.out.println("");
        System.out.println(noun + " was " + adjective2 + " and there I " + verb);
        System.err.println("Now I am " + adjective3); 

        scanner.close();
    }
}