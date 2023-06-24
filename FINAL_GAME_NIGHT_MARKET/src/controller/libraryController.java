package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.shape.*;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class libraryController implements Initializable{
    
           
    
            double pricewd = userpassController.wd.getProductPrice();
          double priceds = userpassController.ds.getProductPrice();
          double priceol = userpassController.ol.getProductPrice();
          double priceoc = userpassController.oc.getProductPrice();
          double pricedl = userpassController.dl.getProductPrice();
          double pricedm = userpassController.dm.getProductPrice();
          double pricept = userpassController.pt.getProductPrice();
          double pricedd = userpassController.dd.getProductPrice();
          double pricetn = userpassController.tn.getProductPrice();
          double pricere = userpassController.re.getProductPrice();
    @FXML
           Group  ty4p;
    
    @FXML
    Text Mname, Lbalance;
    
    @FXML
             Stage stage;
    @FXML
    VBox Lvboxleft, Lvboxright;
    @FXML
     Button wdr, dsr, tnr, olr, ocr, dlr, dmr, ddr, ptr, rer;    
    @FXML 
     Pane watchdogspaneL, outlastpaneL, tekken7paneL, portal2paneL,doompaneL,residentevil4paneL,dishonoredpaneL,dyinglightpaneL,overcookedpaneL,darksoulspaneL;
    @FXML
    Rectangle libraryBG;
    @FXML
    static Color backgroundColor;
    
     @Override
     public void initialize(URL location, ResourceBundle resources) {
         // TODO Auto-generated method stub
        clearVbox();

        showLL(userpassController.lib.getLL());

        showLR(userpassController.lib.getLR());
        initializeUsername();
        initializeBG();

        Lbalance.setText(Double.toString(userpassController.balance));
     }

        public void clearVbox() {

         if (Lvboxleft != null) {
             System.out.println("vbox is not null");
             Lvboxleft.getChildren().removeAll(Lvboxleft.getChildren());
         }

         if (Lvboxright != null) {
             System.out.println("vbox is not null");
             Lvboxright.getChildren().removeAll(Lvboxright.getChildren());
         }
     }

        public void Logout(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/UserNPass.fxml"));
        Parent root = loader.load();
       

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void goSupport(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Support.fxml"));
        Parent root = loader.load();
       

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void goCart(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/myCart.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void goLibrary(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MyLibraryy.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void goWishlist(ActionEvent event)throws IOException{
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/myWishlist.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void home(ActionEvent event)throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainMenu.fxml"));
                 Parent root = loader.load();
                
    
                 Scene scene = new Scene(root);
                 stage.setScene(scene);
                 stage.show();

       }

       public void goProfile(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Profile.fxml"));
        Parent root = loader.load();
       

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void goFriends(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Friends.fxml"));
        Parent root = loader.load();
       

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

       public void goSettings(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/settings.fxml"));
        Parent root = loader.load();
       

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
       
       
       
       
       
       public void refund(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

         Button sourceButton = (Button) event.getSource();

       

         // If addtocart button is pressed, set product status to true
         if (sourceButton.equals(wdr))  {
           
           
            refundcal(pricewd);
            watchdogspaneL.setVisible(false);
         }

         else if (sourceButton == dsr ) {
           
             
             refundcal(priceds);
             darksoulspaneL.setVisible(false);
        }

         else if (sourceButton == tnr ) {
            
            
            refundcal(pricetn);
            tekken7paneL.setVisible(false);
         }

         else if (sourceButton == dlr ) {
           
            
            refundcal(pricedl);
            dyinglightpaneL.setVisible(false);
        }
        
        else if (sourceButton == rer ) {
           
            
            refundcal(pricere);
            residentevil4paneL.setVisible(false);
        }
        
        else if (sourceButton == ocr ) {
           
           refundcal(priceoc);
           overcookedpaneL.setVisible(false);
        }
        
         else if (sourceButton == dmr ) {
           
             
             refundcal(pricedm);
             doompaneL.setVisible(false);
         }
        
         else if (sourceButton == ddr ) {
           
             
             refundcal(pricedd);
             dishonoredpaneL.setVisible(false);
        }
        
         else if (sourceButton == olr ) {
           
            
            refundcal(priceol);
            outlastpaneL.setVisible(false);
       }
        
       else if (sourceButton == ptr ) {
           
           
            refundcal(pricept);
            portal2paneL.setVisible(false);
        }
        
        
     }
     
     public void refundcal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  + prays;     
                Lbalance.setText(Double.toString(userpassController.balance));

            }
         public void PLAY(ActionEvent event) throws IOException {

             ty4p.setVisible(true);
       
    
     }
        
        
        
         public void closety(ActionEvent event) throws IOException {

             ty4p.setVisible(false);
       
    
     }
       
       public void showLL(ArrayList<Pane> itemleftL) {
        for (Pane p : itemleftL) {
            Lvboxleft.getChildren().add(p);
        }
    }
        public void showLR(ArrayList<Pane> itemrightL) {
        for (Pane b : itemrightL) {
            
            Lvboxright.getChildren().add(b);
        
        }
    }

    public void initializeBG() {
        if (backgroundColor != null) {
            libraryBG.setFill(backgroundColor);
        }
    }

        public void initializeUsername() {
        Mname.setText(userpassController.username);
    }  
            public void playPACMAN(ActionEvent event) throws IOException {
                openSwingFile();
          
            }

        private void openSwingFile() {
    // Specify the path to your Swing file
    String filePath = "D://PanibagongVSCFiles//Dionisio_Game_Night_Market//Dionisio_Game_Night_Market//PacManJar//tonayun.jar";

    // Create a File object with the file path
    File file = new File(filePath);

            // Check if the Desktop class is supported on the current platform
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    // Open the Swing file with the default system application
                    desktop.open(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

   
     }
       ////////////////////////////////////////////////////////

