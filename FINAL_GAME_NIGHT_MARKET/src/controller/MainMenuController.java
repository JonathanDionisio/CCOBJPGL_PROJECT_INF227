package controller;


import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

import javax.swing.Action;
import javax.xml.transform.Source;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        Rectangle mainmenuBG;
        @FXML
        Pane receiptM; 

        @FXML
        ImageView tite,  wdGIF, wdp1, wdp;
        
    
        @FXML
        TextField username;

        @FXML
        Text  wdin, olin, dlin, dsin, tnin, ocin, ddin, dmin, rein, ptin,
              wwdp, olp, dlp, dsp, tnp, ocp, ddp, dmp, rep, ptp, 
              wda, ola, dla, dsa, tna, oca, dda, dma, rea, pta,
              Totalreceipt,
              taeText, Mbalance, itemNameTxt, priceTxt, amountTxt, totalTxt,
              Mname;
        
         @FXML
            private Stage stage;

        @FXML
        PasswordField password;

        @FXML
        Button  TAETRY, jo, 
        watchdogsATC, outlastATC, darksoulsATC, tekken7ATC, portal2ATC, residentevil4ATC, overcookedATC, dishonoredATC, doomATC, dyinglightATC,
        watchdogsATW, outlastATW, darksoulsATW, tekken7ATW, portal2ATW, residentevil4ATW, overcookedATW, dishonoredATW, doomATW, dyinglightATW,
        watchdogsATL, outlastATL, darksoulsATL, tekken7ATL, portal2ATL, residentevil4ATL, overcookedATL, dishonoredATL, doomATL, dyinglightATL, 
        buywdlib,
        wdcancel,
        
        b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
        
        mycartB, mylibraryB, supportB, mywishlistB, profileB, friendsB, settingsB;

        @FXML
        Polygon arrowleft;

        @FXML
        Group sample, nomoney, 
        
        wdlibG,
        wdCLW,
        ty4p,

        
        
        //-----------------------------
         watchdogsgroup, outlastgroup, tekken, dyinglight, darksouls, overcooked, portaltwo, doom, dishonored, res;
        //------------------------------

        @FXML
        double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount, item10Amount ;

           

         @FXML
            static Parent MhomeRoot = null;
            
           
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
          

          // Objects:
          WatchDogs watchDogs = new WatchDogs();

          // BUTTONS SELECTIONS IN HOME//////////////////////////////
       
            static Color backgroundColor;

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
       
       
       public void buy(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

       

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(watchdogsATC)) {
           
            userpassController.cart.addCL(userpassController.mycartcontroller.watchdogspane);
        }

        else if (sourceButton == darksoulsATC) {
           
            userpassController.cart.addCL(userpassController.mycartcontroller.darksoulspane);
        }

        else if (sourceButton == tekken7ATC) {
            
            userpassController.cart.addCR(userpassController.mycartcontroller.tekken7pane);
        }

        else if (sourceButton == dyinglightATC) {
           
            userpassController.cart.addCL(userpassController.mycartcontroller.dyinglightpane);
        }
        
        else if (sourceButton == residentevil4ATC) {
           
            userpassController.cart.addCR(userpassController.mycartcontroller.residentevil4pane);
        }
        
        else if (sourceButton == overcookedATC) {
           
            userpassController.cart.addCL(userpassController.mycartcontroller.overcookedpane);
        }
        
        else if (sourceButton == doomATC) {
           
            userpassController.cart.addCR(userpassController.mycartcontroller.doompane);
        }
        
        else if (sourceButton == dishonoredATC) {
           
            userpassController.cart.addCR(userpassController.mycartcontroller.dishonoredpane);
        }
        
        else if (sourceButton == outlastATC) {
           
            userpassController.cart.addCL(userpassController.mycartcontroller.outlastpane);
        }
        
        else if (sourceButton == portal2ATC) {
           
            userpassController.cart.addCR(userpassController.mycartcontroller.portal2pane);
        }
     
        
    }

       public void addwishlist(ActionEvent event) throws IOException {

         // AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

       

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(watchdogsATW)) {
           
             userpassController.wish.addWL(userpassController.wishlistcontroller.watchdogspaneW);
            
         }

         else if (sourceButton == darksoulsATW) {
           
             userpassController.wish.addWL(userpassController.wishlistcontroller.darksoulspaneW);
         }

         else if (sourceButton == tekken7ATW) {
            
             userpassController.wish.addWR(userpassController.wishlistcontroller.tekken7paneW);
         }

         else if (sourceButton == dyinglightATW) {
           
             userpassController.wish.addWL(userpassController.wishlistcontroller.dyinglightpaneW);
         }
        
         else if (sourceButton == residentevil4ATW) {
           
             userpassController.wish.addWR(userpassController.wishlistcontroller.residentevil4paneW);
         }
        
        else if (sourceButton == overcookedATW) {
           
            userpassController.wish.addWL(userpassController.wishlistcontroller.overcookedpaneW);
       }
        
       else if (sourceButton == doomATW) {
           
           userpassController.wish.addWR(userpassController.wishlistcontroller.doompaneW);
        }
        
        else if (sourceButton == dishonoredATW) {
           
             userpassController.wish.addWR(userpassController.wishlistcontroller.dishonoredpaneW);
        }
        
         else if (sourceButton == outlastATW) {
           
             userpassController.wish.addWL(userpassController.wishlistcontroller.outlastpaneW);
        }
        
         else if (sourceButton == portal2ATW) {
           
             userpassController.wish.addWR(userpassController.wishlistcontroller.portal2paneW);
         }
        
        }
         public void addlibrary(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

         Button sourceButton = (Button) event.getSource();

       

         // If addtocart button is pressed, set product status to true
         if (sourceButton.equals(watchdogsATL) && (userpassController.balance >= pricewd)) {
            userpassController.lib.addLL(userpassController.librarycontroller.watchdogspaneL);
            balancecal(pricewd);
            userpassController.wd.setProductStatus(true);
            ty4p.setVisible(true);
            
         }

         else if (sourceButton == darksoulsATL && (userpassController.balance >= priceds)) {
           
             userpassController.lib.addLL(userpassController.librarycontroller.darksoulspaneL);
             balancecal(priceds);
             userpassController.ds.setProductStatus(true);
             ty4p.setVisible(true);
             
        }

         else if (sourceButton == tekken7ATL && (userpassController.balance >= pricetn)) {
            
            userpassController.lib.addLR(userpassController.librarycontroller.tekken7paneL);
            balancecal(pricetn);
            userpassController.tn.setProductStatus(true);
            ty4p.setVisible(true);
            
         }

         else if (sourceButton == dyinglightATL && (userpassController.balance >= pricedl)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.dyinglightpaneL);
            balancecal(pricedl);
            userpassController.dl.setProductStatus(true);
            ty4p.setVisible(true);
        }
        
        else if (sourceButton == residentevil4ATL && (userpassController.balance >= pricere)) {
           
            userpassController.lib.addLR(userpassController.librarycontroller.residentevil4paneL);
            balancecal(pricere);
            userpassController.re.setProductStatus(true);
            ty4p.setVisible(true);
        }
        
        else if (sourceButton == overcookedATL && (userpassController.balance >= priceoc)) {
           userpassController.lib.addLL(userpassController.librarycontroller.overcookedpaneL);
           balancecal(priceoc);
           userpassController.oc.setProductStatus(true);
           ty4p.setVisible(true);
        }
        
         else if (sourceButton == doomATL && (userpassController.balance >= pricedm)) {
           
             userpassController.lib.addLR(userpassController.librarycontroller.doompaneL);
             balancecal(pricedm);
             userpassController.dm.setProductStatus(true);
             ty4p.setVisible(true);
         }
        
         else if (sourceButton == dishonoredATL && (userpassController.balance >= pricedd)) {
           
             userpassController.lib.addLR(userpassController.librarycontroller.dishonoredpaneL);
             balancecal(pricedd);
             userpassController.dd.setProductStatus(true);
             ty4p.setVisible(true);
        }
        
         else if (sourceButton == outlastATL && (userpassController.balance >= priceol)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.outlastpaneL);
            balancecal(priceol);
            userpassController.ol.setProductStatus(true);
            ty4p.setVisible(true);
            
       }
        
       else if (sourceButton == portal2ATL && (userpassController.balance >= pricept))  {
           
            userpassController.lib.addLR(userpassController.librarycontroller.portal2paneL);
            balancecal(pricept);
            userpassController.pt.setProductStatus(true);
            ty4p.setVisible(true);
        }
        else {
        nomoney.setVisible(true);
      }
        
     }
     public void closety(ActionEvent event) throws IOException {

             ty4p.setVisible(false);
       
    
     }
     public void closenomoney(ActionEvent event) throws IOException {

             nomoney.setVisible(false);
            
    
     }
    //     public void showreceipt(ActionEvent event) throws IOException {

             
    //          givereceiptM();
    
    //  }
       public void balancecal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  - prays;     
                Mbalance.setText(Double.toString(userpassController.balance));

            }
    
       ////////////////////////////////RECEIPT//////////////////////////////////////////////

              public void setreceiptM() throws IOException {
                
                    

                    if (userpassController.wd.getProductStatus()) {
                        userpassController.wd.setProductName(userpassController.wd.getProductName());
                        userpassController.wd.setProductPrice(userpassController.wd.getProductPrice());
                        userpassController.wd.setProductQuantity(userpassController.wd.getProductQuantity());

                        wdin.setText(userpassController.wd.getProductName());
                        wwdp.setText(Double.toString(userpassController.wd.getProductPrice()));
                        wda.setText(Double.toString(userpassController.wd.getProductQuantity()));
                        

                        item1Amount = userpassController.wd.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);

                    }

                    if (userpassController.ol.getProductStatus()) {
                        userpassController.ol.setProductName(userpassController.ol.getProductName());
                        userpassController.ol.setProductPrice(userpassController.ol.getProductPrice());
                        userpassController.ol.setProductQuantity(userpassController.ol.getProductQuantity());

                        olin.setText(userpassController.ol.getProductName());
                        olp.setText(Double.toString(userpassController.ol.getProductPrice()));
                        ola.setText(Double.toString(userpassController.ol.getProductQuantity()));
                        

                        item2Amount = userpassController.ol.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);

                    }

                    if (userpassController.ds.getProductStatus()) {
                        userpassController.ds.setProductName(userpassController.ds.getProductName());
                        userpassController.ds.setProductPrice(userpassController.ds.getProductPrice());
                        userpassController.ds.setProductQuantity(userpassController.ds.getProductQuantity());

                        dsin.setText(userpassController.ds.getProductName());
                        dsp.setText(Double.toString(userpassController.ds.getProductPrice()));
                        dsa.setText(Double.toString(userpassController.ds.getProductQuantity()));
                        

                        item3Amount = userpassController.ds.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);

                    }

                    if (userpassController.dl.getProductStatus()) {
                        userpassController.dl.setProductName(userpassController.dl.getProductName());
                        userpassController.dl.setProductPrice(userpassController.dl.getProductPrice());
                        userpassController.dl.setProductQuantity(userpassController.dl.getProductQuantity());

                        dlin.setText(userpassController.dl.getProductName());
                        dlp.setText(Double.toString(userpassController.dl.getProductPrice()));
                        dla.setText(Double.toString(userpassController.dl.getProductQuantity()));
                       

                        item4Amount = userpassController.dl.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    if (userpassController.tn.getProductStatus()) {
                        userpassController.tn.setProductName(userpassController.tn.getProductName());
                        userpassController.tn.setProductPrice(userpassController.tn.getProductPrice());
                        userpassController.tn.setProductQuantity(userpassController.tn.getProductQuantity());

                        tnin.setText(userpassController.tn.getProductName());
                        tnp.setText(Double.toString(userpassController.tn.getProductPrice()));
                        tna.setText(Double.toString(userpassController.tn.getProductQuantity()));
                       

                        item5Amount = userpassController.tn.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    if (userpassController.dd.getProductStatus()) {
                        userpassController.dd.setProductName(userpassController.dd.getProductName());
                        userpassController.dd.setProductPrice(userpassController.dd.getProductPrice());
                        userpassController.dd.setProductQuantity(userpassController.dd.getProductQuantity());

                        ddin.setText(userpassController.dd.getProductName());
                        ddp.setText(Double.toString(userpassController.dd.getProductPrice()));
                        dda.setText(Double.toString(userpassController.dd.getProductQuantity()));
                       

                        item6Amount = userpassController.dd.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    if (userpassController.re.getProductStatus()) {
                        userpassController.re.setProductName(userpassController.re.getProductName());
                        userpassController.re.setProductPrice(userpassController.re.getProductPrice());
                        userpassController.re.setProductQuantity(userpassController.re.getProductQuantity());

                        rein.setText(userpassController.re.getProductName());
                        rep.setText(Double.toString(userpassController.re.getProductPrice()));
                        rea.setText(Double.toString(userpassController.re.getProductQuantity()));
                       

                        item7Amount = userpassController.re.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    if (userpassController.pt.getProductStatus()) {
                        userpassController.pt.setProductName(userpassController.pt.getProductName());
                        userpassController.pt.setProductPrice(userpassController.pt.getProductPrice());
                        userpassController.pt.setProductQuantity(userpassController.pt.getProductQuantity());

                        ptin.setText(userpassController.pt.getProductName());
                        ptp.setText(Double.toString(userpassController.pt.getProductPrice()));
                        pta.setText(Double.toString(userpassController.pt.getProductQuantity()));
                       

                        item8Amount = userpassController.pt.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    if (userpassController.oc.getProductStatus()) {
                        userpassController.oc.setProductName(userpassController.oc.getProductName());
                        userpassController.oc.setProductPrice(userpassController.oc.getProductPrice());
                        userpassController.oc.setProductQuantity(userpassController.oc.getProductQuantity());

                        ocin.setText(userpassController.oc.getProductName());
                        ocp.setText(Double.toString(userpassController.oc.getProductPrice()));
                        oca.setText(Double.toString(userpassController.oc.getProductQuantity()));
                       

                        item9Amount = userpassController.oc.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    if (userpassController.dm.getProductStatus()) {
                        userpassController.dm.setProductName(userpassController.dm.getProductName());
                        userpassController.dm.setProductPrice(userpassController.dm.getProductPrice());
                        userpassController.dm.setProductQuantity(userpassController.dm.getProductQuantity());

                        dmin.setText(userpassController.dm.getProductName());
                        dmp.setText(Double.toString(userpassController.dm.getProductPrice()));
                        dma.setText(Double.toString(userpassController.dm.getProductQuantity()));
                       

                        item10Amount = userpassController.dm.getProductPrice();
                        receiptM.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount;
                    Totalreceipt.setText(Double.toString(final_amount));

                  
    
               }



      public void closeReceipt() {
        receiptM.setVisible(false);
      } 

      public void initializeUsername() {
            Mname.setText(userpassController.username);
    }


    public void initializeBG() {
        if (backgroundColor != null) {
            mainmenuBG.setFill(backgroundColor);
        }
    }

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeUsername();
        initializeBG();
        
    }  
  }