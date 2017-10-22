/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parse;
// Modify as follows:
// 1. add "catch (FileNotFoundException e)" since the statement "input = new RandomAccessFile(file, "r");"
// 2. add "catch (IOException e)" since the statement "line = input.readLine();"
// 3. add "throws IOException" in the method signature since the statement "input.close();"

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author asus
 */
public static void parse(File file) throws IOException {
    RandomAccessFile input = null;
    String line = null;
    
    try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {// IOException
            System.out.println(line);
        }
        return;
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (input != null) {
            input.close();
        }
    }
}
   
