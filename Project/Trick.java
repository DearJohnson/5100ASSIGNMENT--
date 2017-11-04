/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

public class Trick extends GroupOfCards {

    private int winner;
    private Card winningCard;
    private boolean hearts = false;
    private boolean queen = false;


    public Trick(int players) {
        super(2 * players - 1);
    }

    public int getWinner() {
        return winner;
    }

    public Card getWinningCard() {
        return winningCard;
    }

    public boolean getHearts() {
        return hearts;
    }

    public boolean getQueen() {
        return queen;
    }

    public void setWinningCard(int num, int suit) {
        winningCard = new Card(num, suit);
    }

    private boolean isWinner(Card card) {
        if (winningCard == null) {
            return true;
        } else if (winningCard.getSuit() == card.getSuit() && card.getNum() > winningCard.getNum()) {
            return true;
        }
        return false;

    }

    public void update(Card card, int index) {
        if(isWinner(card)) {
            setWinningCard(card.getNum(), card.getSuit());
            winner = index;
        }
        if (card.getSuit() == 2) {
            hearts = true;
        }
        if (card.getSuit() == 3 && card.getNum() == 12) {
            queen = true;
        }
    }
}
