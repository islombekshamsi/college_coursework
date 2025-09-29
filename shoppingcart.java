import java.util.Scanner;

public class shoppingcart{
    public static void main(String[] args){
        String object;
        double price;
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you planning to buy? ");
        object = scanner.nextLine();
        System.out.println("How much is it? ");
        price = scanner.nextDouble();
        System.out.println("How many are you buying? ");
        quantity = scanner.nextInt();
        total = price * quantity;

        System.out.printf("Your total for %d %s (s) is going to be %.0f", quantity, object, total);

        scanner.close();
    }
}