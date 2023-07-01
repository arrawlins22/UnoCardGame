package code;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TurnStartWindow {

    Label label;

    public void display(UnoGame uno) {
        Stage window = new Stage();

        label = new Label("Player #" + uno.getCurrentPlayer() + "'s turn");

        Button button = new Button("Start Turn");
        button.setOnAction(e -> {
            window.close();
            uno.playerTurn();
        });
        window.setOnCloseRequest( e -> {
            e.consume();
            window.close();
            uno.playerTurn();
        });
        window.initModality(Modality.APPLICATION_MODAL);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 800, 600);

        window.setScene(scene);
        window.showAndWait();
    }
}
