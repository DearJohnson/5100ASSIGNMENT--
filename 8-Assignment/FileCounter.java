/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.io.IOException;
import java.util.Scanner;

public class FileCounter {
    
    private int characterCount, wordCount, lineCount;
    
    public FileCounter(){  
        characterCount=0;
        wordCount=0;
        lineCount=0;
    }
    /**
      Processes an input source and adds its character, word, and line
      counts to the respective variables.
      @param in the scanner to process
   */
    
    void read(Scanner in) throws IOException { // If make read() private, "counter.read(fileIn)" in FileAnalyzer won't work
        StringBuilder sb=new StringBuilder();
        while (in.hasNextLine()){
            String line=in.nextLine();                        
            sb.append(line);
            ++lineCount;
            wordCount += line.split(" ").length;
            characterCount += line.length();
        }
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

}
