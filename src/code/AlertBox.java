package code;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    Label label;

    public void display(UnoGame uno) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Pick a Color");
        window.setMinWidth(250);

        label = new Label();
        label.setText("Pick a Color");
        Button redButton = new Button("RED");
        redButton.setOnAction(e -> {
            uno.getDeck().discardPile.push(new UnoCard(COLOR.RED, CARD.WILD));
            window.close();
        });
        Button blueButton = new Button("BLUE");
        blueButton.setOnAction(e -> {
            uno.getDeck().discardPile.push(new UnoCard(COLOR.BLUE, CARD.WILD));
            window.close();
        });
        Button greenButton = new Button("GREEN");
        greenButton.setOnAction(e -> {
            uno.getDeck().discardPile.push(new UnoCard(COLOR.GREEN, CARD.WILD));
            window.close();
        });
        Button yellowButton = new Button("YELLOW");
        yellowButton.setOnAction(e -> {
            uno.getDeck().discardPile.push(new UnoCard(COLOR.YELLOW, CARD.WILD));
            window.close();
        });
        window.setOnCloseRequest(e -> {
            e.consume();
            label.setText("Pick Bitch");
            label.setTextFill(Color.RED);
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, redButton, blueButton, greenButton, yellowButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
