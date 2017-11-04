/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

public class Card {
    private int num;
    private int suit;

    public Card(int num, int suit) {
        this.num = num;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getNum() {
        return num;
    }

    public void display() {
        switch (suit) {
            case(0): System.out.print("Of Clubs    ");
                break;
            case(1): System.out.print("Of Diamonds ");
                break;
            case(2): System.out.print("Of Hearts   ");
                break;
            case(3): System.out.print("Of Spades   ");
                break;
            default:break;
        }
        switch (num) {
            case(11):
                System.out.println("Jack");
                break;
            case(12):
                System.out.println("Queen");
                break;
            case(13):
                System.out.println("King");
                break;
            case(14):
                System.out.println("Ace");
                break;
            default:
                System.out.println(num);
                break;
        }
    }
}