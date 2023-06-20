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
import Games.WatchDogs;
import javafx.stage.Stage; 


            public class wishlistController {
    
    
    
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
                VBox Wvboxleft, Wvboxright;
                 @FXML
                Text balanceW;
                 @FXML
                Group nocash,ty,deal;
            
                @FXML
                Button   darksoulsWX, outlastWX, watchdogsWX, dyinglightWX, dishonoredWX, overcookedWX, portalWX, residentevilWX, tekkenWX, doomWX,
                 darksoulsWB, outlastWB, watchdogsWB, dyinglightWB, dishonoredWB, overcookedWB, portalWB, residentevilWB, tekkenWB, doomWB,
                 darksoulsWD, outlastWD, watchdogsWD, dyinglightWD, dishonoredWD, overcookedWD, portalWD, residentevilWD, tekkenWD, doomWD;
        
        

          @FXML
           private Stage stage;
            @FXML 
            Pane watchdogspaneW, outlastpaneW, tekken7paneW, portal2paneW,doompaneW,residentevil4paneW,dishonoredpaneW,dyinglightpaneW,overcookedpaneW,darksoulspaneW;
     
         public void WB(ActionEvent event) throws IOException {


         Button sourceButton = (Button) event.getSource();

       
            if (sourceButton.equals(watchdogsWB) && (userpassController.balance >= pricewd)  ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.watchdogspaneL);
             watchdogspaneW.setVisible(false);
             balancecal(pricewd);
             ty.setVisible(true);

             }

             else if (sourceButton.equals(darksoulsWB) && (userpassController.balance >= priceds)  ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.darksoulspaneL);
             darksoulspaneW.setVisible(false);
             balancecal(priceds); 
              ty.setVisible(true); 
                }

              else if (sourceButton.equals(dyinglightWB) && (userpassController.balance >= pricedl) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.dyinglightpaneL);
             dyinglightpaneW.setVisible(false);
              ty.setVisible(true);
             balancecal(pricedl);   
             }

                else if (sourceButton.equals(outlastWB) && (userpassController.balance >= priceol) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.outlastpaneL);
             outlastpaneW.setVisible(false);
              ty.setVisible(true);
              balancecal(priceol);  
                }
        
             else if (sourceButton.equals(overcookedWB) && (userpassController.balance >= priceoc) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.overcookedpaneL);
             overcookedpaneW.setVisible(false);
              ty.setVisible(true);
              balancecal(priceoc);  
                }
        
                else if (sourceButton.equals(residentevilWB) && (userpassController.balance >= pricere) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.residentevil4paneL);
             residentevil4paneW.setVisible(false);
              ty.setVisible(true);
              balancecal(pricere);  
                }
        
            else if (sourceButton.equals(portalWB) && (userpassController.balance >= pricept) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.portal2paneL);
             portal2paneW.setVisible(false);
              ty.setVisible(true);
             balancecal(pricept);   
                }
        
                else if (sourceButton.equals(doomWB) && (userpassController.balance >= pricedm) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.doompaneL);
             doompaneW.setVisible(false);
              ty.setVisible(true);
             balancecal(pricedm);   
             }
        
             else if (sourceButton.equals(dishonoredWB) && (userpassController.balance >= pricedis) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.dishonoredpaneL);
             dishonoredpaneW.setVisible(false);
              ty.setVisible(true);
             balancecal(pricedis);   
                 }
                 
                else if (sourceButton.equals(tekkenWB) && (userpassController.balance >= pricetn) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.tekken7paneL);
             tekken7paneW.setVisible(false);
              ty.setVisible(true);
              balancecal(pricetn);  
                }
         
             else {
             nocash.setVisible(true);
             }
             }
             public void removeWP(ActionEvent event) throws IOException {


                Button sourceButton = (Button) event.getSource();

       
             if (sourceButton.equals(watchdogsWX)) {
             watchdogspaneW.setVisible(false);
             } 
             else if (sourceButton.equals(darksoulsWX)){
                darksoulspaneW.setVisible(false);
            }   
             else if (sourceButton.equals(dyinglightWX)){
               dyinglightpaneW.setVisible(false);
            }   
             else if (sourceButton.equals(outlastWX)){
                outlastpaneW.setVisible(false);
            }   
             else if (sourceButton.equals(dishonoredWX)){
                dishonoredpaneW.setVisible(false);
            }   
             else if (sourceButton.equals(residentevilWX)){
                residentevil4paneW.setVisible(false);
            }   
             else if (sourceButton.equals(tekkenWX)){
               tekken7paneW.setVisible(false);
            }   
             else if (sourceButton.equals(portalWX)){
               portal2paneW.setVisible(false);
            }   
             else if (sourceButton.equals(overcookedWX)){
                overcookedpaneW.setVisible(false);
            }   
             else if (sourceButton.equals(doomWX)){
               doompaneW.setVisible(false);
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
        userpassController.librarycontroller.showItemsleftL(userpassController.lib.getItemleftL());
         userpassController.librarycontroller.showItemsrightL(userpassController.lib.getItemrightL());
       

        Scene scene = new Scene(userpassController.homeRootL);
        stage.setScene(scene);
        stage.show();
       }

       public void goWishlist(ActionEvent event)throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


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
      public void showItemsleftW(ArrayList<Pane> itemleftW) {
        for (Pane p : itemleftW) {
            Wvboxleft.getChildren().add(p);
        }
    }
    public void showItemsrightW(ArrayList<Pane> itemrightW) {
        for (Pane p : itemrightW) {
            
            Wvboxright.getChildren().add(p);
        }
    }
    
    public void balancecal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  - prays;     
                balanceW.setText(Double.toString(userpassController.balance));

            }
            
            public void okty (ActionEvent event)throws IOException{
                ty.setVisible(false);
              
            }
            
            public void nocashok (ActionEvent event)throws IOException{
                nocash.setVisible(false);
              
            }
            public void offerok (ActionEvent event)throws IOException{
                deal.setVisible(false);
              
            }
            public void dealing (ActionEvent event)throws IOException{
                deal.setVisible(true);
              
            }
       /////////////////////////////////////////////////////////////////////
    
}
