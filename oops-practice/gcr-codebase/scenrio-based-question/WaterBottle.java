class WaterBottle {

    private String ownerName;
    private int dailyTarget;

    // Constructor
    public WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    // Method
    public void displayBottleInfo() {
        System.out.println("-----------------------");
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Daily Target: " + dailyTarget + " ml");
    }

    public static void main(String[] args) {

        WaterBottle b1 = new WaterBottle("Mukund", 3000);
        WaterBottle b2 = new WaterBottle("Rahul", 2500);

        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}
