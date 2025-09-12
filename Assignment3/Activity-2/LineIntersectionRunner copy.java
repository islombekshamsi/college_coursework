import java.util.Scanner;

public class LineIntersectionRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gradient of line 1: ");
        double grad1 = input.nextFloat();

        System.out.print("Enter gradient of line 2: ");
        double grad2 = input.nextFloat();

        System.out.print("Enter y-intercept of line 1: ");
        double yint1 = input.nextFloat();

        System.out.print("Enter y-intercept of line 2: ");
        double yint2 = input.nextFloat();

        LineIntersection line1 = new LineIntersection(grad1, yint1);
        LineIntersection line2 = new LineIntersection(grad2, yint2);

        if (grad1==grad2 && yint1==yint2){
            System.out.println("Lines are the same (infinite intersections)");
        } else if (grad1==grad2){
            System.out.println("Lines are parallel (no intersections)");
        } else {
            double xCoordinate = line1.getXCoordinate(line2);
            double yCoordinate = (grad1 * xCoordinate) + yint1;
            System.out.printf("Intersection Coordinates: (%.2f, %.2f)%n", xCoordinate, yCoordinate);    }
    }



}
