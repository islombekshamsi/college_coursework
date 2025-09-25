import java.util.Scanner;

// program takes a student's mark as input and prints the
// corresponding grade based on fixed grading scale
public class Activity_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter student mark
        System.out.print("Enter the student mark from 1-100: ");
        int mark = input.nextInt();
        //Check grade ranges
        if (mark >= 1 && mark < 50)
            System.out.println("F");
        else if (mark >= 50 && mark <= 60)
            System.out.println("E");
        else if (mark >= 61 && mark <= 70)
            System.out.println("D");
        else if (mark >= 71 && mark <= 80)
            System.out.println("C");
        else if (mark >= 81 && mark <= 90)
            System.out.println("B");
        else if (mark >= 91 && mark <= 100)
            System.out.println("A");
        else
            // Input is invalid if it's not between 1 and 100
            System.out.println("Enter number between 1 and 100");
    }
}

/*
Sample Output:
1)Enter the student mark from 1-100: 69
D

2) Enter the student mark from 1-100: -1
Enter number between 1 and 100

3)Enter the student mark from 1-100: 101
Enter number between 1 and 100

 */