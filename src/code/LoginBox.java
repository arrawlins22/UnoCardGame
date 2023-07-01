package code;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginBox {

    private static int numPlayers;
    private static int numDecks;


    public static boolean display() {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name Label
        Label nameLabel = new Label("Number of Players");
        GridPane.setConstraints(nameLabel, 0 ,0);

        //Name Input
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);
        nameInput.setPromptText("Number of Players");

        //Password label
        Label passLabel = new Label("Number of Decks");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("Number of Decks");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Start game");
        loginButton.setOnAction(e -> {
            if(validateInput(nameInput.getText(), passInput.getText())) {
                //Game Creation Success
                System.out.println("Starting game with player count of " + nameInput.getText());
                System.out.println("Starting game with deck count of " + passInput.getText());
                UnoGame unogame = new UnoGame(numPlayers, numDecks);
                window.close();
                unogame.playerTurn();
            } else {
                System.out.println("Invalid Input");
            }
        });
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.showAndWait();

        return true;
    }

    private static boolean validateInput(String players, String decks) {
        numPlayers = Integer.parseInt(players);
        numDecks = Integer.parseInt(decks);
        if(numDecks < 1 || numPlayers < 2) {
            return false;
        } if (((float) numDecks/ (float) numPlayers) < .1) {
            return false;
        }
        return true;
    }
}