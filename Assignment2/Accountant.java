public class Accountant {
    //fields
    private int age;
    private String name;
    private String companyName;

    //constructor
    public Accountant(int a, String n, String c) {
        age = a;
        name = n;
        companyName = c;
    }
    //methods
    public void printSalary(){
        double salary = 40000 * Math.sqrt(Math.exp(0.04295 * age + 0.141));
        String formattedValue = String.format("%.2f", salary);
        System.out.println("Salary: $" + formattedValue);
    }

    public void getFields(){
        System.out.println("Name: "+name + ",     Age: " +age + ",     Company Name: "+companyName);
    }
}
