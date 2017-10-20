/**Q1
 * When a program fails due to an uncaught exception, the system automatically prints out the exception’s stack trace. 
 * If the failure is not easily reproducible, it may be difficult or impossible to get any more information. 
 * Therefore, it is critically important that the exception’s toString() method return, as much information as possible concerning the cause of the failure. 
 * In other words, the detail message of an exception should capture the failure for subsequent analysis. 
 * To capture the failure, the detail message of an exception should contain the values of all parameters and fields that “contributed to the exception.” (Score 2).
 **/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myindexoutofboundexception;

import java.util.Random;

/**
 *
 * @author apple
 */
public class MyIndexOutOfBoundException extends RuntimeException{

    /**
     * @param args the command line arguments
     */
    int lowerBound, upperBound, index;
     
    MyIndexOutOfBoundException(){        
    }
    
    MyIndexOutOfBoundException(int output, int lowest, int highest){
        this.index = output;
        this.lowerBound = lowest;
        this.upperBound = highest;
    }
    
    public String toString(){
        return "Error Message: Index: " + this.index + ", but Lower bound: " + this.lowerBound + ", Upper bound: " + this.upperBound;
    }
    
    public static void main(String[] args) {
        // TODO code application logic  
        int length = 10;
        int[] array = new int[length];
        Random temp = new Random();
        System.out.println("Cerate a random array with the length of " + length); 
        while (true){
            int n = temp.nextInt(length + length/2);
            try{
                if (n >= length)
                    throw new MyIndexOutOfBoundException(n, 0, length - 1);
                else
                    array[n] = temp.nextInt(length);
            }catch (Exception ex){
                System.out.println(ex); 
                return;
            }
        }
    }
}
