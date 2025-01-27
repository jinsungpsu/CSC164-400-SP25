/*
CSC164 Class Examples
Monday 1/27/25
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float billCost;

        do {
            System.out.println("How much was your bill? $");
            billCost = keyboard.nextFloat();
        } while (billCost < 0);

        // break statement example
        while (true) {
            System.out.println("How much was your bill? $");
            billCost = keyboard.nextFloat();
            if (billCost > 0) {
                break;
            }
        }

        // conditional operator example
        float tipRate = (billCost > 250) ? .20f : 0f;
        System.out.println(tipRate);



        // Marvel rivals
        // we'll continue messing around with this big program throughout semester
        System.out.println("Welcome to...");
        System.out.println("Marvel Rivals");
        System.out.println("1: Start new game");
        System.out.println("2: Choose your hero");
        System.out.println("3: Fight other people");
        System.out.println("4: Exit game.");
        System.out.println("What do you wanna do? (1-4): ");

        int userChoice = keyboard.nextInt();

        switch(userChoice) {
            case 1:
                // new game
                System.out.println("Starting new game..");
                break;
            case 2:
                // choose hero
                System.out.println("Choose your hero..");
                System.out.println("1: Ironman");
                System.out.println("2: Scarlet Witch");
                System.out.println("3: Wolverine");
                System.out.println("4: Cyclops");
                System.out.println("5: Thor");
                System.out.println("Choose 1 - 4: ");
                int characterChoice = keyboard.nextInt();
                switch(characterChoice) {
                    case 1:
                        System.out.println("You chose Ironman");
                        break;
                    case 2:
                        System.out.println("You chose Scarlet Witch.");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }

                switch(characterChoice) {
                    case 1:
                    case 2:
                    case 5:
                        // debugging output
                        // System.out.println("The value of characterChoice is: " + characterChoice);
                        // end debug
                        // BREAK THIS HABIT!!!!

                        System.out.println("You chose a classic Marvel character");
                        break;
                    case 3:
                    case 4:
                        System.out.println("You chose an X-men character");
                        break;
                    default:

                }
                break;
            case 3:
                // fight
                break;
            case 4:
                // exit
                break;
            default:
                // invalid

        }


        // Switch case examples
        int userId = 700123456;

        switch(userId) {
            case 70000001:
                // do something
            case 70000002:
            case 70000003:
            case 700123456:

        }

        // AND is restrictive, EVERY condition must be true
        // OR is permissive, ONE condition must be true
        System.out.println("Input must be between 1-5");
        int userInput = keyboard.nextInt();
        if (userInput >= 1 && userInput <= 5 && userId == 700123456) {
            System.out.println("The input is valid AND the user id is correct");
            System.out.println("Permission granted...");
        }

        // when doing if, else if, be careful of order, since it'll test each condition in order
        double grade = 89.5;
        if (grade < 70) {
            System.out.println("Grade is an F");
        } else if (grade < 80) {
            System.out.println("Grade is a C");
        }

        if (grade < 90) {
            System.out.println("Grade is a B");
        } else if (grade < 80) {
            System.out.println("Grace is a C");
        }
    }
}
