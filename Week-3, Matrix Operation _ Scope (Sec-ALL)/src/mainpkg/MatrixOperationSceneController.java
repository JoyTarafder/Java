package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MatrixOperationSceneController implements Initializable {

    @FXML    private TextField noOfRowsOfMatrix1TextField;
    @FXML    private TextField noOfColsOfMatrix1TextField;
    @FXML    private TextField noOfRowsOfMatrix2TextField;
    @FXML    private TextField noOfColsOfMatrix2TextField;
    @FXML    private TextField matrix1ElementTextField;
    @FXML    private TextField matrix2UpperBoundTextField;
    @FXML    private Label outputLabel;
    @FXML    private Label elementIndexLabel;
    @FXML    private ComboBox<String> operationComboBox;
    //@FXML    private ComboBox<Integer> secNoComboBox;
    @FXML    private RadioButton matrix1RadioButton;
    @FXML    private RadioButton matrix2RadioButton;
    
    ToggleGroup tg, tg2;
    
    Matrix m1=null,m2=null,m3=null;
    int currentRowIndex=-1, currentColIndex=-1;
    int[][] temp ;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*m1 = new Matrix();
        m2 = new Matrix(5,5,100);
        String str = "Defalut value of Matrix-1\n"
                    + m1.getStringEquivalentOfMatrix()
                    + "\nDefalut value of Matrix-2\n"
                    +  m2.toString();
        */
        
        outputLabel.setText("Generate Matrix & Select an Operation...");            
        operationComboBox.getItems().add("Matrix Addition");
        operationComboBox.getItems().addAll(
                                "Matrix Subtraction",
                                "Matrix Multiplication",
                                "Transpose a Matrix",
                                "Inverse  a Matrix",
                                "Determinant of a Matrix"
                                    );
        matrix1RadioButton.setDisable(true);
        matrix2RadioButton.setDisable(true);
        tg = new ToggleGroup();
        matrix1RadioButton.setToggleGroup(tg);
        matrix2RadioButton.setToggleGroup(tg);
        
    }    


    
    @FXML
    private void addElementToMatrix1ButtonOnClicked(ActionEvent event) {
        int rows, cols;
        rows = Integer.parseInt(noOfRowsOfMatrix1TextField.getText());
        cols = Integer.parseInt(noOfColsOfMatrix1TextField.getText());
        
        if(currentRowIndex==-1 && currentColIndex==-1){
            m1 = new Matrix(rows,cols);
            //temp = new int[rows][cols];
            currentRowIndex = currentColIndex = 0;
        }

       
        m1.setMatrixElement(
            currentRowIndex,
            currentColIndex,
            Integer.parseInt(matrix1ElementTextField.getText())
        );
        
        matrix1ElementTextField.clear();
        if(currentColIndex < cols-1){       //4 X 5
             currentColIndex++;
        }
        else{
            if(currentRowIndex < rows-1){
                currentRowIndex++;
                currentColIndex=0;
            }
            else{
                Alert a = new Alert(AlertType.WARNING);
                a.setContentText("Oops! Matrix overflow.\n"
                    + "Could not add the element...");
                a.showAndWait();
            }
            elementIndexLabel.setText(
                "Enter[" + currentRowIndex + "][" + currentColIndex + "]:"
            );
        }
        //if(currentRowIndex == rows-1 && currentColIndex == cols-1){
            //m1.vals = temp;
        //}
    }

    @FXML
    private void generateMatrix2ButtonOnClicked(ActionEvent event) {
    
        m2 = new Matrix(
            Integer.parseInt(noOfRowsOfMatrix2TextField.getText()),
            Integer.parseInt(noOfColsOfMatrix2TextField.getText()),
            Integer.parseInt(matrix2UpperBoundTextField.getText())
                
        );
    
    }

    @FXML
    private void executeOperationAndShowButtonOnClicked(ActionEvent event) {
        if(operationComboBox.getValue().equals("Matrix Addition"))
            addMatricesAndShow();
        else if(operationComboBox.getValue().equals("Matrix Subtraction"))
            subtractMatricesAndShow();
        else if(operationComboBox.getValue().equals("Matrix Multiplication"))
            multiplyMatricesAndShow();
        else if(operationComboBox.getValue().equals("Transpose a Matrix"))
            transposeMatrixAndShow();
        else if(operationComboBox.getValue().equals("Inverse  a Matrix"))
            inverseMatrixAndShow();
        else if(operationComboBox.getValue().equals("Determinant of a Matrix"))
            findDeterminantOfAMatrixAndShow();
        
    }

    @FXML
    private void operationComboBoxOnItemSelected(ActionEvent event) {
        if(
            operationComboBox.getValue().equals("Transpose a Matrix")
                ||
            operationComboBox.getValue().equals("Inverse a Matrix")   
                ||
            operationComboBox.getValue().equals("Determinant of a Matrix")    
        ){
            matrix1RadioButton.setDisable(false);
            matrix2RadioButton.setDisable(false);
        }
        else{
            matrix1RadioButton.setDisable(true);
            matrix2RadioButton.setDisable(true);
            matrix1RadioButton.setSelected(false);
            matrix2RadioButton.setSelected(false);
        }
    }

    private void addMatricesAndShow() {
        if(m1==null || m2==null){
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Oops! One or Both matrices is/are not generated.\n"
                    + "Can't perform Matrix Addition...");
            a.showAndWait();
            return;        
        }
        m3 = m1.addMatrices(m2);
        String str="";
        if(m3 == null){
            str = "Oops! Dimension mismatch!\n Matrix operation aborted.";
        }
        else{
            str =  "Matrix-1\n"
                + m1.toString()
                + "\nMatrix-2\n"
                + m2.getStringEquivalentOfMatrix()
                + "\n\nAdded Matrix\n"
                + m3.toString();
        }
        outputLabel.setText(str);
    }

    private void subtractMatricesAndShow(){
        //to do
    }
    private void multiplyMatricesAndShow(){
        //to do
    }
    private void transposeMatrixAndShow(){
        if(matrix1RadioButton.isSelected() && m1!=null){
            String str =  "Matrix-1 Aefore Transpose\n"+ m1.toString();
            outputLabel.setText(str);
            m1.transposeMAtrix();
            str = "\nMatrix-2 After Transpose\n"+  m1.toString();
            outputLabel.setText(str);
        }
        else if (matrix2RadioButton.isSelected() && m2!=null){
           String str =  "Matrix-2 Aefore Transpose\n"+ m2.toString();
            outputLabel.setText(str);
            m2.transposeMAtrix();
            str = "\nMatrix-2 After Transpose\n"+  m2.toString();
            outputLabel.setText(str);
        }
    }
    private void inverseMatrixAndShow(){
        //to do
    }
    private void findDeterminantOfAMatrixAndShow(){
        //to do
    }   

    @FXML
    private void resetMatricesButtonOnClicked(ActionEvent event) {
        /*
        //x=13;
        int x=10;
        int j=0;
        for(int i=0; i<10; i++){
            System.out.println("i=" + i);
            j++;
            
            {
                int k=30;
                System.out.println("i=" + i);
                System.out.println("k=" + k);
            }
            System.out.println("k=" + k);
        }
        
        System.out.println("x=" + x);
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
        */
        
        
        
        
        
        m1=m2=m3=null;
        outputLabel.setText("");
    }
}
