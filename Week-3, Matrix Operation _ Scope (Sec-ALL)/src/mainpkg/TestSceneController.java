/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class TestSceneController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Product p1 = new Product();
        p1.id = 123;
        p1.price = 2000f;
        //p1.showProductToConsole();
        //Product p2 = new Product(123,  "Lux 90 gm", "Bath Soap", 80f);
        //p2.showProductToConsole();
        //System.out.println(p2.toString());
        //System.out.println(p2);
        
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix(6,7);
        Matrix m3 = new Matrix(3,4,50);
        System.out.println(
                "Matrix m1\n"+m1.toString()
                + "\n\nMatrix m2\n"+m2
                + "\n\nMatrix m3\n"+m3.toString()
        );
        
        // TODO
    }    
    
}
