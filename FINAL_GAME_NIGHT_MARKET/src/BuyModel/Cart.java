package BuyModel;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class Cart {

    // This array list will hold all items in the cart
    private ArrayList<Pane> itemsCL = new ArrayList<Pane>();
    private ArrayList<Pane> itemsCR = new ArrayList<Pane>();

    public void addCL(Pane pane) {
        itemsCL.add(pane);
    }
    public void addCR(Pane pane) {
        itemsCR.add(pane);
    }
    // public void showItemsC() {
    //     System.out.println(items);
    // };
    
    public ArrayList<Pane> getCL() {
        return itemsCL;
    }
    public ArrayList<Pane> getCR() {
        return itemsCR;
    }
    
    
}