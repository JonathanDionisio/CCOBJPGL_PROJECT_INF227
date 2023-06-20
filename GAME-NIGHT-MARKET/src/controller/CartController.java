package controller;

import java.io.IOException;

import javax.swing.Action;

import Games.WatchDogs;
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
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.shape.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.stage.Stage; 

public class CartController  implements Initializable{
    
          
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
    private Stage stage;
    @FXML
    VBox vboxleft, vboxright;
    @FXML
    Text balanceC;
    @FXML
    Group nocash,ty,giftfriends;
    @FXML
    Button  darksoulsCX, outlastCX, watchdogsCX, dyinglightCX, dishonoredCX, overcookedCX, portalCX, residentevilCX, tekkenCX, doomCX,
            darksoulsCBB, outlastCBB, watchdogsCBB, dyinglightCBB, dishonoredCBB, overcookedCBB, portalCBB, residentevilCBB, tekkenCBB, doomCBB,
            darksoulsCGF, outlastCGF, watchdogsCGF, dyinglightCGF, dishonoredCGF, overcookedCGF, portalCGF, residentevilCGF, tekkenCGF, doomCGF,
            K,G1,G2,G3,G4;
    @FXML 
    Pane  watchdogspane, outlastpane, tekken7pane, portal2pane,doompane,residentevil4pane,dishonoredpane,dyinglightpane,overcookedpane,darksoulspane;
        
             public void initialize(URL location, ResourceBundle resources) {

                balanceC.setText(Double.toString(userpassController.balance));       
                

             }
        
