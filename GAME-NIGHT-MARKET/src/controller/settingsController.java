package controller;

import java.io.IOException;

import javax.swing.Action;

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
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class settingsController {
@FXML
    private Stage stage;
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

       /////////////////////////////////////////////////////////////
    
}
