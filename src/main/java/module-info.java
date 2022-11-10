module com.crittergestionfx.controller.crittergestionfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.crittergestionfx to javafx.fxml;
    exports com.crittergestionfx;
    exports com.crittergestionfx.controller;
    opens com.crittergestionfx.controller to javafx.fxml;
}