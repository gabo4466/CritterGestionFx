module com.crittergestionfx.controller.crittergestionfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.crittergestionfx.controller to javafx.fxml;
    exports com.crittergestionfx.controller;
    exports com.crittergestionfx.model.objects;
}