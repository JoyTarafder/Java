package mainPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FXML_MID_SET_CController implements Initializable {

    @FXML
    private TextField enterElementTextField;
    @FXML
    private TextArea resultTextArea;
    @FXML
    private RadioButton forwardradioButton;
    @FXML
    private RadioButton backwardradioButton;
    @FXML
    private ComboBox<String> selectOddEvenComboBox;
    @FXML
    private RadioButton arr1RadioButton;
    @FXML
    private RadioButton arr2RadioButton;
    @FXML
    private RadioButton arr3RadioButton;
    @FXML
    private Label traversedResultLabel;

    private ToggleGroup tg1, tg2;

    private ArrayList<Integer> valList = new ArrayList<>(); // Requirement per question

    private MyArray arr1;
    private MyArray arr2; //requirement per question
    private MyArray arr3;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        tg1 = new ToggleGroup();
        forwardradioButton.setToggleGroup(tg1); //to make mutually exclusive radio buttons
        backwardradioButton.setToggleGroup(tg1);

        tg2 = new ToggleGroup();
        arr1RadioButton.setToggleGroup(tg2);
        arr2RadioButton.setToggleGroup(tg2);
        arr3RadioButton.setToggleGroup(tg2);

        selectOddEvenComboBox.getItems().addAll("Odd", "Even"); //populating the combo box as per question
    }

    @FXML
    private void addElementToValListButtonOnClick(ActionEvent event) {

        String userInput = enterElementTextField.getText(); // User input of values

        // Trying to convert the user input to an integer
        int element = Integer.parseInt(userInput);

        // Adding the element to the valList ArrayList
        valList.add(element);

        // Clearing the text field after adding the element
        enterElementTextField.clear();

    }

    @FXML
    private void instantiateArr1AndClearValListButtonOnClick(ActionEvent event) {

        // Creating errAlert copy of valList for arr1 so it doesn't become empty when we use valList.clear()
        ArrayList<Integer> arr1Vals = new ArrayList<>(valList);

        // Instantiate MyArray arr1 with the copy of valList
        arr1 = new MyArray(arr1Vals);

        // Build the output with content and size of array
        StringBuilder output = new StringBuilder(resultTextArea.getText());
        output.append("Content of MyArray instance arr1: ");
        output.append(arr1.getVals()); // Assuming getVals() returns the ArrayList content
        output.append("\nSize of arr1 = ");
        output.append(arr1Vals.size()); // Use the size of the copy

        // Set the output in the resultTextArea
        resultTextArea.setText(output.toString() + "\n");

        // Clearing the valList ArrayList as per qustion requirement
        valList.clear();
    }

    @FXML
    private void instantiateArr2AndClearValListButtonOnClick(ActionEvent event) {

        // Creating errAlert copy of valList for arr2 so it doesn't become empty/null when we invoke valList.clear()
        ArrayList<Integer> arr2Vals = new ArrayList<>(valList);

        // Instantiate MyArray arr2 with valList
        arr2 = new MyArray(arr2Vals);

        // Building the output with content and size of array
        StringBuilder output = new StringBuilder(resultTextArea.getText());
        output.append("\nContent of MyArray instance arr2: ");
        output.append(arr2.getVals()); // Assuming getVals() returns the ArrayList content
        output.append("\nSize of arr2 = ");
        output.append(arr2Vals.size());

        // Set the output in the resultTextArea
        resultTextArea.setText(output.toString() + "\n");

        // Clearing the valList ArrayList as per qustion requirement
        valList.clear();
    }

    @FXML
    private void mergeAndShowButtonOnClick(ActionEvent event) {

        // Optional Debuggin code: Check if arr1 and arr2 are null
        System.out.println("arr1 is null: " + (arr1 == null));
        System.out.println("arr2 is null: " + (arr2 == null));

        // Optional Debug: Check if arr1 and arr2 are empty
        if (arr1 != null) {
            System.out.println("arr1 is empty: " + arr1.getVals().isEmpty());
        }
        if (arr2 != null) {
            System.out.println("arr2 is empty: " + arr2.getVals().isEmpty());
        }

        // Checking if either arr1 or arr2 is null or empty
        // Handling the case where either arr1 or arr2 is null or empty
        if (arr1 == null || (arr1.getVals() == null || arr1.getVals().isEmpty())
                || arr2 == null || (arr2.getVals() == null || arr2.getVals().isEmpty())) {

            /*Alert is a class in JavaFX that represents a dialog box 
             used for displaying messages or alerts to the user.
             It's part of the JavaFX library, and we need to 
             import javafx.scene.control.Alert to use it.*/
            Alert errAlert = new Alert(Alert.AlertType.ERROR);
            errAlert.setTitle("Error Alert");
            errAlert.setHeaderText("Fatal Error!");
            errAlert.setContentText("Either arr1 or arr2 is empty or not properly initialized.");
            errAlert.showAndWait();

//          resultTextArea.setText("Error: Either arr1 or arr2 is empty or not properly initialized."); // Simple error output
            return; // Exiting the method and returning nothing!
        }

        // Merge arr1 and arr2 into arr3 using the model class method
        if (arr3 == null) {
            arr3 = new MyArray(new ArrayList<>());
        }

        arr3.merge(arr1);
        arr3.merge(arr2);

        StringBuilder output = new StringBuilder(); // Build the output with content and size information for arr1, arr2, and arr3

        output.append("Content of MyArray instance arr1: ");
        output.append(arr1.getVals());
        output.append("\nSize of arr1 = ");
        output.append(arr1.getVals().size()).append("\n");

        output.append("\nContent of MyArray instance arr2: ");
        output.append(arr2.getVals());
        output.append("\nSize of arr2 = ");
        output.append(arr2.getVals().size()).append("\n");

        output.append("\nContent of Merged instance arr3: ");
        output.append(arr3.getVals());
        output.append("\nSize of arr3 = ");
        output.append(arr3.getVals().size());

        resultTextArea.setText(output.toString()); // Setting the expected output in the resultTextArea

    }

    private String getSelectedArrayName() { // Helper method to get the selected MyArray instance name

        if (arr1RadioButton.isSelected()) {
            return "arr1";
        } else if (arr2RadioButton.isSelected()) {
            return "arr2";
        } else if (arr3RadioButton.isSelected()) {
            return "arr3";
        } else {
            return ""; // Return an empty string by default
        }
    }

    private MyArray getSelectedArray() { // Helper method to get the selected MyArray instance

        if (arr1RadioButton.isSelected()) {
            return arr1;
        } else if (arr2RadioButton.isSelected()) {
            return arr2;
        } else if (arr3RadioButton.isSelected()) {
            return arr3;
        }
        return null;
    }

    @FXML
    private void traverseAndShowButtonOnClick(ActionEvent event) {

        MyArray selectedArray = getSelectedArray(); // Check if either arr1, arr2, or arr3 is selected

        String selectedArrayName = getSelectedArrayName();

        if (selectedArray != null) {

            String selectedOddEven = selectOddEvenComboBox.getValue(); // Check if "Odd" or "Even" is selected in the ComboBox

            if (selectedOddEven != null) {

                // Traverse and filter the elements based on the selected sequence and odd/even criteria
                ArrayList<Integer> filteredElements = traverseAndFilter(selectedArray, selectedOddEven); //we could also directly
                //send selectOddEvenComboBox.getValue() as argument here instead of selectedOddEven

                // Update the label with the filtered elements
                traversedResultLabel.setText(selectedOddEven + " elements of " + selectedArrayName + " in "
                        + (forwardradioButton.isSelected() ? "forward" : "backward") + " order are: " + filteredElements);
                // The (condition ? valueIfTrue : valueIfFalse) is called a ternary conditional operator,
                // and it's a concise way to represent an if-else statement in a single line.

                // Alternative code to the ternary condition
                /* String direction;
                if (forwardradioButton.isSelected()) {
                    direction = "forward";
                } else {
                    direction = "backward";
                }*/
            }
        }
    }

    private ArrayList<Integer> traverseAndFilter(MyArray array, String oddOrEven) { // Create a method called traverseAndFilter that takes two parameters:
        // 1. 'array' - an instance of MyArray
        // 2. 'oddOrEven' - a string that can be "Even" or "Odd"

        ArrayList<Integer> filteredResult = new ArrayList<>(); // Create an ArrayList to store the filtered elements.

        if (array != null) { // Check if the 'array' is not null (meaning it exists).

            ArrayList<Integer> elements = array.getVals(); // Get the elements (numbers) from the 'array' and store them in a new ArrayList called 'elements'.

            boolean isEven = oddOrEven.equals("Even");

            // Check if 'oddOrEven' is "Even" and store the result in 'isEven'. 
            // If it's "Even", 'isEven' will be true; otherwise, it will be false.
            if (backwardradioButton.isSelected()) {
                // Check if the 'backwardradioButton' is selected (if the user wants to traverse backward).

                for (int i = elements.size() - 1; i >= 0; i--) { // Start a loop that goes through 'elements' in reverse order (from the last element to the first).
                    
                    int element = elements.get(i);

                    if ((element % 2 == 0 && isEven) || (element % 2 != 0 && !isEven)) { // Check if the current 'element' is either even and 'isEven' is true,
                        // or it's odd and 'isEven' is false.
                        filteredResult.add(element);
                    }
                }
            } else { // Forward selection
                for (int i = 0; i < elements.size(); i++) {
                    int element = elements.get(i);

                    if ((element % 2 == 0 && isEven) || (element % 2 != 0 && !isEven)) {
                        filteredResult.add(element); // If the conditions are met, we add the 'element' to 'filteredResult'.

                    }
                }
            }
        }
        return filteredResult;
    }

}
