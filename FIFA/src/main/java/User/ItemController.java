package User;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.Objects;

public class ItemController {

    @FXML
    private ImageView img;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLable;
    private Product product;

    @FXML
    private void click(MouseEvent mouseEvent) {
        myListener.onClickListener(mouseEvent);
    }

    private MyListener myListener;

    public void setData(Product product, MyListener myListener){
        this.product = product;
        this.myListener = myListener;
        nameLabel.setText(product.getName());
        priceLable.setText(SportsShop.CURRENCY + this.product.getPrice());
        Image image = new Image(this.product.getImgSrc());
        img.setImage(image);

    }

}
