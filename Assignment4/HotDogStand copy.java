public class HotDogStand {
    private int standID;
    private  int hotDogsSold;
    private static int totalHotDogsSold = 0;

    public HotDogStand(int id) {
        this.standID = id;
        this.hotDogsSold = 0;
    }
    public void justSold(){
        this.hotDogsSold++;
        this.totalHotDogsSold++;
    }
    public int getStandID() {
        return standID;
    }
    public int getHotDogsSold() {
        return hotDogsSold;
    }

    public static int getTotalHotDogsSold() {
        return totalHotDogsSold;
    }
}
