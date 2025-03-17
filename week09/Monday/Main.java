//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // for each loop
        int[] grades = {100, 90, 95, 99};
        for (int grade : grades) {
            System.out.println(grade);
        }

        Animal dog = new Animal();
        dog.setColor("Black and white");
        dog.setTail(true);

        Cat cat1 = new Cat();
        cat1.setName("fluffy");
        cat1.setColor("White");
        cat1.setTail(true);

        Cat cat2 = new Cat();
        cat2.setName("blubby");
        Cat cat3 = new Cat(cat1);

        Cat cat4 = cat2.deepCopy();

        Cat[] cs2RescueAgency = {cat1, cat2, cat3, null, new Cat(), null};
        // cs2RescueAgency
        // is an array of... Cat ref vars
        // NOT an array of Cat objects

        Cat[] cs3rescueAgency = new Cat[16];
        for (int i = 0; i < cs3rescueAgency.length; i++) {
            cs3rescueAgency[i] = new Cat();
            /*
            cs3rescueAgency[0] = new Cat();
            cs3rescueAgency[1] = new Cat();
            cs3rescueAgency[2] = new Cat();
            ...
            cs3rescueAgency[15] = new Cat();

             */
        }

        System.out.println("Available from CS2 Rescue");
        displayCatsForRescue(cs2RescueAgency);
        System.out.println("Available from CS3 Rescue");
        displayCatsForRescue(cs3rescueAgency);
    }

    static void displayCatsForRescue(Cat[] cats) {
        System.out.println("All cats available for rescue: ");
        for (Cat cat: cats) {
            if (cat != null)
                System.out.println(cat.getName());
        }
    }
}

class Food {
    private double cost;
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

class Animal {
    private String color;
    private boolean tail;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean getTail() {
        return tail;
    }
}

class Cat extends Animal {
    private int age;
    private String name;
    private Food faveFood;

    public void setFaveFood(Food food) {
        faveFood = food;
    }

    public Food getFood() {
        return faveFood;
    }

    public void setFaveFoodBrand(String brand) {
        faveFood.setBrand(brand);
    }


    public Cat() {
        age = 0;
        name = "Unnamed...";
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(Cat cat) {
        name = cat.name;
        age = cat.age;
    }

    public Cat deepCopy() {
        Cat copyCat = new Cat();
        copyCat.name = name;
        copyCat.age = age;
        return copyCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            return "Unnamed cat...";
        }
        return name;
    }
}
