package it.polito.tdp.parole;

import java.util.*;


import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextArea txtTime;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	
       txtResult.clear();
       String parola = txtParola.getText();
       
       elenco.addParola(parola);
       
       LinkedList<String> ll = new LinkedList<String>(elenco.getElenco());
       
       for(String p : ll)
       {    txtResult.appendText(p);
    	    txtResult.appendText("\n");   }
       
          txtParola.clear();
          
          Long l = System.nanoTime();
      	  txtTime.appendText(""+l);
      	  txtTime.appendText("\n");
    
    }  

    @FXML
    void doReset(ActionEvent event) {
    	
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    	
    	Long l = System.nanoTime();
    	txtTime.appendText(""+l);
    	txtTime.appendText("\n");
    }
    
    @FXML
    void handleDelete(ActionEvent event) {
    	
   
    	String selected = txtResult.getSelectedText();
    	
    	elenco.eliminaParola(selected);
    	
    	txtResult.clear();
    	
    	LinkedList<String> ll = new LinkedList<String>(elenco.getElenco());
         
         for(String p : ll)
         {  txtResult.appendText(p);
      	    txtResult.appendText("\n");   }
    	
    	Long l = System.nanoTime();
    	txtTime.appendText(""+l);
    	txtTime.appendText("\n");
        
    }
    

    @FXML
    void seleziona(MouseEvent event) {
    	

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
