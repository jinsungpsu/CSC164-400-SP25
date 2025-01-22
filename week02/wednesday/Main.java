/*
Jin An
DTCC
CSC164
I didn't cheat
 */

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int userInput = keyboard.nextInt();

        System.out.println(2e6);

        double bigNum = 2;
        int smallNum = (int)bigNum;
        double anotherBigNum = smallNum;


        int num = 5;
        num = num + 5; // num += 5;
        num = num * 10; // num *= 10;


        for (int i = 0; i < 99; i++) {
            System.out.print("X");
            if (i % 5 == 0) {
                System.out.print("\n");
            }
        }



        final double taxRate = 0.06;
        // constants should be all CAPS
        // cannot use camelCase
        // separate words with _



        System.out.println("hi hi hi");

        int number = 5;
        int number2 = 0;

        int _whatsUp;

        int number3 = number / number2;

        System.out.println("hi hi hi");

        if (num > 10) {
            System.out.println("Bye bye");
            System.out.println("Bye bye");          // commetns here?!??

            // some comment
            System.out.println("Bye bye");
        }
    }
}
