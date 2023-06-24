package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import javafx.stage.Stage;
public class supportController implements Initializable {
@FXML
    private Stage stage;

    static Color backgroundColor;

    @FXML
    Text Mname;

    @FXML
    Rectangle supportBG;
    
    @FXML
        Button librarySB, accountSB, gameSB, marketSB, paymentSB, productSB, otherSB,
        librarysentX, accountsentX, gamesentX, marketsentX, paymentsentX, productsentX, othersentX;
        
        @FXML
        Group librarysent, accountsent, gamesent, marketsent, paymentsent, productsent, othersent;

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

        Parent root = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
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
       
       public void sentsupport(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(librarySB)) {
           
           librarysent.setVisible(true);
        }

        else if (sourceButton == accountSB) {
           accountsent.setVisible(true);
            
        }
        
         else if (sourceButton == gameSB) {
           gamesent.setVisible(true);
            
        }
        
         else if (sourceButton == marketSB) {
           marketsent.setVisible(true);
            
        }
        
         else if (sourceButton == paymentSB) {
           paymentsent.setVisible(true);
            
        }
        
         else if (sourceButton == productSB) {
           productsent.setVisible(true);
            
        }
        
        else if (sourceButton == otherSB) {
           othersent.setVisible(true);
            
        }
       //////////////////////////////////////////////////
       }
       
       public void sentX(ActionEvent event) throws IOException {
            librarysent.setVisible(false);
            marketsent.setVisible(false);
            gamesent.setVisible(false);
            productsent.setVisible(false);
            paymentsent.setVisible(false);
            accountsent.setVisible(false);
            othersent.setVisible(false);

       }

       public void initializeBG() {
        if (backgroundColor != null) {
            supportBG.setFill(backgroundColor);
        }
    }

       public void initializeUsername() {
                Mname.setText(userpassController.username);
      }

      @Override
      public void initialize(URL location, ResourceBundle resources) {
         initializeUsername();
         initializeBG();
      }  
}
