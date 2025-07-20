module com.example.flashcard {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;


    opens com.example.flashcard to javafx.fxml;
    exports com.example.flashcard;
    exports com.example.flashcard.controller;
    opens com.example.flashcard.controller to javafx.fxml;
}