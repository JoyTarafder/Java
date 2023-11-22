/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fxmlapplicationpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TableViewDummySceneSec3Controller implements Initializable {

    @FXML    private TableView<Student> studentTableView;
    @FXML    private TableColumn<Student, Integer> idTableColumn;
    //@FXML    private TableColumn<Student, String> idTableColumn;
    @FXML    private TableColumn<Student, String> nameTableColumn;
    @FXML    private TableColumn<Student, String> cgpaTableColumn;

   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
