public class PercentageMarks {
    private float totalMarksSwen311, totalMarksSwen411, totalMarksSwen431, totalMarksCmpsc221;
    private float obtainedMarksSweng311,obtainedMarksSweng411, obtainedMarksSweng431, obtainedMarksCmpsc221;
    private float totalMArks, obtainedMarks, percentageMarks;
    public PercentageMarks(float totalSweng311, float obtainedSweng311, float totalSweng411, float
            obtainedSweng411,float totalSweng431, float obtainedSweng431, float totalCmpsc221, float obtainedCmpsc221)
    {
        this.totalMarksSwen311= validateTotal(totalSweng311);
        this.totalMarksSwen411=validateTotal(totalSweng411);
        this.totalMarksSwen431=validateTotal(totalSweng431);
        this.totalMarksCmpsc221=validateTotal(totalCmpsc221);
        this.obtainedMarksSweng311=validateObtained(obtainedSweng311, totalSweng311);
        this.obtainedMarksSweng411=validateObtained(obtainedSweng411, totalSweng411);
        this.obtainedMarksSweng431=validateObtained(obtainedSweng431, totalSweng431);
        this.obtainedMarksCmpsc221=validateObtained(obtainedCmpsc221, totalCmpsc221);
    }
    public void setValues(float totalSweng311, float obtainedSweng311, float totalSweng411, float
            obtainedSweng411,float totalSweng431, float obtainedSweng431,  float totalCmpsc221, float obtainedCmpsc221)
    {
        this.totalMarksSwen311=totalSweng311;
        this.totalMarksSwen411=totalSweng411;
        this.totalMarksSwen431=totalSweng431;
        this.obtainedMarksSweng311=obtainedSweng311;
        this.obtainedMarksSweng411=obtainedSweng411;
        this.obtainedMarksSweng431=obtainedSweng431;
        this.totalMarksSwen311= validateTotal(totalSweng311);
        this.totalMarksSwen411=validateTotal(totalSweng411);
        this.totalMarksSwen431=validateTotal(totalSweng431);
        this.totalMarksCmpsc221=validateTotal(totalCmpsc221);
        this.obtainedMarksSweng311=validateObtained(obtainedSweng311, totalSweng311);
        this.obtainedMarksSweng411=validateObtained(obtainedSweng411, totalSweng411);
        this.obtainedMarksSweng431=validateObtained(obtainedSweng431, totalSweng431);
        this.obtainedMarksCmpsc221=validateObtained(obtainedCmpsc221, totalCmpsc221);
    }
    public void getValues()
    {
        System.out.println ("Total marks of Sweng 311: " + this.totalMarksSwen311);
        System.out.println ("Obtained marks of Sweng 311: " + this.obtainedMarksSweng311);
        System.out.println ("Total marks of Sweng 411: " + this.totalMarksSwen411);
        System.out.println ("Obtained marks of Sweng 411: " + this.obtainedMarksSweng411);
        System.out.println ("Total marks of Sweng 431: " + this.totalMarksSwen431);
        System.out.println ("Obtained marks of Sweng 431: " + this.obtainedMarksSweng431);
        System.out.println("Total marks of Cmpsc221: " + this.totalMarksCmpsc221);
        System.out.println("Obtained narks of Cmpsc221: " + this.obtainedMarksCmpsc221);
    }
    public void computePercentage()
    {
        this.totalMArks = this.totalMarksSwen311+this.totalMarksSwen411+this.totalMarksSwen431 + this.totalMarksCmpsc221;

        this.obtainedMarks=this.obtainedMarksSweng311+this.obtainedMarksSweng411+this.obtainedMarksSweng431 +this.obtainedMarksCmpsc221;
        this.percentageMarks=this.obtainedMarks/this.totalMArks*100;
    }
    public void getPercentageMarks()
    {
        System.out.println("Total MArks: " +this.totalMArks);
        System.out.println("Total Obtained MArks: " + this.obtainedMarks);
        System.out.println("Percentage Marks: "+this.percentageMarks);
    }

    public float getSumOfObtainedMarks()
    {
        return this.obtainedMarks;
    }

    public float getPercentageValue()
    {
        return this.percentageMarks;
    }

    private static float validateTotal(float total){
        if (total < 1f || total > 100f){
            throw new IllegalArgumentException("Total marks must be between 1 and 100");
        }
        return total;
    }

    private static float validateObtained(float obtained, float totalCourse){
        if (obtained < 1f || obtained > 100f){
            throw new IllegalArgumentException("Obtained marks must be between 1 and 100");
        }
        if (obtained > totalCourse){
            throw new IllegalArgumentException("Obtained marks cannot be greater than total marks");
        }
        return obtained;
    }
}