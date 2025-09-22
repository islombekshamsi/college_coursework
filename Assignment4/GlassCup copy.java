public class GlassCup extends Cup {
    private Boolean fragile;
    private Boolean disposable;

    public GlassCup() {
        super("Glass", true, true);
        this.disposable = false;
        this.fragile = true;
    }

    public boolean isDisposable() {
        return this.disposable;
    }

    public boolean isFragile() {
        return this.fragile;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fragile: " + (fragile ? "yes" : "no") );
        System.out.println("Disposable: " + (disposable ? "yes" : "no"));
    }
}
