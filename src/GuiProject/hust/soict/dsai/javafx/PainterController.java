package GuiProject.hust.soict.dsai.javafx;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class PainterController {
    private Pane drawingAreaPane;
    void clearButtonPressed(ActionEvent event){
        drawingAreaPane.getChildren().clear();
    }

    void drawingAreaMouseDragged(MouseEvent event){
        Circle newCircle = new Circle(event.getX(), event.getY(),4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
