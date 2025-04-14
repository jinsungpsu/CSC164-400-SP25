package com.example.bowling;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class HelloController {

    @FXML
    private Text bowlerDataText;

    public void initialize() {
        Bowler b1 = new Bowler();
        b1.setName("Bob");
        b1.setScore(300);
        Bowler b2 = new Bowler();
        b2.setName("Jill");
        b2.setScore(300);

        bowlerDataText.setText(b1.toString() + "\n" + b2.toString());

    }

    @FXML
    void bowlerDataClickedHandler(MouseEvent event) {
        Bowler newBowler=new Bowler();
        newBowler.setName("Mark");
        newBowler.setScore(150);

        bowlerDataText.setText(
            bowlerDataText.getText()
            + "\n" + newBowler.toString());
    }

    @FXML
    void endGameButtonHandler(ActionEvent event) {
        bowlerDataText.setText("The game has ended!  Please leave.");
        System.exit(1);
    }

}

class Bowler {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
