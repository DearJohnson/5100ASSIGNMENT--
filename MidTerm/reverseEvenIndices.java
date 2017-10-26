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
