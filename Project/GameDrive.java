/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

public class GameDrive {
    
    public static void main(String[] args) {
	
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Please input the number of players: (3-6) ");
            int n=input.nextInt();
            Game game =new Game(n);
            game.playAGame();
            while (true) {
                System.out.println("Play another hand? (y/n)");
                char c=input.next().charAt(0);
                if (c=='n') {
                    input.close();
                    return;
                }
                if (c=='y') 
                    break;
            }            
        }     
    }
}