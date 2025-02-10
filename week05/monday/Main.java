import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final double TAX_RATE = 0.06;

    // you could createa "Global" keyboard
    // you're totally OK to do this in this class..
    static Scanner globalInputKeyboard = new Scanner(System.in);

    static void printWelcomeMessage() {
        System.out.println("###########################");
        System.out.println("### Welcome to the game ###");
        System.out.println("###########################");
    }

    static void printMenu() {
        System.out.println("1. Pick your hero");
        System.out.println("2. Exit game");
    }

    static void printAllHeroes(String[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i+1)+": " + heroes[i]);
        }
    }

    static int getValidIntegerInputInRange(int low, int high, Scanner keyboard) {
        while (true) {
            System.out.println("Please enter a number between " + low + " and " + high + ": ");
            int userChoice = keyboard.nextInt();
            if (userChoice < low || userChoice > high) {
                // bad...outside range
                System.out.println("Invalid input, try again: ");
            } else {
                // good... inside range
                return userChoice;
            }
        }
    }

    static String pickHero(String[] heroes, Scanner keyboard) {
        System.out.println("Select a hero: ");
        printAllHeroes(heroes);
        System.out.println("Select from 1-"+heroes.length+": ");
        int chosenHeroIndex = getValidIntegerInputInRange(1, heroes.length, keyboard);
        return heroes[chosenHeroIndex-1];
    }

    public static void main(String[] args) {

        String[] heroes = {
                "Ironman",
                "Thor",
                "Wanda",
                "Vision"
        };

        Scanner keyboard = new Scanner(System.in);
        printWelcomeMessage();


        printMenu();
        int userChoice = keyboard.nextInt();
        switch(userChoice) {
            case 1:
                // pick your hero
                // let's make this into a method
                // what does this method need in order to do its job
                // heroes[]
                // keyboard
                String chosenHero = pickHero(heroes, keyboard);
                System.out.println("You chose: " + chosenHero);
                break;
            case 2:
                System.exit(99);
                break;
            default:
                System.out.println("Invalid entry!");
        }





        int num1 = 5, num2 = 10;

        if(isEven(num1)) {
        // if (isEven(num1) == true) {
            System.out.println("That is even!");
        }

        System.out.println(sum(num1, num2));

        // values of num1 and num2 are UNAFFECTED
        // by whatever happened inside the sum
        // method
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        int[] numArray = {1,2,3};

        System.out.println(sum(numArray));
        // pass by "reference"
        // changes made inside the sum method
        // will be reflected in main
        // because the "value" we're passing in - numArray
        // is, in fact, a reference variable

        System.out.println("first item in numarray: " + numArray[0]);

        System.out.println("##############################");
        System.out.println("##############################");
        System.out.println("##############################");
        System.out.println("##############################");
        System.out.println("##############################");

        System.out.println(sum(1,2));

        System.out.println(sum(num2, num1));

        System.out.println(sum(num2, 99.5));

        System.out.println(sum(1+1, sum(1,sum(100,101))));
    }

    static int length(String word) {
        return 99;
    }

    static void printIfNumberIsEven(int num) {
        if (num%2 ==0) {
            System.out.println("That is even...");
        } else {
            System.out.println("Not even... odd I guess...");
        }
    }

    static boolean isEven(int num) {
        if (num%2 == 0) {
            return true;
        } else {
            return false;
        }

        // return num%2==0;
    }

    static int sum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        arr[0] = 777;

        return sum;
    }

    static int sum(int num1, int num2) {
        // int is the return type
        // so this is like the "output"
        // when this method finishes doing
        // what it's supposed to do...
        // int num1 and num2 are parameters
        // think of them as "inputs"
        // information it is going to need
        // to do the job

        num2 = 500;

        return num1+num2;
    }

    static int sum(int num1, double num2) {
        return (int)(num1+num2);
    }
}
