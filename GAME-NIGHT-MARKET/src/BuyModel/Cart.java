package BuyModel;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class Cart {

    // This array list will hold all items in the cart
    private ArrayList<Pane> itemsleftC   = new ArrayList<Pane>();
    private ArrayList<Pane> itemsrightC   = new ArrayList<Pane>();

    public void addItemleftC(Pane pane) {
        itemsleftC.add(pane);
 
    }
    public void addItemrightC(Pane pane) {
        itemsrightC.add(pane);
 
    }
    // public void showItemsleftC() {
    //     System.out.print(itemsleftC);
       
    // };
    
    // public void showItemsrightC() {
    //     System.out.print(itemsrightC);
       
    // };
    
    public ArrayList<Pane> getItemListleftC() {
        return itemsleftC;
    
    }
    
    public ArrayList<Pane> getItemListrightC() {
        return itemsrightC;
    
    }
    
    
}