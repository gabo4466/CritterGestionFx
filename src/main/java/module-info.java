module com.crittergestionfx.controller.crittergestionfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.crittergestionfx.controller.crittergestionfx to javafx.fxml;
    exports com.crittergestionfx.controller.crittergestionfx;
}