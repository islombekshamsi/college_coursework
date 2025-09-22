public class HotDogStandRunner {
    public static void main(String[] args) {
        HotDogStand hotDogStand1 = new HotDogStand(23);
        HotDogStand hotDogStand2 = new HotDogStand(24);
        HotDogStand hotDogStand3 = new HotDogStand(25);


        hotDogStand1.justSold();
        hotDogStand2.justSold();
        hotDogStand2.justSold();
        hotDogStand3.justSold();
        hotDogStand3.justSold();
        hotDogStand3.justSold();

        System.out.println("Hot Dog Stand ID: " + hotDogStand1.getStandID() + " sold " + hotDogStand1.getHotDogsSold() + " hot dog(s)");
        System.out.println("Hot Dog Stand ID: " + hotDogStand2.getStandID() + " sold " + hotDogStand2.getHotDogsSold() + " hot dog(s)");
        System.out.println("Hot Dog Stand ID: " + hotDogStand3.getStandID() + " sold " + hotDogStand3.getHotDogsSold() + " hot dog(s)");

        System.out.println("Total hot dogs sold across all stands: " + HotDogStand.getTotalHotDogsSold());
    }
}
