module com.example.tugas01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas01 to javafx.fxml;
    exports com.example.tugas01;
}