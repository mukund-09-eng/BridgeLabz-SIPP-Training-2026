interface FoodDelivery {

    void deliverFood(String customerName);

    default void trackOrder() {
        System.out.println("Food order is on the way.");
    }

    static String generateDeliveryCode() {
        return "FD" + (int)(Math.random() * 1000);
    }
}

interface GroceryDelivery {

    void deliverGroceries(String customerName);

    default void trackOrder() {
        System.out.println("Grocery order is on the way.");
    }
}

class DeliveryExecutive
        implements FoodDelivery,
                   GroceryDelivery {

    @Override
    public void deliverFood(String customerName) {

        System.out.println(
                "Food delivered to "
                        + customerName
        );
    }

    @Override
    public void deliverGroceries(String customerName) {

        System.out.println(
                "Groceries delivered to "
                        + customerName
        );
    }

    @Override
    public void trackOrder() {

        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public static void main(String[] args) {

        String[] customers = {
                "Mukund",
                "Rahul",
                "Aman"
        };

        DeliveryExecutive executive =
                new DeliveryExecutive();

        for (String customer : customers) {

            System.out.println(
                    "Delivery Code: "
                    + FoodDelivery.generateDeliveryCode()
            );

            executive.trackOrder();
            executive.deliverFood(customer);
            executive.deliverGroceries(customer);

            System.out.println();
        }
    }
}
