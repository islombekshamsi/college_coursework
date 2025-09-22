public class CupRunner {
    public static void main(String[] args)
    {
        PaperCup paper = new PaperCup();
        GlassCup glass = new GlassCup();
        CeramicCup ceramic = new CeramicCup();


        System.out.println("Paper fragile: " + paper.getFragile() + ", paper disposable: " + paper.getDisposability()
                + ", suitable for hot drink: " + paper.isSuitableForHotDrink() + ", suitable for microwave: " + paper.isMicrowaveUage());
        System.out.println("Paper Cup Info:");
        paper.displayInfo();
        System.out.println("=========");

        System.out.println("Glass fragile: " + glass.isFragile() + ", glass disposable: " + glass.isDisposable()  + ", suitable for hot drink: "
                + glass.isSuitableForHotDrink() + ", suitable for microwave: " + glass.isMicrowaveUage());
        System.out.println("Glass Cup Info:");
        glass.displayInfo();
        System.out.println("=========");


        System.out.println("Ceramic fragile: " + ceramic.isFragile() + ", ceramic costly: " + ceramic.isCostly() + ", suitable for hot drink: "
                + ceramic.isSuitableForHotDrink() + ", suitable for microwave: "  + ceramic.isMicrowaveUage());
        System.out.println("Ceramic Cup Info:");
        ceramic.displayInfo();
        System.out.println("=========");

    }
}
