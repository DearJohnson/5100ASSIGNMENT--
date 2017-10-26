//Q1
// Write a method named reverseEvenIndices that takes an integer array asinput and outputs an array such that all the values with odd indices remain in the same position
// However, elements with even indices should be output in reverse order
// That is, the first element with even index should be swapped with the last element with even index, the second een-indexed element with the second-to-last even-indexed element, and so on

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermb;

/**
 *
 * @author Administrator
 */

public class arrangeCoins {
    public int arrangeCoins(int n){
        int stair =1;
        while(n > stair){
            n = n - stair;
            stair++;         
        }
        return stair - n;
    }    
}
