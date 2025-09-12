public class LineIntersection {
    private double m, b;
    public LineIntersection(double m, double b) {
        this.m = m;
        this.b = b;
    }

    public double getGradient(){
        return m;
    }
    public double getyintercept(){
        return b;
    }
    public double getXCoordinate(LineIntersection line){
        double xCoordinate = (line.b-this.b)/(this.m-line.m);
        return xCoordinate;
    }

}
