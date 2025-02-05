import java.util.Scanner;

public class MarvelRivals {
    public static void main(String[] args) {

        float[] lukaPointsPerSeason = {32.2f, 36.6f, 34.3f, 35.4f, 36.2f};
        float lukasAvgOverThreeSeasons = (32.2f+ 36.6f+ 34.3f) / 3;

        float totalYearlyAverages = 0;

        System.out.println("Luka's Average Points Per Season: ");
        for (int i = 0; i < lukaPointsPerSeason.length; i++) {
            System.out.printf("Season #%d: %.2f\n", (i+1), lukaPointsPerSeason[i]);
            totalYearlyAverages += lukaPointsPerSeason[i];
            // same as
            // totalYearlyAverages = totalYearlyAverages + lukaPointsPerSeason[i];
            // i += 1 same as i++
        }

        float lukasCareerAverage = totalYearlyAverages / lukaPointsPerSeason.length;


        // each row is a season
        // each column is a game within that season
        int[][] lukaPoints = {
                {35, 33, 40, 29, 31},
                {50, 19, 25, 33, 35},
                {1, 1, 1, 1, 99}
        };

        for (int seasonNumber = 1; seasonNumber < lukaPoints.length+1; seasonNumber++) {
            for (int gameNumber = 1; gameNumber < lukaPoints[seasonNumber-1].length+1; gameNumber++) {
                System.out.println("For season #" + seasonNumber + ", game #" + gameNumber + ", Luka scored: " + lukaPoints[seasonNumber-1][gameNumber-1]);
            }
        }
        System.out.println("##############################");
        System.out.println("##############################");
        System.out.println("## Luka's point tracker!!! ###");
        System.out.println("##############################");
        System.out.println("##############################");
        for (int i = 0; i < lukaPoints.length; i++) {
            System.out.print("\nSeason #" + (i+1) + "\nGames | ");
            for (int j=0; j < lukaPoints[i].length; j++) {
                System.out.printf("%-4d  | ", lukaPoints[i][j]);
            }
        }

        System.out.println(lukaPoints[0][0]);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        /*
        3D array
         */

        char[][][] stuffffff = {  // [2][3][2]
                { // first dimension, size 2, index 0
                    { // second dimension, size 3, index 0
                        'a', 'b' // third dimension, size 2, a is index 0 and b is index 1
                    },
                    { // second dimension, size 3, index 1
                        'c', 'd'
                    },
                    { // second dimension, size 3, index 2
                        'e', 'f'
                    }
                },
                { // first dimension, size 2, index 1
                    {
                        'g', 'h' // to print 'h' - 1 0 1
                    },
                    {
                        'i', 'j'
                    },
                    {
                        'k', 'l'
                    }
                }
        };

        System.out.println("To print h... should be index 1 0 1: " + stuffffff[1][0][1]);


        /*
        2D arrays
         */
        int[][] twoDimensionalArray = {
                {1,2,3},
                {4,5,6}
        };

        int[] secondRow = twoDimensionalArray[1];
        int lastNumber = twoDimensionalArray[1][2];


        char[] letters = new char[10];
        String[] words = new String[20];


        int[] array = new int[3];
        array[0] = 5;
        array[1] = 99;
        array[2] = 100;

        int num = array[1];

        int[] lazyArray = {5, 99, 100, 400};

        System.out.println(lazyArray[0]);

        System.out.println(lazyArray[2]);

        System.out.println(lazyArray[lazyArray.length-1]);


        boolean[] stuff = {true, true, true, true, true};
        // boolean hi = 0;
        for (boolean each: stuff) {

        }


        System.out.printf("How many items in array? %d", array.length );

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int each: array) {
            System.out.println(each);
        }

        String[] characters = {
                "Captain Marvel",
                "Wolverine",
                "Captain America",
                "Ironman",
                "Scarlet Witch"
        };

        String[][] characterData = {
                {"Captain Marvel", "Photon Blast"},
                {"Wolverine", "Regeneration"},
                {"Captain America", "Supersoldier"},
                {"Ironman", "Smart and Money"},
                {"Scarlet Witch", "Magic"}
        };

        for (int character = 0; character < characterData.length; character++) {
            System.out.println("Character name is: " + characterData[character][0]);
            System.out.println("Character power is: " + characterData[character][1]);
        }

        for (String hero: characters) {
            System.out.println(hero);
        }

        Scanner keyboard = new Scanner(System.in);

        double grade = 70.9;
        double average = 95.9;
        String name = "Alex";
        String gradeData = "My grade is: ";
        String averageData = "My average is: ";

        System.out.printf("My grade is %5.2f\n", grade);
        System.out.println("My grade is " + grade);

        System.out.printf("My name is %s. \nMy grade is %10.2f.  \nAnd my average is %10.2f", name, grade, average);

        System.out.printf("\n\n%-20s %10.2f\n%-20s %10.2f\n\n", gradeData, grade, averageData, average);

        while(true) {
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

            switch (userChoice) {
                case 1:
                    // new game
                    System.out.println("Starting new game..");
                    break;
                case 2:
                    // choose hero
                    System.out.println("Choose your hero..\n");
                    for (int i = 0; i < characters.length; i++) {
                        System.out.println((i+1)+": " + characters[i]);
                    }
                    System.out.println("Choose 1 - "+ characters.length + ": ");
                    int characterChoice = keyboard.nextInt();

                    System.out.println("You chose: " + characters[characterChoice-1]);
                    // we changed this from switch case
                    // after we put characters into the array
                    // so we lost the default case/invalid option code
                    // we should fix this in the future

                    switch (characterChoice) {
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
                    // exit immediately???
                    // return;
                    System.exit(0);
                    break;
                default:
                    // invalid
                    continue;

            }
        } // end of infinite loop
    }
}
