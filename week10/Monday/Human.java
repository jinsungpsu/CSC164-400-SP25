import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Human extends Object {
    private int age;
    private String name;
    private double weight;

    public void speak() {
        System.out.println("I am not AI!");
    }

    public void setAge(int age) {
        this.age =age;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        String output = "";
        output += "Name: " + name;
        output += "Age: " + age;
        output += "Weight: " + weight;

        return output;
    }
}

class Student extends Human {
    private double gpa;
    private String semester;

    // this is NOT overriding
    // this is overloading
    // overriding has to do with inheritance
    // overloading has to do with method signatures
    // being different (different parameter list)
    public void speak(boolean loud) {
        if (loud) {
            System.out.println("I am a loud student!");
        } else {
            System.out.println(" I am quiet student!");
        }
    }

    public void speak() {
        System.out.println("I really am a human - student... I use AI... I am not AI.");
    }

    // student class toString method
    @Override
    public String toString() {
        String output = "";
//        output += "Name: " + super.getName();
//        output += "Age: " + super.getAge();
//        output += "Weight: " + super.getWeight();

        // instead... use the superclass' toString
        // THIS IS BETTER!!!
        output += super.toString();

        output += "\nGPA" + gpa;
        output += "Semester" + semester;

        return output;

    }
}

class StudentAthlete extends Student {
    private String sport;
    private boolean scholarship;

    /*
    not necessary
    but good practice
    annotation
    stating that this following method
    is overriding a superclass' method
     */
    @Override
    public void speak() {
        System.out.println("I am a student athlete... I get to register early!");
    }
}

class Main extends Object {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human anotherHuman = new Human();
        System.out.println("Human class: ");
        h1.speak();

        System.out.println(h1.getAge());
        System.out.println(anotherHuman.getAge());

        System.out.println(h1.toString());

        // implicitly calls the toString method
        // when just using the ref var
        // in a context where a string is expected
        System.out.println(anotherHuman);


        Student h2 = new Student();
        System.out.println("Student class: ");
        h2.speak();

        StudentAthlete h3 = new StudentAthlete();
        System.out.println("StudentAthelete class: ");
        h3.speak();

        System.out.println(h3);

        // Object class
        Object thing = new Object();

        Cat cat = new Cat();
        System.out.println(cat.toString());

        // Object class
        // common functionality
        // of ALL OBJECTS EVER IN JAVA
        Random rng = new Random();
        System.out.println(rng);



        Human p = new Human();
        Human p2 = new Student();
        Human p3 = new StudentAthlete();
        Student p4 = new Student();
        Student p5 = new StudentAthlete();

        Object p6 = new Student();
        Object p7 = new StudentAthlete();
        Object p8 = new Human();

        // this doesn't work
        // Student p6 = new Human();

        // polymorphic array
        Student[] yearbook = new Student[5];

        // casting
        Human z1 = new Human();
        Student z2 = new Student();
        StudentAthlete z3 = new StudentAthlete();

        Student z4 = z3; // implict... allowed
        // StudentAthlete z5 = z2; // not allowed
        // StudentAthlete z5 = (StudentAthlete) z2;
        // THIS IS NOT ALLOWED... EVEN EXPLICITLY

        if (z1 instanceof Human) {
            System.out.println("Z1 is a human!");
        }
        if (z4 instanceof Human) {
            System.out.println("Z4 is a human!");
        }
        if (z1 instanceof StudentAthlete) {
            System.out.println("z1 is a student athlete");
        }


        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // just adds at the "end"
        list.add(2); // don't have to worry about index
                        // when using add
        System.out.println(list); // tostring!!!

        // print 2nd item
        // similar to sout(list[1])
        // similar to getter
        System.out.println(list.get(1));

        // similar to setter
        // similar to list[1] = 5;
        list.set(1, 5);

        System.out.println(list);

        list.add(99);

        System.out.println(list);

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Food> menu = new ArrayList<>();

        ArrayList<Boolean> bunchofstuff = new ArrayList<>();
    }
}

class Cat {
    int age;
}
