package controller;

import java.io.IOException;

import javax.swing.Action;
import javax.swing.text.html.parser.DTD;

import Games.WatchDogs;
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
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.shape.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class CartController implements Initializable{
    
    @FXML
            private Stage stage;
      @FXML
        double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount, item10Amount ;
    
    @FXML
    Text       Cbalance, totalpaycart,
               wdin, olin, dlin, dsin, tnin, ocin, ddin, dmin, rein, ptin,
              wwdp, olp, dlp, dsp, tnp, ocp, ddp, dmp, rep, ptp, 
              wda, ola, dla, dsa, tna, oca, dda, dma, rea, pta,
              Totalreceipt, Mname;
    @FXML
    Group ty4p, giftG, nomoney  ;
    @FXML
    VBox vboxleft, vboxright;
    @FXML
    Rectangle cartBG;
    @FXML
    Button  tygolibrary, RCB, getreceiptC, G1, G2, G3, G4,
    
            dsCB, dlCB, olCB, wdCB, dmCB, ocCB, ddCB, reCB, tnCB, ptCB,
            dsXB, dlXB, olXB, wdXB, dmXB, ocXB, ddXB, reXB, tnXB, ptXB,
            dsGB, dlGB, olGB, wdGB, dmGB, ocGB, ddGB, reGB, tnGB, ptCG;

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
       Pane  watchdogspane, outlastpane, tekken7pane, portal2pane,doompane,residentevil4pane,dishonoredpane,dyinglightpane,overcookedpane,darksoulspane, receiptC;
        

        static Color backgroundColor;
        
       @Override
       public void initialize(URL location, ResourceBundle resources) {
           // TODO Auto-generated method stub
           clearVbox();

           showCL(userpassController.cart.getCL());

           showCR(userpassController.cart.getCR());

           initializeUsername();
           initializeBG();
       }

       public void clearVbox() {

           if (vboxleft != null) {
               System.out.println("vbox is not null");
               vboxleft.getChildren().removeAll(vboxleft.getChildren());
           }

           if (vboxright != null) {
               System.out.println("vbox is not null");
               vboxright.getChildren().removeAll(vboxright.getChildren());
           }
       }

         public void bought(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

         Button sourceButton = (Button) event.getSource();

       

         // If addtocart button is pressed, set product status to true
         if (sourceButton.equals(wdCB) && (userpassController.balance >= pricewd)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.watchdogspaneL);
            balancecal(pricewd);
            ty4p.setVisible(true);
            watchdogspane.setVisible(false);
            userpassController.wd.setProductStatus(true);
         }

         else if (sourceButton == dsCB && (userpassController.balance >= priceds)) {
           
             userpassController.lib.addLL(userpassController.librarycontroller.darksoulspaneL);
             balancecal(priceds);
             ty4p.setVisible(true);
             darksoulspane.setVisible(false);
             userpassController.ds.setProductStatus(true);
        }

         else if (sourceButton == tnCB && (userpassController.balance >= pricetn)) {
            
            userpassController.lib.addLR(userpassController.librarycontroller.tekken7paneL);
            balancecal(pricetn);
            ty4p.setVisible(true);
            tekken7pane.setVisible(false);
            userpassController.tn.setProductStatus(true);
         }

         else if (sourceButton == dlCB && (userpassController.balance >= pricedl)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.dyinglightpaneL);
            balancecal(pricedl);
            ty4p.setVisible(true);
            dyinglightpane.setVisible(false);
            userpassController.dl.setProductStatus(true);
        }
        
        else if (sourceButton == reCB && (userpassController.balance >= pricere)) {
           
            userpassController.lib.addLR(userpassController.librarycontroller.residentevil4paneL);
            balancecal(pricere);
            ty4p.setVisible(true);
            residentevil4pane.setVisible(false);
            userpassController.re.setProductStatus(true);
        }
        
        else if (sourceButton == ocCB && (userpassController.balance >= priceoc)) {
           userpassController.lib.addLL(userpassController.librarycontroller.overcookedpaneL);
           balancecal(priceoc);
           ty4p.setVisible(true);
           overcookedpane.setVisible(false);
           userpassController.oc.setProductStatus(true);
        }
        
         else if (sourceButton == dmCB && (userpassController.balance >= pricedm)) {
           
             userpassController.lib.addLR(userpassController.librarycontroller.doompaneL);
             balancecal(pricedm);
             ty4p.setVisible(true);
             doompane.setVisible(false);
             userpassController.dm.setProductStatus(true);
         }
        
         else if (sourceButton == ddCB && (userpassController.balance >= pricedd)) {
           
             userpassController.lib.addLR(userpassController.librarycontroller.dishonoredpaneL);
             balancecal(pricedd);
             ty4p.setVisible(true);
             dishonoredpane.setVisible(false);
             userpassController.dd.setProductStatus(true);
        }
        
         else if (sourceButton == olCB && (userpassController.balance >= priceol)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.outlastpaneL);
            balancecal(priceol);
            ty4p.setVisible(true);
            outlastpane.setVisible(false);
            userpassController.ol.setProductStatus(true);
       }
        
       else if (sourceButton == ptCB && (userpassController.balance >= pricept)) {
           
            userpassController.lib.addLR(userpassController.librarycontroller.portal2paneL);
            balancecal(pricept);
            userpassController.pt.setProductStatus(true);
            ty4p.setVisible(true);
            portal2pane.setVisible(false);
        }
        else {
            nomoney.setVisible(true);
        }
        
     }
     public void closeReceipt() {
        receiptC.setVisible(false);
      } 
     public void closety(ActionEvent event) throws IOException {

             ty4p.setVisible(false);
       
    
     }
    public void closeGF(ActionEvent event) throws IOException {

             giftG.setVisible(false);
       
    
     }
      public void closenomoney(ActionEvent event) throws IOException {

              nomoney.setVisible(false);
              

    
      }
      public void giftfriendd(ActionEvent event) throws IOException {

              giftG.setVisible(true);
              

    
      }
       public void balancecal( double prays) throws IOException {
                
               userpassController.balance = userpassController.balance  - prays;     
                Cbalance.setText(Double.toString(userpassController.balance));

            }
           public void removefromcart(ActionEvent event) throws IOException {


                Button sourceButton = (Button) event.getSource();

       
             if (sourceButton.equals(wdXB)) {
             watchdogspane.setVisible(false);
              
             } 
             else if (sourceButton.equals(dsXB)){
                darksoulspane.setVisible(false);
                 
            }   
             else if (sourceButton.equals(dlXB)){
               dyinglightpane.setVisible(false);
                
            }   
             else if (sourceButton.equals(olXB)){
                outlastpane.setVisible(false);
                
            }   
             else if (sourceButton.equals(ddXB)){
                dishonoredpane.setVisible(false);
                 
            }   
             else if (sourceButton.equals(reXB)){
                residentevil4pane.setVisible(false);
                 
            }   
             else if (sourceButton.equals(tnXB)){
               tekken7pane.setVisible(false);
                
            }   
             else if (sourceButton.equals(ptXB)){
               portal2pane.setVisible(false);
               
            }   
             else if (sourceButton.equals(ocXB)){
                overcookedpane.setVisible(false);
                
            }   
             else if (sourceButton.equals(dmXB)){
               doompane.setVisible(false);
              
            }   
            } 
            
            public void giftafriend(ActionEvent event) throws IOException {

        // AlertMaker.showSimpleAlert("hello", "item added");

         Button sourceButton = (Button) event.getSource();

       

         // If addtocart button is pressed, set product status to true
         if (sourceButton.equals(G1) && (userpassController.balance >= pricewd)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.watchdogspaneL);
            balancecal(pricewd);
            ty4p.setVisible(true);
            giftG.setVisible(false);
            watchdogspane.setVisible(false);
         }

         else if (sourceButton == G2 && (userpassController.balance >= priceds))  {
           
             userpassController.lib.addLL(userpassController.librarycontroller.darksoulspaneL);
             balancecal(priceds);
             ty4p.setVisible(true);
             giftG.setVisible(false);
             darksoulspane.setVisible(false);
        }

         else if (sourceButton == G3 && (userpassController.balance >= pricetn)) {
            
            userpassController.lib.addLR(userpassController.librarycontroller.tekken7paneL);
            balancecal(pricetn);
            ty4p.setVisible(true);
            giftG.setVisible(false);
            tekken7pane.setVisible(false);
         }

         else if (sourceButton == G4 && (userpassController.balance >= pricedl)) {
           
            userpassController.lib.addLL(userpassController.librarycontroller.dyinglightpaneL);
            balancecal(pricedl);
            ty4p.setVisible(true);
            giftG.setVisible(false);
            dyinglightpane.setVisible(false);
        }
        else {
             nomoney.setVisible(true);
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
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        userpassController.mycartcontroller.showCL(userpassController.cart.getCL());
          userpassController.mycartcontroller.showCR(userpassController.cart.getCR());
        

        Scene scene = new Scene(userpassController.homeRootC);
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
         public void setreceiptC() throws IOException {
                
                    

                    if (userpassController.wd.getProductStatus()) {
                        userpassController.wd.setProductName(userpassController.wd.getProductName());
                        userpassController.wd.setProductPrice(userpassController.wd.getProductPrice());
                        userpassController.wd.setProductQuantity(userpassController.wd.getProductQuantity());

                        wdin.setText(userpassController.wd.getProductName());
                        wwdp.setText(Double.toString(userpassController.wd.getProductPrice()));
                        wda.setText(Double.toString(userpassController.wd.getProductQuantity()));
                        

                        item1Amount = userpassController.wd.getProductPrice();
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
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
                        receiptC.setVisible(true);
                        ty4p.setVisible(false);


                    }
                    double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount;
                    Totalreceipt.setText(Double.toString(final_amount));

                  
    
               }

       

               public void showCL(ArrayList<Pane> itemleftC) {
               for (Pane p : itemleftC) {
                     vboxleft.getChildren().add(p);
               }
            }
               public void showCR(ArrayList<Pane> itemrightC) {
               for (Pane b : itemrightC) {
                     
                     vboxright.getChildren().add(b);
               }
            }
               
            public void initializeUsername() {
                Mname.setText(userpassController.username);
            }   
            
            public void initializeBG() {
                if (backgroundColor != null) {
                cartBG.setFill(backgroundColor);
        }
    }
         }

         
       /////////////////////////////////////////////////////
    //     public static void toggleVisibility (String item) throws IOException {
    //     if (item.equals("watchdog")) {

    //       watchdogsGroup.setVisible(true);

    //    }
    //   }

