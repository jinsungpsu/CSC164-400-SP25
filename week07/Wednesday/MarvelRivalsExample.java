import java.util.Scanner;

public class MarvelRivalsExample {
    public static void main(String[] args) {

        Hero bob;
        // this is a null pointer
        // System.out.println(bob.name);




        // shallow copy
        // not creating a new object
        // new reference to the same object
        // Hero warHammer = ironman;

        // deep copy
        // new object
//        Hero warHammer = new Hero("War Hammer");
//        warHammer.powerLevel = 100;
        Menu menu = new Menu();
        menu.displayWelcomeMessage();
        menu.chooseHero();

        menu.displayChosenHero();
    }
}

class Menu {
    Hero chosenHero;
    int numberOfHeroes = 2;
    Hero ironman = new Hero("Ironman");
    Hero captainMarvel = new Hero("Captain Marvel");

    Menu() {
        ironman.powerLevel = 350;
        captainMarvel.powerLevel = 500;
    }
    public void displayWelcomeMessage() {
        System.out.println("########################");
        System.out.println("Welcome to Marvel Rivals!");
        System.out.println("########################");
    }

    public void chooseHero() {
        System.out.println("Welcome to Marvel Rivals (copyright 2025...)");
        System.out.println("Pick your hero:");
        System.out.println("1: ironman");
        System.out.println("2: capt marvel");
        System.out.println("Enter 1 or 2: ");

        Scanner keyboard = new Scanner(System.in);
        int userChoice = keyboard.nextInt();

        while (true) {
            switch (userChoice) {
                case 1:
                    /*
                    this example is more like "deep copy"
                    int num = 5;
                    int num2 = num;
                    num2 = 10;
                     */

                    // shallow copy
                    chosenHero = ironman;
                    break;
                case 2:
                    chosenHero = captainMarvel;
                    break;
                default:
                    System.out.println("Invalid");
                    System.out.println("Please try again - enter 1 or 2:");
                    userChoice = keyboard.nextInt();
                    continue;
            }
            break;
        }
    }

    public void displayChosenHero() {
        System.out.println("Currently selected hero is: " + chosenHero.name);
    }
}

class Hero {
    String name;
    int powerLevel;
    int health;

    Hero(String newName) {
        name = newName;
        health = 100;
    }

    /*
    power up method
    what is this doing?
    does it need any information from the outside world?
    does it need some input? parameters?

    does it have any output?  info it sends back out?
    return type?
     */
    void levelUp() {
        powerLevel += 50;
    }
}
