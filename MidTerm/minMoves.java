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
public class minMoves {
    
    public int minMoves(int[] nums) {       
        int min = nums[0];
        int moves = 0;
        if (nums.length == 0) 
            return 0;         
        for (int n : nums) 
            min = Math.min(min, n);      
        for (int n : nums) 
            moves += n - min;
        return moves;
    }
           
}
