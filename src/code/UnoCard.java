package code;

import javafx.scene.image.Image;

public class UnoCard {
    private COLOR color;
    private CARD card;

    public UnoCard(COLOR color, CARD card) {
        this.color = color;
        this.card = card;
    }

    public CARD getCard() {
        return this.card;
    }
    public COLOR getColor() {
        return this.color;
    }
    public void setColor(COLOR color) {
        this.color = color;
    }

    public Image getCardImage() {
        if(this.color == COLOR.RED) {
            if(this.card == CARD.WILD) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red.png");
            }
            if(this.card == CARD.ZERO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red0.png");
            }
            if(this.card == CARD.ONE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red1.png");
            }
            if(this.card == CARD.TWO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red2.png");
            }
            if(this.card == CARD.THREE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red3.png");
            }
            if(this.card == CARD.FOUR) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red4.png");
            }
            if(this.card == CARD.FIVE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red5.png");
            }
            if(this.card == CARD.SIX) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red6.png");
            }
            if(this.card == CARD.SEVEN) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red7.png");
            }
            if(this.card == CARD.EIGHT) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red8.png");
            }
            if(this.card == CARD.NINE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red9.png");
            }
            if(this.card == CARD.DRAW_2) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-reddraw2.png");
            }
            if(this.card == CARD.REVERSE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-redreverse.png");
            }
            if(this.card == CARD.SKIP) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-redskip.png");
            }
        } else if(this.color == COLOR.BLUE) {
            if(this.card == CARD.WILD) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue.png");
            }
            if(this.card == CARD.ZERO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue0.png");
            }
            if(this.card == CARD.ONE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue1.png");
            }
            if(this.card == CARD.TWO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue2.png");
            }
            if(this.card == CARD.THREE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue3.png");
            }
            if(this.card == CARD.FOUR) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue4.png");
            }
            if(this.card == CARD.FIVE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue5.png");
            }
            if(this.card == CARD.SIX) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue6.png");
            }
            if(this.card == CARD.SEVEN) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue7.png");
            }
            if(this.card == CARD.EIGHT) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue8.png");
            }
            if(this.card == CARD.NINE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blue9.png");
            }
            if(this.card == CARD.DRAW_2) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-bluedraw2.png");
            }
            if(this.card == CARD.REVERSE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-bluereverse.png");
            }
            if(this.card == CARD.SKIP) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-blueskip.png");
            }
        } else if(this.color == COLOR.GREEN) {
            if(this.card == CARD.WILD) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green.png");
            }
            if(this.card == CARD.ZERO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green0.png");
            }
            if(this.card == CARD.ONE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green1.png");
            }
            if(this.card == CARD.TWO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green2.png");
            }
            if(this.card == CARD.THREE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green3.png");
            }
            if(this.card == CARD.FOUR) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green4.png");
            }
            if(this.card == CARD.FIVE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green5.png");
            }
            if(this.card == CARD.SIX) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green6.png");
            }
            if(this.card == CARD.SEVEN) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green7.png");
            }
            if(this.card == CARD.EIGHT) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green8.png");
            }
            if(this.card == CARD.NINE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-green9.png");
            }
            if(this.card == CARD.DRAW_2) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-greendraw2.png");
            }
            if(this.card == CARD.REVERSE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-greenreverse.png");
            }
            if(this.card == CARD.SKIP) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-greenskip.png");
            }
        } else if(this.color == COLOR.YELLOW) {
            if(this.card == CARD.WILD) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow.png");
            }
            if(this.card == CARD.ZERO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow0.png");
            }
            if(this.card == CARD.ONE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow1.png");
            }
            if(this.card == CARD.TWO) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow2.png");
            }
            if(this.card == CARD.THREE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow3.png");
            }
            if(this.card == CARD.FOUR) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow4.png");
            }
            if(this.card == CARD.FIVE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow5.png");
            }
            if(this.card == CARD.SIX) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow6.png");
            }
            if(this.card == CARD.SEVEN) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow7.png");
            }
            if(this.card == CARD.EIGHT) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow8.png");
            }
            if(this.card == CARD.NINE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellow9.png");
            }
            if(this.card == CARD.DRAW_2) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellowdraw2.png");
            }
            if(this.card == CARD.REVERSE) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellowreverse.png");
            }
            if(this.card == CARD.SKIP) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-yellowskip.png");
            }
        } else if(this.color == COLOR.BLACK) {
            if(this.card == CARD.WILD) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-wildchange.png");
            }
            if(this.card == CARD.WILD_DRAW_4) {
                return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-wilddraw4.png");
            }
        }
        return new Image("file:C:\\Users\\arraw\\IdeaProjects\\jfx\\src\\CardImages\\uno_card-red0.png");
    }
}
