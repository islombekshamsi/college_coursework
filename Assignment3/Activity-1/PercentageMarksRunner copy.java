import java.util.Scanner;
public class PercentageMarksRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student 1 marks: ");
        PercentageMarks student1 = readStudent(input);
        System.out.print("Enter student 2 marks: ");
        PercentageMarks student2 = readStudent(input);
        student1.computePercentage();
        student2.computePercentage();

        System.out.print("Student 1: ");
        student1.getValues();
        student1.getPercentageMarks();
        System.out.print("Student 1 sum of obtained marks: " + student1.getSumOfObtainedMarks() + "\n");
        System.out.print("Student 2: ");
        student2.getValues();
        student2.getPercentageMarks();
        System.out.print("Student 2 sum of obtained marks: " + student2.getSumOfObtainedMarks()+ "\n");

        reportHighestPercentage(student1, student2);
    }

    public static PercentageMarks readStudent(Scanner input) {
        float total_sweng311, total_sweng411, total_sweng431, total_cmpsc221;
        float obtained_sweng311, obtained_sweng411, obtained_sweng431, obtained_cmpsc221;
        System.out.println("Enter Total marks of Sweng 311: ");
        total_sweng311 = input.nextFloat();
        System.out.println("Enter Obtained marks of Sweng 311: ");
        obtained_sweng311 = input.nextFloat();
        System.out.println("Enter Total marks of Sweng 411: ");
        total_sweng411 = input.nextFloat();
        System.out.println("Enter Obtained marks of Sweng 411: ");
        obtained_sweng411 = input.nextFloat();
        System.out.println("Enter Total marks of Sweng 431: ");
        total_sweng431 = input.nextFloat();
        System.out.println("Enter Obtained marks of Sweng 431: ");
        obtained_sweng431 = input.nextFloat();
        System.out.println("Enter Total marks of Cmpsc 221: ");
        total_cmpsc221 = input.nextFloat();
        System.out.println("Enter Obtained marks of Cmpsc 221: ");
        obtained_cmpsc221 = input.nextFloat();
        return new PercentageMarks(total_sweng311,obtained_sweng311, total_sweng411,obtained_sweng411, total_sweng431,
                obtained_sweng431, total_cmpsc221,obtained_cmpsc221);
    }

    public static float reportHighestPercentage(PercentageMarks student1, PercentageMarks student2) {
        float p1 = student1.getPercentageValue();
        float p2 = student2.getPercentageValue();
        if (p1 > p2) {
            System.out.println("Student 1 has the highest percentage at: " + p1);
            return p1;
        } else if (p2 > p1) {
            System.out.println("Student 2 has the highest percentage at: " + p2);
            return p2;
        } else {
            System.out.println("Both student 1 and student 2 have the same percentage at: " + p1);
            return p1;
        }
    }
}