package com.example.javafxweek12;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    // the FXML file defines the GUI
    // the visual layout of the app
    // I defined this reference variable
    // in the code section in SceneBuilder
    // bottom right
    // by giving it an fx:id
    // then, I copied the "Show Sample Controller Skeleton"
    // from the "View" menu at the top of SceneBuilder
    // any object that I need to interact with from the java code
    // needs to have an fx:id defined in SceneBuilder/FXML
    @FXML
    private Button fishButton;

    public HelloController() {
        System.out.println("An object of this controller class has been created!");
        // this doesn't work
        // because the order of how things are loaded
        // the FXML objects don't get loaded until later
        // so we use the initialize method instead
        //fishButton.setText("Specials for today - Fish Sandwiches!");
    }

    public void initialize() {
        // this initialize method has access to all the
        // objects that are created by the FXML file
        System.out.println("Initialize method is running!");
        fishButton.setText("Specials for today - Fish Sandwiches!");
    }

}
