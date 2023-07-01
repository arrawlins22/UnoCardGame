package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    public int number;
    private ArrayList<UnoCard> hand;
    private int pointsInHand;

    public Player(int number) {
        hand = new ArrayList<UnoCard>();
        this.number = number;
        pointsInHand = 0;
    }

    public int getPointsInHand() {
        return pointsInHand;
    }

    public void removeCardFromHand(UnoCard card) {
        hand.remove(card);
        if(card.getCard().equals(CARD.ZERO)) {
            return;
        } else if(card.getCard().equals(CARD.ONE)) {
            pointsInHand -= 1;
        } else if (card.getCard().equals(CARD.TWO)) {
            pointsInHand -= 2;
        } else if(card.getCard().equals(CARD.THREE)) {
            pointsInHand -= 3;
        } else if (card.getCard().equals(CARD.FOUR)) {
            pointsInHand -= 4;
        } else if(card.getCard().equals(CARD.FIVE)) {
            pointsInHand -= 5;
        } else if (card.getCard().equals(CARD.SIX)) {
            pointsInHand -= 6;
        } else if(card.getCard().equals(CARD.SEVEN)) {
            pointsInHand -= 7;
        } else if (card.getCard().equals(CARD.EIGHT)) {
            pointsInHand -= 8;
        } else if(card.getCard().equals(CARD.NINE)) {
            pointsInHand -= 9;
        } else if (card.getCard().equals(CARD.DRAW_2)) {
            pointsInHand -= 10;
        } else if(card.getCard().equals(CARD.REVERSE)) {
            pointsInHand -= 10;
        } else if (card.getCard().equals(CARD.SKIP)) {
            pointsInHand -= 10;
        } else if(card.getCard().equals(CARD.WILD_DRAW_4)) {
            pointsInHand -= 10;
        } else if (card.getCard().equals(CARD.WILD)) {
            pointsInHand -= 10;
        }
    }

    public void addCardToHand(UnoCard card) {
        hand.add(card);
        if(card.getCard().equals(CARD.ZERO)) {
            return;
        } else if(card.getCard().equals(CARD.ONE)) {
            pointsInHand += 1;
        } else if (card.getCard().equals(CARD.TWO)) {
            pointsInHand += 2;
        } else if(card.getCard().equals(CARD.THREE)) {
            pointsInHand += 3;
        } else if (card.getCard().equals(CARD.FOUR)) {
            pointsInHand += 4;
        } else if(card.getCard().equals(CARD.FIVE)) {
            pointsInHand += 5;
        } else if (card.getCard().equals(CARD.SIX)) {
            pointsInHand += 6;
        } else if(card.getCard().equals(CARD.SEVEN)) {
            pointsInHand += 7;
        } else if (card.getCard().equals(CARD.EIGHT)) {
            pointsInHand += 8;
        } else if(card.getCard().equals(CARD.NINE)) {
            pointsInHand += 9;
        } else if (card.getCard().equals(CARD.DRAW_2)) {
            pointsInHand += 10;
        } else if(card.getCard().equals(CARD.REVERSE)) {
            pointsInHand += 10;
        } else if (card.getCard().equals(CARD.SKIP)) {
            pointsInHand += 10;
        } else if(card.getCard().equals(CARD.WILD_DRAW_4)) {
            pointsInHand += 10;
        } else if (card.getCard().equals(CARD.WILD)) {
            pointsInHand += 10;
        }
    }

    public int printHand() {
        Scanner printHandScnr = new Scanner(System.in);
        for(int i = 0; i < hand.size(); i++) {
            System.out.println(" " + i + " " + hand.get(i).getColor() + " " + hand.get(i).getCard());
        }
        System.out.println("Type a number to play a card");
        return Integer.parseInt(printHandScnr.nextLine());
    }
    public ArrayList<UnoCard> getHand() {
        return hand;
    }

}
