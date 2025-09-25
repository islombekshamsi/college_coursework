import java.util.Scanner;
// program asks the user to enter a temperature value,
// then callls the TemperatureCheck class to evaluate the input
// and prints out the appropriate temperature description
public class MainTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompts the user for temperature input
        System.out.print("Enter the temperature: ");
        int temperature = input.nextInt();
        // creates an object of TemperatureCheck to evaluate the input
        TemperatureCheck tempResult = new TemperatureCheck();
        // Call the tempcheck method and display the result
        System.out.println(tempResult.tempcheck(temperature));
    }
}

/*
1) Enter the temperature: -23
FREEZING

2) Enter the temperature: 23
WARM

3) Enter the temperature: 69
VERY HOT


 */