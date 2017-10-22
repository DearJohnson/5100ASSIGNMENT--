/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myindexoutofboundexception;
// Modify as follows:
// 1. We can see the statement "input = new RandomAccessFile(file, "r");" and we need to add the statements "throws FileNotFoundException" and "catch (FileNotFoundException e)".
// 2. We can see the statement "while ((line = input.readLine()) != null)" and we need to add the statements "throws IOException" and "catch (IOException e)".

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author apple
 */
public class parse{
    public static void parse(File file) throws FileNotFoundException, IOException {
        RandomAccessFile input = null;
        String line = null;
      
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
