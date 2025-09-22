public class PaperCup extends Cup{
    private Boolean disposable;
    private Boolean fragile;

    public PaperCup() {
        super("Paper", false, false);
        disposable=true;
        fragile=false;
    }

    public boolean getDisposability()
    {
        return disposable ;
    }

    public boolean getFragile()
    {
        return fragile ;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Disposable: " + (disposable ? "yes" : "no"));
        System.out.println("Fragile: " + (fragile ? "yes" : "no"));
    }

}
