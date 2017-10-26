// Q3
// Given a non-empty integer array of size, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1
// Example:
// Input: [1,2,3]
// Output: 3

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
