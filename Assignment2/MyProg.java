import java.util.Scanner;

public class MyProg {
    public static void main(String[] args) {
        // create scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your company name: ");
        String companyName = input.nextLine();

        // new accountant object
        Accountant acc = new Accountant(age, name, companyName);

        acc.getFields();
        acc.printSalary();

        input.close();
    }
}

/*
Output:
Enter your name: John
Enter your age: 45
Enter your company name: compToday
Name: John,     Age: 45,     Company Name: compToday
Salary: $112815.58

 */