module com.example.lf10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lf10 to javafx.fxml;
    exports com.example.lf10;
}