/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ArithmaticOperationSceneController implements Initializable {

    @FXML    private Label resultLabel;
    @FXML    private TextField xTextField;
    @FXML    private TextField yTextField;
    @FXML    private Button addButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addOnMouseClick(MouseEvent event) {
//        int xVal = Integer.parseInt(xTextField.getText());
//        int yVal= Integer.parseInt(yTextField.getText());
//        int sum = xVal + yVal;
        resultLabel.setText(
                "X + Y : " +
                Integer.toString(
                        Integer.parseInt(xTextField.getText()) + 
                        Integer.parseInt(yTextField.getText())
                ));
        
    }

    @FXML
    private void subOnMouseClick(MouseEvent event) {
//        int xVal = Integer.parseInt(xTextField.getText());
//        int yVal= Integer.parseInt(yTextField.getText());
//        int sub = xVal - yVal;
        resultLabel.setText(
                "X - Y : " +
                Integer.toString(
                        Integer.parseInt(xTextField.getText()) - 
                        Integer.parseInt(yTextField.getText())
                ));
    }

    @FXML
    private void multOnMouseClick(MouseEvent event) {
//        int xVal = Integer.parseInt(xTextField.getText());
//        int yVal= Integer.parseInt(yTextField.getText());
//        int mult = xVal * yVal;
        resultLabel.setText(
                "X * Y : " +
                Integer.toString(
                        Integer.parseInt(xTextField.getText()) * 
                        Integer.parseInt(yTextField.getText())
                ));
    }

    @FXML
    private void addMouseExited(MouseEvent event) {
         addButton.setText("Add");
    }

    @FXML
    private void addMouseEntered(MouseEvent event) {
        addButton.setText("Don't Hover");
    }
    
}
