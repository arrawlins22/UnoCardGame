package code;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WinWindow {
    Player player;
    Stage window;
    Scene scene1;
    Button restartButton;
    UnoGame unoGame;
    public WinWindow(Player winner, UnoGame unoGame) {
        player = winner;
        this.unoGame = unoGame;
    }

    public void display() {
        window = new Stage();
        window.setTitle("Player #" + player.number + " WINS");
        restartButton = new Button();
        restartButton.setText("Play again?");
        Label label = new Label("Player #" + player.number + " WINS");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        restartButton.setOnAction(e -> {
            new HomeWindow().display();
            window.close();
        });

        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        label.setPadding(new Insets(20));
        layout.getChildren().add(label);

        for(int i = 0; i < unoGame.players.size(); i++) {
            if(unoGame.players.get(i) == player) {

            } else {
                layout.getChildren().add(new Label("Player number " + unoGame.players.get(i).number + " scored " + unoGame.players.get(i).getPointsInHand() + " points."));
            }
        }

        layout.getChildren().add(restartButton);
        scene1 = new Scene(layout, 300, 250);
        window.setScene(scene1);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Title", "Are you sure?");
        if(answer) {
            window.close();
        }
    }
}
