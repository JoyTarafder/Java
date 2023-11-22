/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AddCustomerController implements Initializable {

    @FXML
    private TextField CIDTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField contactTextField;
    @FXML
    private TextField addressTextField;
    private ObservableList<Customer> customerList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public ObservableList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ObservableList<Customer> customerList) {
        this.customerList = customerList;
    }

    @FXML
    private void addNewOnClick(ActionEvent event) {
        int CID = Integer.parseInt(CIDTextField.getText());
        String name = nameTextField.getText();
        String address = addressTextField.getText();
        String contact = contactTextField.getText();
        Customer toBeAdded = new Customer(CID, name, address, contact);
        customerList.add(toBeAdded);
        System.out.println(customerList);
    }

    @FXML
    private void viewListOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        FXMLDocumentController p = someLoader.getController();
        p.setCustomerList(this.customerList);
         
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }
    
}
