package code;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GameWindow {

    UnoGame UnoGame;
    private ImageView topCardImage;
    private FlowPane handPane;
    private VBox middleText;
    Stage window;
    int cardsDrawn;

    public GameWindow(UnoGame uno, int i) {
        UnoGame = uno;
        cardsDrawn = i;
    }

    public void display() {
         window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Player #" + UnoGame.getJeff().number + "'s turn");
        BorderPane root = new BorderPane();

        // Create the top area to display the top card
        topCardImage = new ImageView();
        topCardImage.setFitWidth(100);
        topCardImage.setFitHeight(150);
        topCardImage.setImage(UnoGame.getDeck().discardPile.peek().getCardImage());
        root.setTop(createCardComponent(UnoGame.getDeck().discardPile.peek(), true));

        middleText = new VBox();

        if(cardsDrawn != 0) {
            Label labelCardsDrawn = new Label();
            if(cardsDrawn == 1) {
                labelCardsDrawn.setText("You drew " + cardsDrawn + " card and can now play");
            } else {
                labelCardsDrawn.setText("You drew " + cardsDrawn + " cards and can now play");
            }
            middleText.getChildren().add(labelCardsDrawn);
        }
        Label labelPlayersTurn = new Label("Player #" + UnoGame.getJeff().number + "'s turn");
        middleText.getChildren().add(labelPlayersTurn);
        middleText.setAlignment(Pos.CENTER);
        root.setCenter(middleText);

        // Create the center area to display the user's hand
        handPane = new FlowPane();
        handPane.setPadding(new Insets(10));
        handPane.setHgap(10);
        handPane.setVgap(10);
        root.setBottom(handPane);

        for(int i = 0; i < UnoGame.getJeff().getHand().size(); i++) {
            handPane.getChildren().add(createCardComponent(UnoGame.getJeff().getHand().get(i), false));
        }
        // Show the window
        Scene scene = new Scene(root, 800, 600);
        window.setScene(scene);
        window.show();
    }
    private Node createCardComponent(UnoCard card, boolean top) {
        ImageView imageView = new ImageView(card.getCardImage());
        imageView.setFitWidth(100);
        imageView.setFitHeight(150);
        if(!top) {
            imageView.setOnMouseClicked(event -> {
                // Handle card click event
                if (UnoGame.getDeck().isPlayable(card)) {
                    System.out.println("Clicked Playable Card");

                    if (card.getCard().equals(CARD.WILD)) {
                        UnoGame.handleWild(card);
                    } else if (card.getCard().equals(CARD.WILD_DRAW_4)) {
                        UnoGame.handleWildDraw4(card);
                    } else if (card.getCard().equals(CARD.SKIP)) {
                        UnoGame.handleSkip(card);
                    } else if (card.getCard().equals(CARD.REVERSE)) {
                        UnoGame.handleReverse(card);
                    } else if (card.getCard().equals(CARD.DRAW_2)) {
                        UnoGame.handleDraw2(card);
                    } else {
                        UnoGame.getJeff().removeCardFromHand(card);
                        UnoGame.getDeck().discardPile.push(card);
                        UnoGame.setCurrentPlayer(UnoGame.getNextPlayer().number);
                    }
                    if (UnoGame.getJeff().getHand().size() == 0) {
                        UnoGame.handleWin();
                        new WinWindow(UnoGame.getJeff(), UnoGame).display();
                        window.close();
                        return;
                    }
                    window.close();
                    if ((card.getCard().equals(CARD.SKIP) || card.getCard().equals(CARD.WILD_DRAW_4) || card.getCard().equals(CARD.DRAW_2)) && UnoGame.players.size() == 2) {
                        UnoGame.playerTurn();
                    } else {
                        new TurnStartWindow().display(UnoGame);
                    }
                }
            });
        }
        return imageView;
    }
}
