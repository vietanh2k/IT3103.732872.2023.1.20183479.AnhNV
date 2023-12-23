package GuiProject.hust.soict.dsai.javafx;

import AimsProject.hust.soict.dsai.aims.cart.Cart;
import AimsProject.hust.soict.dsai.aims.media.Media;
import AimsProject.hust.soict.dsai.aims.playable.Playable;

import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import javax.swing.text.TabableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CartScreenController {
    private Cart cart;
    private TabableView<Media> tblMedia;
    private TableColumn<Media, String> colMediaTitle;
    private TableColumn<Media, String> colMediaCategory;
    private TableColumn<Media, Float> colMediaCost;
    private Button btnPlay;
    private Button btnRemove;

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize(){
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        tblMedia.setItems(this.cart.getItemOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemproperty().addListener(
                new ChangeListener<Media>(){
                    @Override
                    public void changed(Observablevalue<? extends Media> observable, Media oldValue,
                                        Media newValue){
                        if(newValue!=null){
                            updateButtonBar(newValue);
                        }
                    }
                }
        );

        tfFilter.textProperty().addListener(new ChangeListener<String>()){
            @Override
            public void changed(ObservableVale<? extends String> observable, String oldValue,
        String newValue){
                showFilteredMedia(newValue);
            }
        }
    }

    void updateButtonBar(Media media){
        btnRemove.setVisible(true);
        if(media instanceof Playable){
            btnPlay.setVisible(true);
        }else{
            btnPlay.setVisible(false);
        }
    }

    void btnRemovePressed(ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelecteditem();
        cart.removeMedia(media);
    }
}
