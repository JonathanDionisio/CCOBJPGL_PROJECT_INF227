package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Action;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
import javafx.scene.shape.*;
import javafx.stage.Stage; 

public class libraryController {

     double pricewd = userpassController.wd.getProductPrice();
          double priceds = userpassController.ds.getProductPrice();
          double priceol = userpassController.ol.getProductPrice();
          double priceoc = userpassController.oc.getProductPrice();
          double pricedl = userpassController.dl.getProductPrice();
          double pricedm = userpassController.dm.getProductPrice();
          double pricept = userpassController.pt.getProductPrice();
          double pricedis = userpassController.dis.getProductPrice();
          double pricetn = userpassController.tn.getProductPrice();
          double pricere = userpassController.re.getProductPrice();




    
    @FXML
    VBox Lvboxleft, Lvboxright;
    
    @FXML
    Group ty;
    @FXML
    Text balanceL;
    @FXML
    private Stage stage;
    @FXML
    Button watchdogsLR, outlastLR, tekkenLR, portalLR,doomLR,residentevilLR,dishonoredLR,dyinglightLR,overcookedLR,darksoulsLR;
    @FXML 
     Pane watchdogspaneL, outlastpaneL, tekken7paneL, portal2paneL,doompaneL,residentevil4paneL,dishonoredpaneL,dyinglightpaneL,overcookedpaneL,darksoulspaneL;
    public void Logout(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/UserNPass.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
       }

       public void goSupport(ActionEvent event)throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("/view/Support.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       }

       public void goCart(ActionEvent event)throws IOException{
       stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        userpassController.mycartcontroller.showItemsleftC(userpassController.cart.getItemListleftC());
        userpassController.mycartcontroller.showItemsrightC(userpassController.cart.getItemListrightC());
        
        // Set initial total amount in checkout page
        

        Scene scene = new Scene(userpassController.homeRootC);
        stage.setScene(scene);
        stage.show();
       }

       public void goLibrary(ActionEvent event)throws IOException{
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        

        Scene scene = new Scene(userpassController.homeRootL);
        stage.setScene(scene);
        stage.show();
       }

       public void goWishlist(ActionEvent event)throws IOException{
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         userpassController.wishlistcontroller.showItemsleftW(userpassController.wish.getItemleftW());
         userpassController.wishlistcontroller.showItemsrightW(userpassController.wish.getItemrightW());   

        Scene scene = new Scene(userpassController.homeRootW);
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
        Parent root = FXMLLoader.load(getClass().getResource("/view/Profile.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       }

       public void goFriends(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/Friends.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       }

       public void goSettings(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       }
       public void showItemsleftL(ArrayList<Pane> itemleftL) {
        for (Pane p : itemleftL) {
            Lvboxleft.getChildren().add(p);
        }
    }
        public void showItemsrightL(ArrayList<Pane> itemrightL) {
        for (Pane b : itemrightL) {
            
            Lvboxright.getChildren().add(b);
        
    }
       ////////////////////////////////////////////////////////
    
}
        public void refund(ActionEvent event) throws IOException {


                Button sourceButton = (Button) event.getSource();

       
             if (sourceButton.equals(watchdogsLR)) {
             watchdogspaneL.setVisible(false);
              balancecal(pricewd);
             } 
             else if (sourceButton.equals(darksoulsLR)){
                darksoulspaneL.setVisible(false);
                 balancecal(priceds);
            }   
             else if (sourceButton.equals(dyinglightLR)){
               dyinglightpaneL.setVisible(false);
                balancecal(pricedl);
            }   
             else if (sourceButton.equals(outlastLR)){
                outlastpaneL.setVisible(false);
                 balancecal(priceol);
            }   
             else if (sourceButton.equals(dishonoredLR)){
                dishonoredpaneL.setVisible(false);
                 balancecal(pricedis);
            }   
             else if (sourceButton.equals(residentevilLR)){
                residentevil4paneL.setVisible(false);
                 balancecal(pricere);
            }   
             else if (sourceButton.equals(tekkenLR)){
               tekken7paneL.setVisible(false);
                balancecal(pricetn);
            }   
             else if (sourceButton.equals(portalLR)){
               portal2paneL.setVisible(false);
                balancecal(pricept);
            }   
             else if (sourceButton.equals(overcookedLR)){
                overcookedpaneL.setVisible(false);
                 balancecal(priceoc);
            }   
             else if (sourceButton.equals(doomLR)){
               doompaneL.setVisible(false);
               balancecal(pricedm);
            }   
            } 

            public void balancecal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  + prays;     
                balanceL.setText(Double.toString(userpassController.balance));

            }
            public void play (ActionEvent event)throws IOException{
                ty.setVisible(true);
              
            }
            public void ok (ActionEvent event)throws IOException{
                ty.setVisible(false);
              
            }

        
       }