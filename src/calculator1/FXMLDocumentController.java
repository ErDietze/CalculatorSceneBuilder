/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author SenfDietze
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnadd;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmul;
    @FXML
    private Button btndiv;
    @FXML
    private Button btnclear;
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    
    @FXML
    private Label lblanswer;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int num1, num2, answer;
        char symbol;

if(event.getSource()==btnclear){
    txtnum1.setText("");
    txtnum2.setText("");
    txtnum2.setText("?");
    txtnum2.requestFocus();
    return;
}

//read numbers in from the textfiekd
num1=Integer.parseInt(txtnum1.getText());
num2=Integer.parseInt(txtnum2.getText());
if(event.getSource()==btnadd){
    
    
   
}
if(event.getSource()==btnsub){
   
}
if(event.getSource()==btnmul){
   
}
if(event.getSource()==btnadd){
   
}

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
