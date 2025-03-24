import java.util.ArrayList;

public class Order {
    private ArrayList<RestaurantItem> orderItems = new ArrayList<>();

    public void addItemToOrder(RestaurantItem item) {
        orderItems.add(item);
    }

    public String toString() {
        String output = "";
        //output += orderItems;
        for (int i = 0; i < orderItems.size(); i++) {
            output += orderItems.get(i).getName();
            if (orderItems.get(i) instanceof Food) {
                output += ", " + orderItems.get(i).getAllergens();
            }
        }
        return output;
    }
}
class RestaurantItem {

}
class Food extends RestaurantItem {

}
class Drink extends Food {

}
