package order;

import food.Food;
import restaurant.Restaurant;

import java.util.ArrayList;

public class Order {

    private boolean statusDelivered;
    private boolean active;
    private ArrayList<Food> itemsToDeliver;

    public boolean getStatus() {
        return statusDelivered;
    }

    public Order(Restaurant rest, ArrayList<Food> items) {
        statusDelivered = false;
        active = true;
        itemsToDeliver = (ArrayList<Food>) items.clone();
    }

    public String trackOrder() {
        String s = "";
        if (active) {
            s = "Your order is on its way";
            System.out.println(s);
        }
        else {
            s = "You haven't made an order yet";
            System.out.println(s);
        }

        return s;
    }

    public void cancelOrder() {
        active = false;
    }

}
