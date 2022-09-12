package User;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MarketController {

    @FXML
    private VBox chosenProductCard;

    @FXML
    private GridPane grid;

    @FXML
    private ImageView productImg;

    @FXML
    private Label productNameLable;

    @FXML
    private Label productPriceLabel;

    @FXML
    private ScrollPane scroll;

    private final List<Product> products = new ArrayList<>();
    private Image image;
    private MyListener myListener;

    private List<Product> getData() {
        List<Product> products = new ArrayList<>();
        Product product;

        product = new Product();
        product.setName("Brazil Jersey");
        product.setPrice(790);
        product.setImgSrc("Images/brazil.jpg");
        product.setColor("6A7324");
        products.add(product);

        product = new Product();
        product.setName("Germany Jersey");
        product.setPrice(1190);
        product.setImgSrc("Images/Germany.jpg");
        product.setColor("A7745B");
        products.add(product);

        product = new Product();
        product.setName("Shoes");
        product.setPrice(1190);
        product.setImgSrc("Images/Shoes.jpg");
        product.setColor("F16C31");
        products.add(product);




        return products;
    }

    private void setChosenProduct(Product product) {
        productNameLable.setText(product.getName());
        productPriceLabel.setText(SportsShop.CURRENCY + product.getPrice());
//        image = new Image(product.getImgSrc());
        productImg.setImage(image);
        chosenProductCard.setStyle("-fx-background-color: #" + product.getColor() + ";\n" + "    -fx-background-radius: 30;");

    }

    public void initialize(){
        products.addAll(getData());
        if (products.size() > 0){
            setChosenProduct(products.get(0));
            myListener = new MyListener() {
                @Override
                public void onClickListener(MouseEvent product) {
                    setChosenProduct(products.get(0));
                }
            };
        }
        int column = 0;
        int row = 1;
        for (int i = 0; i < products.size(); i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Controller/item.fxml"));

            ItemController itemController = fxmlLoader.getController();
            itemController.setData(products.get(i),myListener);

            if (column == 3){
                column = 0;
                row++;
            }
            grid.add(grid, column++, row); //(child,column,row)
            //set grid width
            grid.setMinWidth(Region.USE_COMPUTED_SIZE );
            grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
            grid.setMaxWidth(Region.USE_PREF_SIZE);

            //set grid height
            grid.setMinHeight(Region.USE_COMPUTED_SIZE);
            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
            grid.setMaxHeight(Region.USE_PREF_SIZE);

            GridPane.setMargin(grid, new Insets(10));

        }
    }
}