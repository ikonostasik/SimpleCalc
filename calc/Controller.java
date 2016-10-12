package calc;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.*;

public class Controller {
    @FXML
    private Label fin;
    @FXML
    private Button button;
    @FXML
    private Button Comp;
    @FXML
    private TextField exp;

    @FXML
    public void initialize() {
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.exit(0);
            }
        });
        Comp.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                OPN n = new OPN();
                java.util.List<String> expression = n.parse(exp.getText());
                if (n.flag) {
                    Double Text = new Double(n.calc(expression));
                    fin.setText(Double.toString(Text));
                }
            }
        });
    }


}
