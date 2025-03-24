public class Food {
    private String name;
    private int calories;
    private String allergens;

    public Food(String name, int calories, String allergens) {
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        // common way of creating toString
        // methods
//        return "Name: " + name
//                + "\nCalories: " + calories
//                + "\nAllergens: " + allergens;

        // different way to do the same thing
        // but maybe a little more intuitive
        String output = "";
        // put a bunch of things in there
        // in other words
        // BUILD the output
        output += "Food name: " + name;
        output += "\n\tCalories: " + calories;
        output += "\n\tAllergens: " + allergens;
        return output;
    }
}

class Restaurant {
    public static void main(String[] args) {
        Food[] menu = {
          new Food("Cookies", 100, "Nuts"),
          new Food("Pizza", 1200, "none")
        };

        // print menu
        for (Food menuItem: menu) {
            System.out.println(menuItem);
        }
    }
}
