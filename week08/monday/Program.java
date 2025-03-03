import animalExamples.Giraffe;

import java.util.Scanner;

public class Program {


    static Scanner keyboard = new Scanner(System.in);

    double taxRate = 0.06;

    public static void main(String[] args) {
        Giraffe bob = new Giraffe();

        int num = keyboard.nextInt();

        double bill = 50;
        System.out.println("Total is: $" + bill);
    }

    void printMenu() {
        int num = keyboard.nextInt();
    }

    void chooseSomething() {
        int num = keyboard.nextInt();
    }
}
