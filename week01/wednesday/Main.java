// similar to #include <iostream>
import java.util.Scanner;

/*
class names start with a capital letter

variable identifiers start with lower case letter

use camelCase for both
 */
public class Lab1 {
    public static void main(String[] args) {
        // for user input
        // create a "variable" for your keyboard
        // common ones keys, keyboard, input
        Scanner input = new Scanner(System.in);
        
        int someNumFromUser = input.nextInt();
        double someDoubleFromUser = input.nextDouble();
        String someString = input.next();
        
        
        int numBurgers = 2; // camelCase
        int num_burgers = 3;

        
        System.out.println();

        if (numBurgers > 1) {
            System.out.print("Hello");
            // cout << "Hello";
            System.out.print("World");
            // cout << "World";

            // in IntelliJ
            // you can use shortcut sout
            // for System.out.println
            System.out.println("Hello");
            // cout << "Hello" << endl;
            System.out.println("World");
            // cout << "Hello" << World;

            System.out.println("What's up");
            System.out.println("Another one!");

            // What if I want to output multiple things???
            // cout << "Num burgers is: " << numBurgers;

            // in java... if we want to output multiple things on the same
            System.out.println("Number of burgers is " + numBurgers + 1 + " \n with french fries.");

            System.out.println("Number of burgers is " + (numBurgers + 1) + " \n with french fries.");

            // what happens when adding
            // apples & oranges

            int integerVal = 1;
            double doubleVal = 2.5;

            System.out.println(integerVal + doubleVal);
        }
    }
}

