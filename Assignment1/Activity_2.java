import java.util.Scanner;

// program reads a temperature value from the user and classifies
// into temperature description categories using if-else conditions

public class Activity_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt user to enter a temperature value
        System.out.print("Enter the temperature: ");
        int temperature = input.nextInt();
        // check ranges and display corresponding category
        if (temperature < 0)
            System.out.println("FREEZING");
        else if (temperature <= 15)
            System.out.println("COLD");
        else if (temperature <= 30)
            System.out.println("WARM");
        else if (temperature <= 40)
            System.out.println("HOT");
        else
            System.out.println("VERY HOT");
    }
}

/*
Sample Output:
1) Enter the temperature: 20
WARM

2) Enter the temperature: -69
FREEZING

3) Enter the temperature: 69
VERY HOT
 */