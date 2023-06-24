package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import javafx.stage.Stage; 

public class friendsController implements Initializable {
    @FXML
    Group yanyanF,ebisuF,togeF,prunseF, vyanyan, vebisu, vtoge, vprunse,

    yanyanS,ebisuS,togeS,prunseS;
    
    @FXML
            private Stage stage;
        @FXML
    Rectangle friendsBG;
   
    @FXML
    Button xY,xE,xT,xP,   yanyanv, togev, ebisuv, prunsev,
    
    aY,aE,aT,aP;

    @FXML
    Text Mname;
    
    static Color backgroundColor;


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

        Parent root = FXMLLoader.load(getClass().getResource("/view/myCart.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       }

       public void goLibrary(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/MyLibraryy.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       }

       public void goWishlist(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/myWishlist.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

       ///////////////////////// friendsButtons ////////////////////////////////////

       public void UnfY(ActionEvent event)throws IOException{
        yanyanF.setVisible(false);
        yanyanS.setVisible(true);
         }
        public void UnfE(ActionEvent event)throws IOException{
        ebisuF.setVisible(false);
        ebisuS.setVisible(true);
        }
        public void UnfT(ActionEvent event)throws IOException{
        togeF.setVisible(false);
        togeS.setVisible(true);
        }
        public void UnfP(ActionEvent event)throws IOException{
        prunseF.setVisible(false);
        prunseS.setVisible(true);
        }
        
        public void addY(ActionEvent event)throws IOException{
        yanyanF.setVisible(true);
        yanyanS.setVisible(false);
        }
         public void addE(ActionEvent event)throws IOException{
        ebisuF.setVisible(true);
        ebisuS.setVisible(false);
        }
         public void addT(ActionEvent event)throws IOException{
        togeF.setVisible(true);
        togeS.setVisible(false);
        }
         public void addP(ActionEvent event)throws IOException{
        prunseF.setVisible(true);
        prunseS.setVisible(false);
        }
        
        public void initializeUsername() {
                Mname.setText(userpassController.username);
        }
        

        public void viewfriend(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(yanyanv)) {
           
           vyanyan.setVisible(true);
        }

        else if (sourceButton == ebisuv) {
           vebisu.setVisible(true);
            
        }
        
         else if (sourceButton == togev) {
           vtoge.setVisible(true);
            
        }
        
         else if (sourceButton == prunsev) {
           vprunse.setVisible(true);
            
        }
                }
        public void friendclose(ActionEvent event) throws IOException {
                vyanyan.setVisible(false);
                vebisu.setVisible(false);
                vtoge.setVisible(false);
                vprunse.setVisible(false);
                }
        
        public void initializeBG() {
        if (backgroundColor != null) {
            friendsBG.setFill(backgroundColor);
        }
    }
                
        @Override
        public void initialize(URL location, ResourceBundle resources) {
                initializeUsername();
                initializeBG();
        }  

}
