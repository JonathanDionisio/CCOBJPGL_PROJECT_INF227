package BuyModel;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class WishList {

    private ArrayList<Pane> itemsWL = new ArrayList<Pane>();
    private ArrayList<Pane> itemsWR = new ArrayList<Pane>();

    public void addWL(Pane pane) {
        itemsWL.add(pane);
    }
    public void addWR(Pane pane) {
        itemsWR.add(pane);
    }
    // public void showItemsC() {
    //     System.out.println(items);
    // };
    
    public ArrayList<Pane> getWL() {
        return itemsWL;
    }
    public ArrayList<Pane> getWR() {
        return itemsWR;
    }
}