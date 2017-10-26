// Solution of Q1
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

public class reverseEvenIndices {
    
    public int[] reverseEvenIndices(int[] nums) {
        if (nums.length == 0)
            return null;
        if (nums.length % 2 == 0) 
            nums = reverseEvenOperate(nums, 0, nums.length - 2);
        if (nums.length % 2 == 1) {
            nums = reverseEvenOperate(nums, 0, nums.length - 1);
        }        
        return nums;
    }

    public int[] reverseEvenOperate(int[] output, int low, int high) {
        if (low == high)
            return output;

        if (low % 2 == 0 && high % 2 == 0)
        {
            int temp = output[low];
            output[low] = output[high];
            output[high] = temp;
        }
        return reverseEvenOperate(output, low + 1, high - 1);
    }
    
}
