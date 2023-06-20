package BuyModel;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class Library {

    // This array list will hold all items in the cart
    private ArrayList<Pane> itemsleftL = new ArrayList<Pane>();
    private ArrayList<Pane> itemsrightL = new ArrayList<Pane>();


    public void addItemleftL(Pane pane) {
        itemsleftL.add(pane);
    }
    public void addItemrightL(Pane pane) {
        itemsrightL.add(pane);
    }
    // public void showItemsLib() {
    //     System.out.println(items);
    // };
    public ArrayList<Pane> getItemleftL() {
        return itemsleftL;
    }
    public ArrayList<Pane> getItemrightL() {
        return itemsrightL;
    }
}