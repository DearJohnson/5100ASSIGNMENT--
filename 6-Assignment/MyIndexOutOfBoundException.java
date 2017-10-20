// Q1
// Create your own MyIndexOutOfBoundException Class. It should contain these parameters
   // lowerBound - the lowest legal index value.
   // upperBound - the highest legal index value.
   // index - the current index value.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myindexoutofboundexception;

import java.util.Random;

/**
 *
 * @author asus
 */
public class MyIndexOutOfBoundException extends RuntimeException{
    
    int lowerBound, upperBound, index;
    MyIndexOutOfBoundException(){        
    }
    
    MyIndexOutOfBoundException(int indexnow, int lowest, int highest){
        this.index = indexnow;
        this.lowerBound = lowest;
        this.upperBound = highest;
    }
    
    public String toString(){
        return "Error Message: Index: " + this.index + ", but Lower bound: " + this.lowerBound + ", Upper bound: " + this.upperBound;
    }
    
    public static void main(String[] args) {
        // TODO code application logic  
        int size = 100;
        int[] nums = new int[size];
        Random random = new Random();
        System.out.println("Start with a random array with the length of " + size); 
        while (true){
            int i = random.nextInt(size + size/2);
            try{
                if (i >= size)
                    throw new MyIndexOutOfBoundException(i, 0, size - 1);
                else
                    nums[i] = random.nextInt(size);
            }catch (Exception ex){
                System.out.println(ex); 
                return;
            }
        }
    }
}
