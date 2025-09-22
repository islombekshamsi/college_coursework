public class CeramicCup extends Cup {
    private Boolean costly;
    private Boolean fragile;

    public CeramicCup() {
        super("Ceramic", true, true);
        this.costly=true;
        this.fragile=true;
    }

    public boolean isCostly() {
        return costly;
    }
    public boolean isFragile() {
        return fragile;
    }

    @Override

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Costly: " + (costly ? "yes" : "no"));
        System.out.println("Fragile: " + (fragile ? "yes" : "no"));
    }
}
