package com.example.bowling;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class HelloController {

    @FXML
    private CheckBox checkbox1;

    @FXML
    private CheckBox checkbox2;

    @FXML
    private CheckBox checkbox3;

    @FXML
    private CheckBox checkbox4;

    @FXML
    private RadioButton radioOption1;

    @FXML
    private RadioButton radioOption2;

    @FXML
    private RadioButton radioOption3;

    @FXML
    private RadioButton radioOption4;

    @FXML
    private Slider slider;

    @FXML
    private Circle ball;

    @FXML
    private Text bowlerDataText;

    @FXML
    private TextField newBowlerNameTextField;

    @FXML
    private ListView<Bowler> bowlerListView;


    @FXML
    void directionButtonPressed(ActionEvent event) {
        double currBallX = ball.getCenterX();
        double currBallY = ball.getCenterY();

        String pressed = ((Button)(event.getSource())).getText();

        System.out.println(pressed);

        if (pressed.equals("left")) {
            double newLocation = currBallX - 10;
            ball.setCenterX(newLocation);
        }
        if (pressed.equals("right")) {
            double newLocation = currBallX + 10;
            ball.setCenterX(newLocation);
        }


    }

    public void initialize() {
        Bowler b1 = new Bowler();
        b1.setName("Bob");
        b1.setScore(300);
        Bowler b2 = new Bowler();
        b2.setName("Jill");
        b2.setScore(300);

        bowlerDataText.setText(b1.toString() + "\n" + b2.toString());

        bowlerListView.getItems().add(b1);
        bowlerListView.getItems().add(b2);
    }

    @FXML
    void radioButtonPressed(ActionEvent event) {
        boolean op1isSelected = radioOption1.isSelected();
        boolean op2isSelected = radioOption2.isSelected();
        boolean op3isSelected = radioOption3.isSelected();
        boolean op4isSelected = radioOption4.isSelected();

        if (op1isSelected) System.out.println("Option 1 is selected!");
        if (op2isSelected) System.out.println("Option 2 is selected!");
        if (op3isSelected) System.out.println("Option 3 is selected!");
        if (op4isSelected) System.out.println("Option 4 is selected!");
    }

    @FXML
    void bowlerNameChangeHandler(ActionEvent event) {
        Bowler selected = bowlerListView.getSelectionModel().getSelectedItem();
        String newName = newBowlerNameTextField.getText();
        selected.setName(newName);

        boolean op1isSelected = radioOption1.isSelected();
        boolean op2isSelected = radioOption2.isSelected();
        boolean op3isSelected = radioOption3.isSelected();
        boolean op4isSelected = radioOption4.isSelected();

        if (op1isSelected) selected.setTeam("Team 1");
        if (op2isSelected) selected.setTeam("Team 2");
        if (op3isSelected) selected.setTeam("Team 3");
        if (op4isSelected) selected.setTeam("Team 4");

        bowlerListView.refresh();
    }

    @FXML
    void modifyBowlersButtonHandler(ActionEvent event) {
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
    private String team;

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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", team='" + team + '\'' +
                '}';
    }
}
