package controller;


import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

import javax.swing.Action;
import javax.xml.transform.Source;

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
import javafx.scene.Group;
import javafx.stage.Stage; 
import Games.*;


public class MainMenuController implements Initializable {

        @FXML
        ImageView tite,  wdGIF, wdp1, wdp;
        
    
        @FXML
        TextField username;

        @FXML
        Text wdprice, dsprice, ptprice, ocprice, olprice , tnprice , disprice, dmprice, reprice, dlprice, BALANCE;
        
         @FXML
            private Stage stage;

        @FXML
        PasswordField password;

        @FXML
        Button  TAETRY, jo, 
        watchdogsATC, outlastATC, darksoulsATC, tekken7ATC, pacmanATC, residentevil4ATC, overcookedATC, dishonoredATC, doomATC, dyinglightATC,
        watchdogsATW, outlastATW, darksoulsATW, tekken7ATW, pacmanATW, residentevil4ATW, overcookedATW, dishonoredATW, doomATW, dyinglightATW,
        watchdogsATL, outlastATL, darksoulsATL, tekken7ATL, pacmanATL, residentevil4ATL, overcookedATL, dishonoredATL, doomATL, dyinglightATL, 
        buywdlib,
        wdcancel,
        
        b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
        
        mycartB, mylibraryB, supportB, mywishlistB, profileB, friendsB, settingsB;

        @FXML
        Polygon arrowleft;

        @FXML
        Group sample, nocash, ty,
        
        wdlibG,
        wdCLW,

        
        
        //-----------------------------
         watchdogsgroup, outlastgroup, tekken, dyinglight, darksouls, overcooked, portaltwo, doom, dishonored, res;
        //------------------------------

         
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
            static Parent homeRoot = null;
            
           public void initialize(URL location, ResourceBundle resources) {

            wdprice.setText(Double.toString(userpassController.wd.getProductPrice()));
            dsprice.setText(Double.toString(userpassController.ds.getProductPrice()));
            olprice.setText(Double.toString(userpassController.ol.getProductPrice()));
            ocprice.setText(Double.toString(userpassController.oc.getProductPrice()));
            reprice.setText(Double.toString(userpassController.re.getProductPrice()));
            disprice.setText(Double.toString(userpassController.dis.getProductPrice()));
            dlprice.setText(Double.toString(userpassController.dl.getProductPrice()));
            dmprice.setText(Double.toString(userpassController.dm.getProductPrice()));
            tnprice.setText(Double.toString(userpassController.tn.getProductPrice()));
            ptprice.setText(Double.toString(userpassController.pt.getProductPrice()));

           }
            
          

          // BUTTONS SELECTIONS IN HOME//////////////////////////////
       

          public void switchPage(ActionEvent event) {
            Button sourceButton = (Button) event.getSource();

            if(sourceButton.equals(b1)) {
                watchdogsgroup.setVisible(true);
                outlastgroup.setVisible(false);
                tekken.setVisible(false);
                dyinglight.setVisible(false);
                darksouls.setVisible(false);
                overcooked.setVisible(false);
                portaltwo.setVisible(false);
                doom.setVisible(false);
                dishonored.setVisible(false);
                res.setVisible(false); 
            }
            else if(sourceButton.equals(b2)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(true);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(false);
            }
            else if(sourceButton.equals(b3)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(true);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(false); 
            }
            else if(sourceButton.equals(b4)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(true);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(false); 
            }
            else if(sourceButton.equals(b5)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(true);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(false);   
            }
            else if(sourceButton.equals(b6)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(true);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(false);    
            }
            else if(sourceButton.equals(b7)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(true);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(false);     
            }
            else if(sourceButton.equals(b8)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(true);
              dishonored.setVisible(false);
              res.setVisible(false);    
            }
            else if(sourceButton.equals(b9)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(true);
              res.setVisible(false);   
            }
            else if(sourceButton.equals(b10)) {
              watchdogsgroup.setVisible(false);
              outlastgroup.setVisible(false);
              tekken.setVisible(false);
              dyinglight.setVisible(false);
              darksouls.setVisible(false);
              overcooked.setVisible(false);
              portaltwo.setVisible(false);
              doom.setVisible(false);
              dishonored.setVisible(false);
              res.setVisible(true);    
            }
        }
        

        // BUTTON SELECTIONS EVENT IN HOME ENDS HERE ///////////////////////////////

       



        // JUMP BUTTONS ////////////////////////////////////////////////////////////////

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
         userpassController.wishlistcontroller.showItemsleftW(userpassController.wish.getItemleftW());
         userpassController.wishlistcontroller.showItemsrightW(userpassController.wish.getItemrightW());   

