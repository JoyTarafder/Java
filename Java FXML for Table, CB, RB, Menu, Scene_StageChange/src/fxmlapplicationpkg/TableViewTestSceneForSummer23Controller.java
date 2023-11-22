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
public class TableViewTestSceneForSummer23Controller implements Initializable {

    @FXML    private TableView<Student> studentTableView;
    @FXML    private TableColumn<Student, String> idTableColumn;
    @FXML    private TableColumn<Student, String> cgpaTableColumn;
    @FXML    private TableColumn<Student, String> namedTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
