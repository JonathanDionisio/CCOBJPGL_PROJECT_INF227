package BuyModel;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class WishList {

    // This array list will hold all items in the cart
    private ArrayList<Pane> itemsleftW = new ArrayList<Pane>();
    private ArrayList<Pane> itemsrightW = new ArrayList<Pane>();
    public void addItemleftW(Pane pane) {
        itemsleftW.add(pane);
    };
    public void addItemrightW(Pane pane) {
        itemsrightW.add(pane);
    };
    // public void showItemsWishlist() {
    //     System.out.println(items);
    // };
    
     public ArrayList<Pane> getItemleftW() {
        return itemsleftW;
    }
     public ArrayList<Pane> getItemrightW() {
        return itemsrightW;
    }
}