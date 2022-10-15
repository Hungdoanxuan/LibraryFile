/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.howardcc.cmsy167.exchange;

/**
 *
 * @author Acer
 */
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class changePasswordController {
	private Scene scene;
	@SuppressWarnings("unused")
	private Parent root;
	private Stage stage;
    @FXML
    private TextField newpass;

    @FXML
    private TextField previouspass;

    @SuppressWarnings("unused")
	@FXML
    void changepass(MouseEvent event) throws IOException {
    	Admin ad=new Admin();
    	if(newpass.getText().toString().isEmpty()||previouspass.getText().toString().isEmpty()) {
    		AlertMsg.mainmsg("Fill all fields", "Error");
    	}
    	else {
    		boolean x=ad.changePsuc(previouspass.getText().toString(),newpass.getText().toString());
    		Parent root=FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
    		//Scene scene=new Scene(root);
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene=new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	}
    }
    @FXML
    void GoBack(MouseEvent event) throws IOException {
    	Parent root=FXMLLoader.load(getClass().getResource("/fxml/ActualAdmin.fxml"));
		//Scene scene=new Scene(root);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

}
