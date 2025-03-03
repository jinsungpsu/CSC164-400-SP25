//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String blah = "55";
        int blahNum = Integer.parseInt(blah);

        double bigNumber = Double.parseDouble(blah);

        // before i ever create a cat
        // i can still access static variables of a cat
        System.out.println("Cat's max age is: " + Cat.MAX_CAT_AGE);

        System.out.println("Cat population is: " + Cat.catPopulation);

        System.out.println("Largest integer I can store is: " + Integer.MAX_VALUE);

        // this is recommended and makes sense
        // call static methods by the name of the class
        Cat.showCatPopulation();

        Cat garfield = new Cat();
        System.out.println(garfield.getAge());
        // instead of simply sout(garfield.age)...
        // can't do that if we want to be able to protect
        // age from being accessed freely from outside
        // the Cat class

        garfield.showCatPopulation();


    }
}

class Cat {
    // instance variables
    // multiple unique versions
    // for each and every cat
    private int age;    // instance variable
    private String name;

    // static variables
    // general things about ALL CATS
    static int catPopulation = 0;
    static final int MAX_CAT_AGE = 25;

    void setAge(String newAge) {
        age = Integer.parseInt(newAge);
    }

    void speak() {
        int count = 5;
        for (int i = 0; i < count; i++) {
            System.out.println("Meow..");
        }
    }

    void birthday() {
        age++;
    }

    static void showCatPopulation() {
        System.out.println("There are " + catPopulation + " cats in the world!");
    }

    static int parseInt(String word) {
        if (word.equals("One")) return 1;
        return 0;
    }

    // getter/accessor
    // be able to "get"
    // private info
    // VIA a public method
    public String getName() {
        return name;
    }

    // setter/mutator
    // return type is always void
    // parameter is always
    // same type of variable
    // you're trying to change/set
    public void setName(String newName) {
        if (newName.length() > 99) {
            // error!
        }
        name = newName;
    }

    // setter and getter for age
    // setter
    // setAge
    // return type is void
    // param is whatever type age is..
    // in our case int
    // always public

    public void setAge(int newAge) {
        if (age < 0) {
            // do nothing...
            // display error
        } else {
            age = newAge;
        }
    }

    // getters
    // get followed by name of variable
    // getAge
    // return type = same as the data type of
    // the variable we're trying to access
    // in this case an int
    // no parameters
    // always public
    public int getAge() {
        return age;
    }
}
