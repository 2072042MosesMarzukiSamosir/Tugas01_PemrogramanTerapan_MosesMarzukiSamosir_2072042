module com.example.tugas01_no2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas01_no2 to javafx.fxml;
    exports com.example.tugas01_no2;
}