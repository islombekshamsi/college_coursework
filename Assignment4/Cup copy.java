public class Cup {
    protected String cupMaterial;
    protected boolean microwaveUsage;
    protected boolean suitableForHotDrink;

    public Cup(String cupMaterial, boolean microwaveUage, boolean suitableForHotDrink) {
        this.cupMaterial = cupMaterial;
        this.microwaveUsage = microwaveUage;
        this.suitableForHotDrink = suitableForHotDrink;
    }
    public Cup()
    {
        this("Unknown", false, false);
    }
    public String getCupMaterial() {
        return cupMaterial;
    }

    public boolean isMicrowaveUage() {
        return microwaveUsage;
    }

    public boolean isSuitableForHotDrink() {
        return suitableForHotDrink;
    }

    public void displayInfo(){
        System.out.println("Cup Material: " + cupMaterial);
        System.out.println("Microwave Usage: " + (microwaveUsage ? "safe" : "not safe"));
        System.out.println("Suitable for HotDrink: " + (suitableForHotDrink ? "suitable" : "not suitable"));
    }
}
