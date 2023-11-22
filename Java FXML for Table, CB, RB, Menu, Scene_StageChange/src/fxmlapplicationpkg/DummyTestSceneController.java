package fxmlapplicationpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;


public class DummyTestSceneController implements Initializable {

    @FXML    private TreeTableView<Student> studentTableView;
    @FXML    private TreeTableColumn<Student, Integer> idTableColumn;
    @FXML    private TreeTableColumn<Student, String> nameTableColumn;
    @FXML    private TreeTableColumn<Student, String> cgpaTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
