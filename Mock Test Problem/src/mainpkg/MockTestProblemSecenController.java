
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class MockTestProblemSecenController implements Initializable {

    @FXML private TextField idTextField;
    @FXML private TextField nameTextField;
    @FXML private TextField salaryTextField;
    @FXML private RadioButton maleRadioButton;
    @FXML private RadioButton femaleRadioButton;
    @FXML private ComboBox<String> designationComboBox;
    @FXML private ComboBox<String> departmentComboBox;
    @FXML private DatePicker dobDatePicker;
    @FXML private DatePicker dojDatePicker;
    @FXML private TextArea showEmployeeDataTextArea;
    @FXML private TextArea showAverageSalaryTextArea;
    @FXML private ComboBox<String> searchDepartmentComboBox;
    @FXML private TextField lowerSalaryBoundTextField;
    @FXML private TextField upperSalaryBoundTextField;
    @FXML private Label totalEmployeeLabel;

    private ArrayList<Employee> emList;
    private ToggleGroup tg;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emList = new ArrayList<Employee>();
        departmentComboBox.getItems().addAll(
                "Accounts",
                "HR",
                "Admin",
                "Sales",
                "Production");
        departmentComboBox.setValue("Select a department");
        
        searchDepartmentComboBox.getItems().addAll(
                "Accounts",
                "HR",
                "Admin",
                "Sales",
                "Production");
        
        searchDepartmentComboBox.setValue("Select a department");
        
        designationComboBox.getItems().addAll(
                "Executive",
                "Junior Officer",
                "Senior Officer",
                " Accountant",
                "HR Manager",
                "Director",
                "Engineer");
        
        designationComboBox.setValue("Select a designation");
        
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        
        totalEmployeeLabel.setText("Employee List is currently Empty");
        
    }    

    @FXML
    private void addNewEmployeeButtonOnAction(ActionEvent event) {
        
        int givenId = Integer.parseInt(idTextField.getText());
        for(Employee emp : emList){
            if(givenId == emp.getId()){
                Alert a = new Alert(AlertType.ERROR);
                a.setContentText("OOPs, employee id already exists! \n Can not create a new employee with duplicate ID");
                a.showAndWait();
            }
        }
        
        Employee e = new Employee(
                Integer.parseInt(idTextField.getText()),
                
                nameTextField.getText(),
                (maleRadioButton.isSelected() ? "Male" : "Female"),
                departmentComboBox.getValue(),
                designationComboBox.getValue(),
                Float.parseFloat(salaryTextField.getText()),
                dobDatePicker.getValue(),
                dojDatePicker.getValue()
        );
        
        emList.add(e);
        totalEmployeeLabel.setText("After addition, There are total " + emList.size() +" employee as shown below :");
        showEmployeeDataTextArea.setText(e.toString());
        
        idTextField.clear(); nameTextField.clear(); salaryTextField.clear();
        departmentComboBox.setValue("Select a department");
        designationComboBox.setValue("Select a designation");
    }

    @FXML
    private void showAverageSalaryButtonOnAction(ActionEvent event) {
        String str = searchDepartmentComboBox.getValue();
        int lower = Integer.parseInt(lowerSalaryBoundTextField.getText());
        int upper = Integer.parseInt(upperSalaryBoundTextField.getText());
        
        showAverageSalaryTextArea.setText(
                "Average salary of " + str +
                " department having salary within " +
                lower + " and " + upper +
                " take is: " + getAvgSalary(str,lower,upper) + " taka."
        );
    }
    
    private float getAvgSalary(String givenDept, int lower, int upper){
        float avg = 0.0f, sum = 0.0f;
        int count = 0;
        
        for(Employee emp : emList){
            float salary = emp.getSalary();
            if(emp.getDept().equals(givenDept) && 
               emp.getSalary() >= lower && emp.getSalary() <= upper
            ){
                sum += emp.getSalary();
                count++;
            }
        }
        
        if(sum != 0.0f) avg = sum / count;
        return avg;
    }
    
}
