package sample.grocerystore;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AddController implements Initializable {

    @FXML
    private FontAwesomeIconView bars;

    @FXML
    private TextField inputName;

    @FXML
    private TextField inputPrice;

    @FXML
    private TextField inputQuantity;

    @FXML
    private TextField inputStatus;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