        Scene scene = new Scene(userpassController.homeRootW);
        stage.setScene(scene);
        stage.show();
       }

       public void home(ActionEvent event)throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
        Parent root = FXMLLoader.load(getClass().getResource("/view/Frieds.fxml"));
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
       
       
       public void buy(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();


        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(watchdogsATC)) {
           
            userpassController.cart.addItemleftC(userpassController.mycartcontroller.watchdogspane);
        }

        else if (sourceButton == darksoulsATC) {
           
            userpassController.cart.addItemleftC(userpassController.mycartcontroller.darksoulspane);
        }

        else if (sourceButton == tekken7ATC) {
            
            userpassController.cart.addItemrightC(userpassController.mycartcontroller.tekken7pane);
        }

        else if (sourceButton == dyinglightATC) {
           
            userpassController.cart.addItemleftC(userpassController.mycartcontroller.dyinglightpane);
        }
        
        else if (sourceButton == residentevil4ATC) {
           
            userpassController.cart.addItemrightC(userpassController.mycartcontroller.residentevil4pane);
        }
        
        else if (sourceButton == overcookedATC) {
           
            userpassController.cart.addItemleftC(userpassController.mycartcontroller.overcookedpane);
        }
        
        else if (sourceButton == doomATC) {
           
            userpassController.cart.addItemrightC(userpassController.mycartcontroller.doompane);
        }
        
        else if (sourceButton == dishonoredATC) {
           
            userpassController.cart.addItemrightC(userpassController.mycartcontroller.dishonoredpane);
        }
        
        else if (sourceButton == outlastATC) {
           
            userpassController.cart.addItemleftC(userpassController.mycartcontroller.outlastpane);
        }
        
        else if (sourceButton == pacmanATC) {
           
            userpassController.cart.addItemrightC(userpassController.mycartcontroller.portal2pane);
        }
        
        
    }

       public void addwishlist(ActionEvent event) throws IOException {

         // AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

       

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(watchdogsATW)) {
           
             userpassController.wish.addItemleftW(userpassController.wishlistcontroller.watchdogspaneW);
            
         }

         else if (sourceButton == darksoulsATW) {
           
             userpassController.wish.addItemleftW(userpassController.wishlistcontroller.darksoulspaneW);
         }

         else if (sourceButton == tekken7ATW) {
            
             userpassController.wish.addItemrightW(userpassController.wishlistcontroller.tekken7paneW);
         }

         else if (sourceButton == dyinglightATW) {
           
             userpassController.wish.addItemleftW(userpassController.wishlistcontroller.dyinglightpaneW);
         }
        
         else if (sourceButton == residentevil4ATW) {
           
             userpassController.wish.addItemrightW(userpassController.wishlistcontroller.residentevil4paneW);
         }
        
        else if (sourceButton == overcookedATW) {
           
            userpassController.wish.addItemleftW(userpassController.wishlistcontroller.overcookedpaneW);
       }
        
       else if (sourceButton == doomATW) {
           
           userpassController.wish.addItemrightW(userpassController.wishlistcontroller.doompaneW);
        }
        
        else if (sourceButton == dishonoredATW) {
           
             userpassController.wish.addItemrightW(userpassController.wishlistcontroller.dishonoredpaneW);
        }
        
         else if (sourceButton == outlastATW) {
           
             userpassController.wish.addItemleftW(userpassController.wishlistcontroller.outlastpaneW);
        }
        
         else if (sourceButton == pacmanATW) {
           
             userpassController.wish.addItemrightW(userpassController.wishlistcontroller.portal2paneW);
         }
        
        }
        public void addlibrary(ActionEvent event) throws IOException {


         Button sourceButton = (Button) event.getSource();

       
            if (sourceButton.equals(watchdogsATL) && (userpassController.balance >= pricewd)  ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.watchdogspaneL);
             
             balancecal(pricewd);
             ty.setVisible(true);

             }

             else if (sourceButton.equals(darksoulsATL) && (userpassController.balance >= priceds)  ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.darksoulspaneL);
             
             balancecal(priceds); 
              ty.setVisible(true); 
                }

              else if (sourceButton.equals(dyinglightATL) && (userpassController.balance >= pricedl) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.dyinglightpaneL);
             
              ty.setVisible(true);
             balancecal(pricedl);   
             }

                else if (sourceButton.equals(outlastATL) && (userpassController.balance >= priceol) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.outlastpaneL);
             
              ty.setVisible(true);
              balancecal(priceol);  
                }
        
             else if (sourceButton.equals(overcookedATL) && (userpassController.balance >= priceoc) ) {
           
             userpassController.lib.addItemleftL(userpassController.librarycontroller.overcookedpaneL);
            
              ty.setVisible(true);
              balancecal(priceoc);  
                }
        
                else if (sourceButton.equals(residentevil4ATL) && (userpassController.balance >= pricere) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.residentevil4paneL);
            
              ty.setVisible(true);
              balancecal(pricere);  
                }
        
            else if (sourceButton.equals(pacmanATL) && (userpassController.balance >= pricept) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.portal2paneL);
             
              ty.setVisible(true);
             balancecal(pricept);   
                }
        
                else if (sourceButton.equals(doomATL) && (userpassController.balance >= pricedm) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.doompaneL);
            
              ty.setVisible(true);
             balancecal(pricedm);   
             }
        
             else if (sourceButton.equals(dishonoredATL) && (userpassController.balance >= pricedis) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.dishonoredpaneL);
             
              ty.setVisible(true);
             balancecal(pricedis);   
                 }
                 
                else if (sourceButton.equals(tekken7ATL) && (userpassController.balance >= pricetn) ) {
           
             userpassController.lib.addItemrightL(userpassController.librarycontroller.tekken7paneL);
            
              ty.setVisible(true);
              balancecal(pricetn);  
                }
         
             else {
             nocash.setVisible(true);
             }
                 }
        
        
       
       
     
     public void appearlib(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

         // If addtocart button is pressed, set product status to true
         if (sourceButton.equals(watchdogsATL)) {
           
             wdlibG.setVisible(true);
        }
    
     }
        public void libcancel(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(wdcancel)) {
           
            wdlibG.setVisible(false);
        }
    }
        
        public void balancecal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  - prays;     
                BALANCE.setText(Double.toString(userpassController.balance));

            }

            public void okty (ActionEvent event)throws IOException{
                ty.setVisible(false);
              
            }
            
            public void nocashok (ActionEvent event)throws IOException{
                nocash.setVisible(false);
              
            }
    
        }
    
    
    

        
       //////////////////////////////////////////////////////////////////////////////

      



       /////////////////////////////////////////// INITIALIZED /////////////////////////////////////

      
    

    

     
  