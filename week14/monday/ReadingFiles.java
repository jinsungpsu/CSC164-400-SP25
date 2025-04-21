package com.example.fileio_lecture;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void helloworld() throws FileNotFoundException {
        File file = new File("does not exist");
        Scanner scan = new Scanner(file);
    }

    void readFromFile(String file) throws FileNotFoundException {
        Scanner data = new Scanner(new File(file));
        System.out.println(data.next());
    }

    public void initialize() {

        try {
            readFromFile("example.txt");
        } catch (FileNotFoundException error) {
            System.out.println("File not found!");
        }
        //helloworld();

        // relative = better!!!
        File myfile = new File("src\\main\\resources\\com\\example\\fileio_lecture\\example.txt");
        File anotherFile = new File("anotherfile.txt");

        // aboslute = this won't work on other people's computers
        // unless they have the same exact folder names
        File absolutePathFile = new File("C:\\Users\\jan\\IdeaProjects\\fileio_lecture\\src\\main\\resources\\com\\example\\fileio_lecture\\sample.txt");

        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(myfile);
            int blah = fileScanner.nextInt();
            System.out.println(blah);
        } catch (FileNotFoundException error) {
            System.out.println(error);
            // prompt user for a new file location
            // or ... ask user what to do.. exit?
        } catch (InputMismatchException error) {
            System.out.println(error);
        } catch (Exception error) {
            // general errors
        }


    }
}
