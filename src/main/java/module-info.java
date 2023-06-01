module com.example.foydalanuvchilartest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foydalanuvchilartest to javafx.fxml;
    exports com.example.foydalanuvchilartest;
}