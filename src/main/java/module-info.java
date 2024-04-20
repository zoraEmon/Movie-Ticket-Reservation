module com.russel.movieticketreservation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.russel.movieticketreservation to javafx.fxml;
    exports com.russel.movieticketreservation;
}