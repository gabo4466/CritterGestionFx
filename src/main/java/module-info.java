module com.crittergestionfx.controller.crittergestionfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.crittergestionfx.controller to javafx.fxml;
    exports com.crittergestionfx.controller;
}