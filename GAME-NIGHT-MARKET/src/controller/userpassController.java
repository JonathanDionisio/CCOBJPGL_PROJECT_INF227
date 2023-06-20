package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import BuyModel.Cart;
import BuyModel.Library;
import BuyModel.WishList;
import Games.DarkSouls;
import Games.DisHonored;
import Games.DooM;
import Games.DyingLight;
import Games.OutLast;
import Games.OverCooked;
import Games.PortalTwo;
import Games.ResidentEvil;
import Games.TekkeN;
import Games.WatchDogs;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import javafx.scene.shape.*;


public class userpassController implements Initializable {
    
        static double balance = 1000;
    
        
    
    

        @FXML
        ImageView tite;
        
    
        @FXML
        TextField username;

        @FXML
        Text taeText;

        @FXML
        PasswordField password;

        @FXML
        Button logbut, TAETRY;

        @FXML
        Rectangle tae;

        @FXML
        MainMenuController mainMenuController = null;
        
         @FXML
            static Parent homeRootC,homeRootL,homeRootW = null;   
            
             static Cart cart = new Cart(); 
             static Library lib = new Library(); 
             static WishList wish = new WishList(); 

              static DarkSouls ds = new DarkSouls();  
              static DisHonored dis = new DisHonored();
              static DooM dm = new DooM();
              static DyingLight dl = new DyingLight();
              static OutLast ol = new OutLast();
              static OverCooked oc = new OverCooked();
              static PortalTwo pt = new PortalTwo();
              static ResidentEvil re = new ResidentEvil();
              static TekkeN tn = new TekkeN();
              static WatchDogs wd = new WatchDogs();
             
             @FXML
              static CartController mycartcontroller = null;
              static wishlistController wishlistcontroller = null;
              static libraryController librarycontroller = null;
              
              FXMLLoader cartloader, wishlistloader, libraryloader;
              
              


             @Override
               public void initialize(URL location, ResourceBundle resources) {

                ds.setProductPrice(1000);
                dis.setProductPrice(300);
                dm.setProductPrice(850);
                dl.setProductPrice(550);
                ol.setProductPrice(500);
                oc.setProductPrice(250);
                pt.setProductPrice(150);
                re.setProductPrice(2000);
                tn.setProductPrice(900);
                wd.setProductPrice(800);  
               
            
             try {
              cartloader = new FXMLLoader(getClass().getResource("/view/myCart.fxml"));
              

              homeRootC = cartloader.load();
              
            
             } catch (Exception c) {
              // TODO: handle exceptiond
              c.setStackTrace(null);
              }

             mycartcontroller = cartloader.getController();
              mycartcontroller.vboxleft.getChildren().removeAll(mycartcontroller.vboxleft.getChildren());
             mycartcontroller.vboxright.getChildren().removeAll(mycartcontroller.vboxright.getChildren());
             
              
        
          
        
           
            
            try {
              
              libraryloader = new FXMLLoader(getClass().getResource("/view/MyLibraryy.fxml")); 

              
              homeRootL = libraryloader.load();
            
             } catch (Exception a) {
              // TODO: handle exceptiond
              a.setStackTrace(null);
              }
              librarycontroller = libraryloader.getController();
             librarycontroller.Lvboxleft.getChildren().removeAll(librarycontroller.Lvboxleft.getChildren());
             librarycontroller.Lvboxright.getChildren().removeAll(librarycontroller.Lvboxright.getChildren());
          
          
           
            
            try {
              
              wishlistloader = new FXMLLoader(getClass().getResource("/view/myWishlist.fxml")); 

              
              homeRootW = wishlistloader.load();
            
             } catch (Exception b) {
              // TODO: handle exceptiond
                b.setStackTrace(null);
              }
              wishlistcontroller = wishlistloader.getController();
             wishlistcontroller.Wvboxleft.getChildren().removeAll(wishlistcontroller.Wvboxleft.getChildren());
             wishlistcontroller.Wvboxright.getChildren().removeAll(wishlistcontroller.Wvboxright.getChildren());
          }
          
        
      
           public void login(ActionEvent event) throws  IOException{

            String use = username.getText();
            String ss = password.getText();

           if (use.equals("q") && ss.equals("q")) {


                 Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainMenu.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

           } else {

                 tae.setVisible(true);
                 TAETRY.setVisible(true);
                 taeText.setVisible(true);

           }
        }
        
        
        
        
        
        
        
        
        
        
        
        



             public void Back(ActionEvent event) throws  IOException{


          
                  tae.setVisible(false);
                  TAETRY.setVisible(false);
                  taeText.setVisible(false);
            

          }
       
          

        }
