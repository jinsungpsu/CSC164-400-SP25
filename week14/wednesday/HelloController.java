package com.example.week14listview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {
    private static ArrayList<Bowler> bowlers = new ArrayList<>();

    @FXML
    private ListView<Bowler> bowlerListView;

    @FXML
    private Label welcomeText;

    private void loadBowlersIntoListView() {
        for (Bowler each: bowlers) {
            bowlerListView.getItems().add(each);
        }
    }

    @FXML
    void showGoodBowlers(ActionEvent event) {
        bowlerListView.getItems().clear();
        for (Bowler each: bowlers) {
            if (each.getScore() >= 200)
                bowlerListView.getItems().add(each);
        }
        bowlerListView.refresh();
    }

    public void initialize() {
//        bowlers.add(new Bowler("Bryce Harper", 250));
//        bowlers.add(new Bowler("Zach Wheeler", 290));
//        bowlers.add(new Bowler("Joel Embiid", 110));
//        bowlers.add(new Bowler("Ben Simmons", 49));

        try {
            Scanner input = new Scanner(new File("bowlers.csv"));

            // throw away header row
            input.nextLine();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] lineParts = line.split(",");

                bowlers.add(new Bowler(lineParts[0].trim(), Integer.parseInt(lineParts[1].trim())));

            }
        } catch (FileNotFoundException error) {
            // not good
        }


        try {
            Scanner fileReader = new Scanner(new File("bowlerData.txt"));
            while (fileReader.hasNextLine()) {
                String bowlerName = fileReader.nextLine();
                String bowlerScore = fileReader.nextLine();

                // bowlers.add(new Bowler(bowlerName, Integer.parseInt(bowlerScore)));


                //String bowlerName = fileReader.nextLine();
                //int bowlerScore = fileReader.nextInt();
                //Bowler bowler = new Bowler(bowlerName, bowlerScore);
                //bowlers.add(bowler);


                //could do it directly
//                bowlers.add(new Bowler(fileReader.nextLine(), fileReader.nextInt()));
//                fileReader.nextLine(); // this is a hack..


            }
        } catch (FileNotFoundException error) {
            System.out.println("File was not found!");
        }

        loadBowlersIntoListView();
    }

}

class Bowler {
    private String name;
    private int score;

    public Bowler(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
