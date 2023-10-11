/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class StudentSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField cgpaTextField;
    @FXML    private DatePicker dobDatePicker;
    @FXML    private TextField noOfPublicationTextField;
    @FXML    private TextField yearOfExperienceTextField;
    @FXML    private CheckBox isGraduateCheckBox;
    @FXML    private Label outputLabel;
    
    ArrayList<Student> studentList;
    ArrayList<GraduateStudent> gradStudentList;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isGraduateCheckBox.setDisable(false);
        studentList = new ArrayList<Student>();
        gradStudentList = new ArrayList<GraduateStudent>();
                
        noOfPublicationTextField.setDisable(true);
        yearOfExperienceTextField.setDisable(true);
        // TODO
    }    

    @FXML
    private void addNewStudentButtonOnClicked(ActionEvent event) {
        outputLabel.setText("");
        if(isGraduateCheckBox.isSelected() == true){
            gradStudentList.add(
                new GraduateStudent(
                    Integer.parseInt(idTextField.getText()),
                    nameTextField.getText(),
                    Float.parseFloat(cgpaTextField.getText()),
                    dobDatePicker.getValue(),
                    Integer.parseInt(noOfPublicationTextField.getText()),
                    Integer.parseInt(yearOfExperienceTextField.getText())  
                )
            );
            
        }
        else{
            studentList.add(
      new Student(
                    Integer.parseInt(idTextField.getText()),
                    nameTextField.getText(),
                    Float.parseFloat(cgpaTextField.getText()),
                    dobDatePicker.getValue()
                )
            );            
        }
        
        idTextField.clear();
        nameTextField.clear();
        cgpaTextField.clear();
        noOfPublicationTextField.clear();
        yearOfExperienceTextField.clear();
        
        isGraduateCheckBox.setSelected(false);
        noOfPublicationTextField.setDisable(true);
        yearOfExperienceTextField.setDisable(true);
    }

    @FXML
    private void showStudentInfoButtonOnClicked(ActionEvent event) {
        String str="List of UG Students:\n";
        for(Student s: studentList){
            str  += s.toString();
        }
        str += "\nList of Graduate Students:\n";
        for(Student s: gradStudentList){
            str  += s.toString();
        }  
        outputLabel.setText(str);
    }

    @FXML
    private void isGRaduateCheckBoxOnClicked(ActionEvent event) {
        if(isGraduateCheckBox.isSelected() == true){
            noOfPublicationTextField.setDisable(false);
            yearOfExperienceTextField.setDisable(false);
        }
        else{
            noOfPublicationTextField.setDisable(true);
            yearOfExperienceTextField.setDisable(true);
        }
    }
    
}
