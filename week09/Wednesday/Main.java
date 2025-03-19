import java.util.Scanner;

class Thing {
    private double weight;
    private double volume;

    public Thing() {
        System.out.println("A thing has been added to the world!");
        weight = 5;
        volume = 20;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Organism extends Thing {
    // it extends the Thing
    // class by adding
    // MORE properties or methods
    // meaning... it becomes a more
    // specific kind of "thing"
    private String birthdate;
    private int age;

    public Organism(String birthdate) {
        super(); // this is implicitly here
        this.birthdate= birthdate;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Fish extends Organism {
    private boolean freshWater;
    // private int age; // don't do this

    public Fish(String birthdate) {
        super(birthdate);
        System.out.println("A fishy is here!");
    }

    // public boolean getFreshWater() {
    // a getter that returns a boolean
    // often starts with a verb
    public boolean isFreshWater() {
        return freshWater;
    }

    public void eat() {
        double currWeight = super.getWeight();
        super.setWeight(currWeight + 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("1/1/2015");

        Fish[] fishies2 = new Fish[2];
        fishies2[0].setWeight(500);

        Fish[] fishies = {
                new Fish("1/2/25"),
                new Fish("1/3/25"),
                new Fish("1/4/25"),
                new Fish("1/5/25")
        };

        if (fish.isFreshWater()) {
            // this is a fresh water fish
        }


    }
}
