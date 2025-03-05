class Main {
    public static void main(String[] args) {
        Food[] menu = {
                new Food("Burger", 5.99, "Gluten, Dairy"),
                new Food("Salad", 4.49, "Nuts"),
                new Food("Pizza", 8.99, "Gluten, Dairy"),
                new Food("Soup", 3.99, "None"),
                new Food("Pasta", 7.49, "Gluten, Dairy")
        };

        // this part of my program
        // doesn't create any food...
        // those already exist

        // this part of my program
        // interacts with the user
        // and should create orders

        Order kylesOrder = new Order();
        kylesOrder.setItem1(menu[2]); // kyle ordered pizza

        // what was Kyle's first item in his order?
        System.out.println(kylesOrder.getItem1().getName());

    }

    static void printMenu(Food[] menu) {
        System.out.println("Welcome to Java Bites Restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i <menu.length; i++){
            System.out.println((i + 1) + ". " + menu[i].getName() + " - $" + menu[i].getPrice() + " (Contains: " + menu[i].getAllergens() + ")");
        }
    }
}

class Food {
    private String name;

    public String getName() {
        return name;
    }
}

class Order {
    private Food item1;

    public void setItem1(Food item) {
        item1 = item;
    }

    public Food getItem1() {
        return item1;
    }
}
