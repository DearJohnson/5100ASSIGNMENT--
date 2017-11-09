// Project1
// Hangman Game Java

package hangman;
/**
 *
 * @author asus
 */	
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Hangman {
    /**
     * @param args the command line arguments
     */
    private static Scanner user = new Scanner(System.in);   // reading all user input
    private static int stage = 0;       // stage of current round
    private static List<String> words;  // pool of words
    private static String word;         // plaintext word for current round
    private static String hidden;       // masked word

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
	// Nice input
        Scanner input = new Scanner(new FileReader("C:/NEU/JAVA/NetBeansProjects/hangman/src/words.txt"));
        words = new ArrayList<String>();
        while (input.hasNextLine()) {
            words.add(input.nextLine());
        }
        input.close();
        System.out.println("Welcome To Hangman Game!");
        playRound();
    }
	
    private static void playRound() throws FileNotFoundException {
        Scanner game_state = new Scanner(new FileReader("C:/NEU/JAVA/NetBeansProjects/hangman/src/game_results.txt"));
        game_state.useDelimiter("\\s*;\\s*");
        printGameStateString(game_state); // show title screen on console (first in game_results.txt)
        Random pick = new Random();
        int wordPoolSize = words.size(); // dynamic approach: variable that measures number of words in text file
        int  n = pick.nextInt(wordPoolSize) + 1;
        word = words.get(n-1); // replace with .remove() and handle empty words list
        hidden = new String(new char[word.length()]).replace("\0", "_");
        String letters  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // remaining letters to pick from
        String alphabet  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // required for validity check
        int stage_tracker;

        while (hidden.contains("_") && stage < 7) {
            System.out.println(" \n \n" + "HIDDEN WORD: " + hidden.replace("", " ").trim());
            System.out.println(" \n \n" + letters.replace("", " ").trim());
            System.out.println(" \n \n" + "Please take a guess (enter a letter A - Z)");
            System.out.print(">");

            char c = user.next().toLowerCase().charAt(0);

            while (!alphabet.contains(String.valueOf(c).toUpperCase())) {
                System.out.println("That's not a letter! Please try again.");
                System.out.print(">");
                c = user.next().toLowerCase().charAt(0);
            }

            if (letters.contains(String.valueOf(c).toUpperCase())) {
                letters = letters.replace(String.valueOf(c).toUpperCase(), "\u2588");
            } 
            else {
                System.out.println("You already tried this letter! Please pick another one.");
                System.out.print(">");
                c = user.next().toLowerCase().charAt(0);
            }

            System.out.println(" \n" + "---------------------------------------------------" + " \n");

            stage_tracker = stage;
            evaluateGuess(checkInput(c));
            if (stage_tracker != stage){ 
                printGameStateString(game_state); 
            }
            if (stage == 7) {
                System.out.println(" \n \n" + "Sorry! You couldn't guess the word \"" + word + "\""+ "!");
            }

            if (hidden.equals(word)) {
                System.out.println(" \n \n" + "SOLUTION: " + word.replace("", " ").trim());
                System.out.println(" \n \n" + "Congratulations! You've guessed the word \"" + word + "\"");
                break;
            }
        }
        game_state.close();
    }

    private static String checkInput(char letter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (hidden.charAt(i) != '_') {
                sb.append(word.charAt(i)); 
            }
            else if (letter == word.charAt(i)){ 
                sb.append(letter); 
            }
            else{ 
                sb.append("_"); 
            }
        }
        return sb.toString();
    }

    private static void evaluateGuess(String checked) {
        if (hidden.equals(checked)) { 
            stage++; 
        }
        else { 
            hidden = checked; 
        }
    }
    
    // each time it's called it will print next set of characters surrounded by ; and ; in file game_results.txt
    private static void printGameStateString(Scanner state) throws FileNotFoundException{
    	if( state.hasNext() ){
	    System.out.println(state.next());
    	}
        else
            System.out.println("Game has already ended!");
     }
}
