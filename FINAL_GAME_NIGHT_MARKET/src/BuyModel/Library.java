package BuyModel;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class Library {

    private ArrayList<Pane> itemsLL = new ArrayList<Pane>();
    private ArrayList<Pane> itemsLR = new ArrayList<Pane>();

    public void addLL(Pane pane) {
        itemsLL.add(pane);
    }
    public void addLR(Pane pane) {
        itemsLR.add(pane);
    }
    // public void showItemsC() {
    //     System.out.println(items);
    // };
    
    public ArrayList<Pane> getLL() {
        return itemsLL;
    }
    public ArrayList<Pane> getLR() {
        return itemsLR;
    }
}