            public void balancecal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  - prays;     
                balanceC.setText(Double.toString(userpassController.balance));

            }
        
         public void CBB(ActionEvent event) throws IOException {


         Button sourceButton = (Button) event.getSource();

       
            if (sourceButton.equals(watchdogsCBB) && (userpassController.balance >= pricewd)  ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.watchdogspaneL);
             watchdogspane.setVisible(false);
             balancecal(pricewd);
             ty.setVisible(true);

             }

             else if (sourceButton.equals(darksoulsCBB) && (userpassController.balance >= priceds)  ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.darksoulspaneL);
             darksoulspane.setVisible(false);
             balancecal(priceds); 
              ty.setVisible(true); 
                }

              else if (sourceButton.equals(dyinglightCBB) && (userpassController.balance >= pricedl) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.dyinglightpaneL);
             dyinglightpane.setVisible(false);
              ty.setVisible(true);
             balancecal(pricedl);   
             }

                else if (sourceButton.equals(outlastCBB) && (userpassController.balance >= priceol) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.outlastpaneL);
             outlastpane.setVisible(false);
              ty.setVisible(true);
              balancecal(priceol);  
                }
        
             else if (sourceButton.equals(overcookedCBB) && (userpassController.balance >= priceoc) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.overcookedpaneL);
             overcookedpane.setVisible(false);
              ty.setVisible(true);
              balancecal(priceoc);  
                }
        
                else if (sourceButton.equals(residentevilCBB) && (userpassController.balance >= pricere) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.residentevil4paneL);
             residentevil4pane.setVisible(false);
              ty.setVisible(true);
              balancecal(pricere);  
                }
        
            else if (sourceButton.equals(portalCBB) && (userpassController.balance >= pricept) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.portal2paneL);
             portal2pane.setVisible(false);
              ty.setVisible(true);
             balancecal(pricept);   
                }
        
                else if (sourceButton.equals(doomCBB) && (userpassController.balance >= pricedm) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.doompaneL);
             doompane.setVisible(false);
              ty.setVisible(true);
             balancecal(pricedm);   
             }
        
             else if (sourceButton.equals(dishonoredCBB) && (userpassController.balance >= pricedis) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.dishonoredpaneL);
             dishonoredpane.setVisible(false);
              ty.setVisible(true);
             balancecal(pricedis);   
                 }
                 
                else if (sourceButton.equals(tekkenCBB) && (userpassController.balance >= pricetn) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.tekken7paneL);
             tekken7pane.setVisible(false);
              ty.setVisible(true);
              balancecal(pricetn);  
                }
         
             else {
             nocash.setVisible(true);
             }
                 }
                 
                 
                 public void ok(ActionEvent event) throws IOException {
                 ty.setVisible(false);

                 }
                 public void nvrm(ActionEvent event) throws IOException {
                 giftfriends.setVisible(false);

                 }
                 
                 
                  public void gifted(ActionEvent event) throws IOException {


                    Button sourceButton = (Button) event.getSource();

       
                     if (sourceButton.equals(G1) && (userpassController.balance >= pricewd)  ) {
           
                        userpassController.lib.addItemleftL(userpassController.librarycontroller.watchdogspaneL);
                        giftfriends.setVisible(false);
                        balancecal(pricewd);
                        ty.setVisible(true);

                        }

                            else if (sourceButton.equals(G2) && (userpassController.balance >= priceds)  ) {
                        
                            userpassController.lib.addItemleftL(userpassController.librarycontroller.darksoulspaneL);
                            giftfriends.setVisible(false);
                            balancecal(priceds); 
                            ty.setVisible(true); 
                                }
                               
                                 else if (sourceButton.equals(G3) && (userpassController.balance >= priceol)  ) {
                        
                            userpassController.lib.addItemleftL(userpassController.librarycontroller.outlastpaneL);
                                    giftfriends.setVisible(false);
                            balancecal(priceds); 
                            ty.setVisible(true); 
                                }
                                
                                 else if (sourceButton.equals(G4) && (userpassController.balance >= pricedl)  ) {
                        
                            userpassController.lib.addItemleftL(userpassController.librarycontroller.dyinglightpaneL);
                            giftfriends.setVisible(false);
                            balancecal(priceds); 
                            ty.setVisible(true); 
                                }
                                else{
                                nocash.setVisible(true);
                                    giftfriends.setVisible(false);
                                }
                            }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 

                 
              public void giftt(ActionEvent event) throws IOException {


                Button sourceButton = (Button) event.getSource();

       
             if (sourceButton.equals(watchdogsCGF)) {
             giftfriends.setVisible(true);
             } 
             else if (sourceButton.equals(darksoulsCGF)){
                giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(dyinglightCGF)){
               giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(outlastCGF)){
                giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(dishonoredCGF)){
                giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(residentevilCGF)){
                giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(tekkenCGF)){
               giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(portalCGF)){
               giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(overcookedCGF)){
                giftfriends.setVisible(true);
            }   
             else if (sourceButton.equals(doomCGF)){
               giftfriends.setVisible(true);
            }   
            }   
                 
                   
              public void removeLP(ActionEvent event) throws IOException {


                Button sourceButton = (Button) event.getSource();

       
             if (sourceButton.equals(watchdogsCX)) {
             watchdogspane.setVisible(false);
             } 
             else if (sourceButton.equals(darksoulsCX)){
                darksoulspane.setVisible(false);
            }   
             else if (sourceButton.equals(dyinglightCX)){
               dyinglightpane.setVisible(false);
            }   
             else if (sourceButton.equals(outlastCX)){
                outlastpane.setVisible(false);
            }   
             else if (sourceButton.equals(dishonoredCX)){
                dishonoredpane.setVisible(false);
            }   
             else if (sourceButton.equals(residentevilCX)){
                residentevil4pane.setVisible(false);
            }   
             else if (sourceButton.equals(tekkenCX)){
               tekken7pane.setVisible(false);
            }   
             else if (sourceButton.equals(portalCX)){
               portal2pane.setVisible(false);
            }   
             else if (sourceButton.equals(overcookedCX)){
                overcookedpane.setVisible(false);
            }   
             else if (sourceButton.equals(doomCX)){
               doompane.setVisible(false);
            }   
            }  
                 
                
                
                 
                 
                 
                 
                
                 
                 
                 
                 
                
                 

        
         public void poop(ActionEvent event)throws IOException{
                nocash.setVisible(false);
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

       public void showItemsleftC(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            vboxleft.getChildren().add(p);
            
        }
    }
        public void showItemsrightC(ArrayList<Pane> tae) {
        for (Pane a : tae) {
            
             vboxright.getChildren().add(a);
        }
        
         
    }
    }

       /////////////////////////////////////////////////////
    //     public static void toggleVisibility (String item) throws IOException {
    //     if (item.equals("watchdog")) {

    //       watchdogsGroup.setVisible(true);

    //    }
    //   }

