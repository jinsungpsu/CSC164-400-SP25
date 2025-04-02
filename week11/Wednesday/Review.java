import java.util.ArrayList;

public class Cat extends Animal {
    int age;
    String name;

    public Cat() {
        super(); // Animal();
    }

    @Override
    public String toString() {
        String output = "";
        output += "Cat with age: " + age;
        output += "named: " + name;
        return output;
    }

}
class Animal extends Organism {
    public Animal() {
        super(0);
        // asdfasdf
        //asdfasdf
    }
}
class Organism {
    private int age;
    public Organism(int age) {
        this.age = age;
    }
}

class Review {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Cat());
        Cat garfield = new Cat();
        zoo.add(garfield);
        Cat boo = new Cat();
        zoo.set(1, boo);
        System.out.println(zoo);

        for (int i = 0; i < zoo.size(); i++) {
            zoo.get(i);
        }

        for (Animal each: zoo) {
            System.out.println(each);
        }
    }
}
