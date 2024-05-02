package sample.grocerystore;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TableColumn<Product, Integer> idProduct;

    @FXML
    private TableColumn<Product, String> nameProduct;

    @FXML
    private TableColumn<Product, Double> priceProduct;

    @FXML
    private TableColumn<Product, Integer> quantityProduct;

    @FXML
    private TableColumn<Product, String> statusProduct;

    @FXML
    private TableView<Product> table;

    @FXML
    private TextField textInput;

    @FXML
    private FontAwesomeIconView arrowLeft;

    @FXML
    private FontAwesomeIconView priceNavigation;

    @FXML
    private FontAwesomeIconView saleNavigation;

    @FXML
    private FontAwesomeIconView tableNavigation;

    @FXML
    private FontAwesomeIconView searchFont;

    @FXML
    private AnchorPane leftSide;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private Text titleTable;

    @FXML
    private FontAwesomeIconView bars;

    private boolean isSearchClicked = false;

    private Node previousContent;

    @FXML
    void hideLeftSideCurtain(MouseEvent event) {
        leftSide.setVisible(false);
        table.setLayoutX(-38);
        table.setPrefWidth(870);
        bars.setVisible(true);
        bars.setLayoutX(-36);
        bars.setLayoutY(30);
        titleTable.setLayoutX(300);
        titleTable.setLayoutY(40);
    }

    @FXML
    void expandSearch(MouseEvent event) {
        if (!isSearchClicked) {
            textInput.setVisible(true);
            isSearchClicked = true;
        } else {
            textInput.setVisible(false);
            isSearchClicked = false;
        }
    }

    @FXML
    void showLeftSideMenu(MouseEvent event) {
        leftSide.setVisible(true);
        table.setLayoutX(17);
        table.setLayoutY(63);
        table.setPrefWidth(817);
        bars.setVisible(false);
        titleTable.setLayoutX(340);
        titleTable.setLayoutY(40);
    }

    @FXML
    void navigateToSale(MouseEvent event) throws IOException {
        previousContent = mainBorderPane.getCenter();
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("add-navigation.fxml")));
        mainBorderPane.setCenter(anchorPane);
    }

    @FXML
    void navigateToTable(MouseEvent event) throws IOException {
        if (previousContent != null) mainBorderPane.setCenter(previousContent);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setValTable();
    }

    private void setValTable() {
        ObservableList<Product> list = FXCollections.observableArrayList(
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale"),
                new Product("Asan", 3, 100.0, "Sale")
        );

        idProduct.setCellValueFactory(new PropertyValueFactory<>("ID"));
        nameProduct.setCellValueFactory(new PropertyValueFactory<>("name"));
        quantityProduct.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceProduct.setCellValueFactory(new PropertyValueFactory<>("price"));
        statusProduct.setCellValueFactory(new PropertyValueFactory<>("status"));

        table.setItems(list);
    }


}
