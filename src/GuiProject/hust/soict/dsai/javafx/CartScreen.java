package GuiProject.hust.soict.dsai.javafx;

import AimsProject.hust.soict.dsai.aims.cart.Cart;

import javax.swing.*;
import java.io.IOException;

public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart){
        super();

        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Rannable(){
            @Override
            public void run(){
                try{
                    FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/screen/fxml/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    parent root = loader.load();
                    fxPanel.setScreen(new Scene(root));
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
}
