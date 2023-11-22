/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class MidExamSceneController implements Initializable {

    @FXML
    private TextField valListTextField;
    @FXML
    private ComboBox<String> selectEvenOrOddComboBox;
    @FXML
    private RadioButton forwardRadioButton;
    @FXML
    private RadioButton backwardRadioButton;
    @FXML
    private RadioButton arr1RadioButton;
    @FXML
    private RadioButton arr2RadioButton;
    @FXML
    private RadioButton arr3RadioButton;
    @FXML
    private TextArea showTraverseResultTextArea;

    @FXML
    private TableView<MyArray> arrayTable;
    @FXML
    private TableColumn<MyArray, String> arrayName;
    @FXML
    private TableColumn<MyArray, Integer []> arrayElement;
    @FXML
    private TableColumn<MyArray, Integer> arraySize;
    @FXML
    private TableColumn<MyArray, Float> arrayAvg;
    
    ToggleGroup tg, tg2;
    private ObservableList<MyArray> arrayList = FXCollections.observableArrayList();

    MyArray arr1=null,arr2=null,arr3=null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        arrayName.setCellValueFactory(new PropertyValueFactory<MyArray, String>("arrayName"));
        arrayElement.setCellValueFactory(new PropertyValueFactory<MyArray, Integer []>("valList"));
        arraySize.setCellValueFactory(new PropertyValueFactory<MyArray, Integer>("arraySize"));
        arrayAvg.setCellValueFactory(new PropertyValueFactory<MyArray, Float>("avgArray"));
        
        selectEvenOrOddComboBox.getItems().addAll(
                                "Even",
                                "Odd"
                                    );
        selectEvenOrOddComboBox.setValue("Select");

        tg = new ToggleGroup();
        forwardRadioButton.setToggleGroup(tg);
        backwardRadioButton.setToggleGroup(tg);
        tg = new ToggleGroup();
        arr1RadioButton.setToggleGroup(tg2);
        arr2RadioButton.setToggleGroup(tg2);
        arr3RadioButton.setToggleGroup(tg2);
    }
    
    public ObservableList<MyArray> getCustomerList() {
        return arrayList;
    }

    public void setCustomerList(ObservableList<MyArray> arrayList) {
        this.arrayList = arrayList;
        arrayTable.setItems(this.arrayList);
    }    

    @FXML
    private void addElementValListButtonOnAction(ActionEvent event) {
//        int vList = Integer.parseInt(valListTextField.getText());
//        MyArray tobeAdded = new MyArray(Integer.parseInt(valListTextField.getText()));
//        arrayList.add(tobeAdded);
    }

    @FXML
    private void instantiateArr1AndClearValListButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void instantiateArr2AndClearValListButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void merageArraysbuttononClick(ActionEvent event) {
    }

    @FXML
    private void showArrayInfoToTableViewButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void traverseAndShowButtonOnClick(ActionEvent event) {
    }
    
}
