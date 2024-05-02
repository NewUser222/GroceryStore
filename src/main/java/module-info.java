module sample.grocerystore {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;


    opens sample.grocerystore to javafx.fxml;
    exports sample.grocerystore;
}