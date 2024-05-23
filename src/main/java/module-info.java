module com.example.hito {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hito to javafx.fxml;
    exports com.example.hito;
}