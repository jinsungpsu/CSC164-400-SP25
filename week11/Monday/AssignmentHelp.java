import java.util.ArrayList;

public class AssignmentHelp {
    public static void main(String[] args) {
        Order order = new Order();
        RestaurantItem frenchFries = new RestaurantItem();
        
        order.addItem(frenchFries);
        
    }
}

class RestaurantItem {
    private String name;
    private double price;
}

class Food extends RestaurantItem {

}

class Order {
    private ArrayList<RestaurantItem> items = new ArrayList<>();
    
    public void addItem(RestaurantItem item) {
        items.add(item);
    }
}
