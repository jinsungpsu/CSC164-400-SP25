//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] kyle = {
                {1,2,9},
                {3,4,10},
                {5,6,11}
        };

        for (int row = 0; row < kyle.length; row++){
            for (int column = 0; column < kyle[row].length; column++) {
                System.out.println(kyle[row][column]);
            }
        }
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
    }
}
