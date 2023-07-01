package code;

import java.util.ArrayList;

public class UnoGame {

    private int currentPlayer;
    private Deck deck;
    private Player jeff;
    public ArrayList<Player> players;
    private int direction = 1;

    public UnoGame(int numberPlayers, int numberDecks) {
        players = new ArrayList<Player>();
        this.currentPlayer = 0;
        for(int i = 0; i < numberPlayers; i++) {
            players.add(new Player(i));
        }
        deck = new Deck(numberDecks);
        deck.dealCards(players);
        flipTopCard();
        jeff = players.get(0);
    }
    public Player getJeff() {return jeff;}
    public Deck getDeck() {return deck;}
    public int getCurrentPlayer() {return currentPlayer;}
    public void setCurrentPlayer(int i) {currentPlayer = i;}

    public void flipTopCard() {
        UnoCard card = deck.playDeck.pop();
        deck.discardPile.push(card);
        System.out.println("Top card flipped is a " + card.getColor() + " " + card.getCard());
        while (card.getCard().equals(CARD.WILD) || card.getCard().equals(CARD.WILD_DRAW_4)) {
            System.out.println("Flipping next card");
            card = deck.playDeck.pop();
            deck.discardPile.push(card);
            System.out.println("Top card flipped is a " + card.getColor() + " " + card.getCard());
        }
    }
    public void playerTurn() {
        jeff = players.get(currentPlayer);
        System.out.println("code.Player " + currentPlayer + "'s turn");
        int i = 0;
        while(!deck.canPlay(jeff.getHand())){
            i += 1;
            deck.dealCard(jeff);
        }
        new GameWindow(this, i).display();
    }

    public Player getNextPlayer() {
        if(direction == 1) {
            if (currentPlayer == players.size() - 1) {
                return players.get(0);
            } else {
                return players.get(currentPlayer + 1);
            }
        } else {
            if (currentPlayer == 0) {
                return players.get(players.size()-1);
            } else {
                return players.get(currentPlayer - 1);
            }
        }
    }

    public void handleWild(UnoCard card) {
        System.out.println("Select the color you want it to be");
        jeff.removeCardFromHand(card);

        new AlertBox().display(this);

        currentPlayer = getNextPlayer().number;
    }

    public void handleWildDraw4(UnoCard card) {
        System.out.println("Dealing 4 cards to code.Player #" + getNextPlayer().number);
        System.out.println();
        deck.dealCard(getNextPlayer());
        deck.dealCard(getNextPlayer());
        deck.dealCard(getNextPlayer());
        deck.dealCard(getNextPlayer());

        jeff.removeCardFromHand(card);

        new AlertBox().display(this);

        currentPlayer = getNextPlayer().number;
        currentPlayer = getNextPlayer().number;
    }

    public void handleSkip(UnoCard card) {
        jeff.removeCardFromHand(card);
        deck.discardPile.push(card);
        System.out.println("code.Player #" + jeff.number +" played Card " + card.getColor() + " " + card.getCard());

        System.out.println("code.Player #" + getNextPlayer().number + " Got Skipped!");
        currentPlayer = getNextPlayer().number;
        currentPlayer = getNextPlayer().number;
    }

    public void handleReverse(UnoCard card) {
        jeff.removeCardFromHand(card);
        deck.discardPile.push(card);
        System.out.println("code.Player #" + jeff.number +" played Card " + card.getColor() + " " + card.getCard());

        System.out.println("code.Player #" + jeff.number + " Reversed the Direction");
        direction = direction*-1;
        currentPlayer = getNextPlayer().number;
    }

    public void handleDraw2(UnoCard card) {
        jeff.removeCardFromHand(card);
        deck.discardPile.push(card);
        System.out.println("code.Player #" + jeff.number +" played Card " + card.getColor() + " " + card.getCard());

        deck.dealCard(getNextPlayer());
        deck.dealCard(getNextPlayer());
        System.out.println("code.Player #" + getNextPlayer().number + " Got skipped and is drawing two cards");
        currentPlayer = getNextPlayer().number;
        currentPlayer = getNextPlayer().number;
    }
    public void handleWin() {
        System.out.println("PLAYER #" + jeff.number + " WINS!");
    }
}
