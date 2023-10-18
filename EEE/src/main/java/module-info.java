module com.example.eee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eee to javafx.fxml;
    exports com.example.eee;
}