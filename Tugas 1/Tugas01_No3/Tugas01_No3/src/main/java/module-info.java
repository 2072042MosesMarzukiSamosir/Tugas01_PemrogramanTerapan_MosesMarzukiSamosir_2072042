module com.example.tugas01_no3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas01_no3 to javafx.fxml;
    exports com.example.tugas01_no3;
}