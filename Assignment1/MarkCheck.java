// class contains the logic for evaluating student marks.
public class MarkCheck {
    public String markcheck(int mark){
        if (mark >= 1 && mark < 50)
            return "F";
        else if (mark >= 50 && mark <= 60)
            return "E";
        else if (mark >= 61 && mark <= 70)
            return "D";
        else if (mark >= 71 && mark <= 80)
            return "C";
        else if (mark >= 81 && mark <= 90)
            return "B";
        else if (mark >= 91 && mark <= 100)
            return "A";

        // handles invalid input outside 1-100
        return "Enter number between 1 and 100";
    }
}
