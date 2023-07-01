package code;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Deck {

    public ArrayList<UnoCard> deck;
    public Stack<UnoCard> playDeck;
    public Stack<UnoCard> discardPile;
    private int decks;

    public Deck(int decks) {
        deck = new ArrayList<UnoCard>();
        playDeck = new Stack<UnoCard>();
        discardPile = new Stack<UnoCard>();
        this.decks = decks;
        addCards(decks);
        shuffleDeck(deck);
        prepPlayDeck();
    }

    private void addCards(int decks) {
        int i = 0;
        COLOR color = COLOR.RED;
        CARD card;
        //LOOP PER DECK
        while(i < decks) {
            color = COLOR.BLACK;
            deck.add(new UnoCard(color, CARD.WILD));
            deck.add(new UnoCard(color, CARD.WILD));
            deck.add(new UnoCard(color, CARD.WILD));
            deck.add(new UnoCard(color, CARD.WILD));
            deck.add(new UnoCard(color, CARD.WILD_DRAW_4));
            deck.add(new UnoCard(color, CARD.WILD_DRAW_4));
            deck.add(new UnoCard(color, CARD.WILD_DRAW_4));
            deck.add(new UnoCard(color, CARD.WILD_DRAW_4));
            //LOOP PER COLORS
            for(int j = 0; j < 4; j++) {
                if(j == 0) {
                    color = COLOR.RED;
                }
                if(j == 1) {
                    color = COLOR.GREEN;
                }
                if(j == 2) {
                    color = COLOR.BLUE;
                }
                if(j == 3) {
                    color = COLOR.YELLOW;
                }
                //ADD ONE OF THESE CARDS per color
                deck.add(new UnoCard(color, CARD.ZERO));
                //ADD TWO OF THESE PER code.COLOR
                for(int k = 0; k < 2; k++) {
                    deck.add(new UnoCard(color, CARD.ONE));
                    deck.add(new UnoCard(color, CARD.TWO));
                    deck.add(new UnoCard(color, CARD.THREE));
                    deck.add(new UnoCard(color, CARD.FOUR));
                    deck.add(new UnoCard(color, CARD.FIVE));
                    deck.add(new UnoCard(color, CARD.SIX));
                    deck.add(new UnoCard(color, CARD.SEVEN));
                    deck.add(new UnoCard(color, CARD.EIGHT));
                    deck.add(new UnoCard(color, CARD.NINE));
                    deck.add(new UnoCard(color, CARD.DRAW_2));
                    deck.add(new UnoCard(color, CARD.REVERSE));
                    deck.add(new UnoCard(color, CARD.SKIP));
                }
            }
            i++;
        }
    }

    private void shuffleDeck(ArrayList<UnoCard> deck) {
        Random r = new Random();
        int n = deck.size();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = r.nextInt(i + 1);
            // Swap arr[i] with the element at random index
            UnoCard temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }
    // prepares the stack for use
    private void prepPlayDeck() {
        for(int i = 0; i < deck.size()-1; i++){
            playDeck.push(deck.get(i));

        }
    }

    public void dealCards(ArrayList<Player> players) {
        //Specifically insuring one Card Dealt at a time per player
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < players.size(); j++) {
                players.get(j).addCardToHand(playDeck.pop()) ;
            }
        }
    }

    private void reshuffleDeck() {
        ArrayList<UnoCard> temp = new ArrayList<UnoCard>();
        UnoCard topCard = discardPile.pop();
        while(!discardPile.isEmpty()) {
            temp.add(discardPile.pop());
        }
        discardPile.push(topCard);
        shuffleDeck(temp);
        for(int i = 0; i < temp.size()-1; i++){
            if(temp.get(i).getCard().equals(CARD.WILD) || temp.get(i).getCard().equals(CARD.WILD_DRAW_4)) {
                temp.get(i).setColor(COLOR.BLACK);
            }
            playDeck.push(temp.get(i));
        }
    }

    public void dealCard(Player p) {
        if(playDeck.isEmpty()) {
            System.out.println("Reshuffling The code.Deck");
            reshuffleDeck();
        }
        p.addCardToHand(playDeck.pop());
    }

    public boolean isPlayable(UnoCard card) {
        if(card.getColor().equals(COLOR.BLACK)) {
            return true;
        }
        if(card.getColor().equals(discardPile.peek().getColor())) {
            return true;
        }
        if(card.getCard().equals(discardPile.peek().getCard())) {
            return true;
        }
        return false;
    }

    public boolean canPlay(ArrayList<UnoCard> playerHand) {
        UnoCard temp;
        for(int i = 0; i < playerHand.size(); i++) {
            temp = playerHand.get(i);
            if (isPlayable(temp)){
                return true;
            }
        }
        return false;
    }


}
