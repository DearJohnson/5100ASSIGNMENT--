/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments7;

public class Partition {
    public static void findPartition(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        if ((totalSum & 1) == 1) {
            System.out.println("Subset not available");
            return;
        }
        int targetSum = totalSum >> 1;
        boolean[][] sumExists = new boolean[targetSum + 1][arr.length];
        for (int i = 0; i < arr.length; i++) {
            sumExists[0][i] = true;
        }
        for (int sum = 1; sum <= targetSum; sum++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= sum && i - 1 >= 0)
                    sumExists[sum][i] = sumExists[sum][i - 1] || sumExists[sum - arr[i]][i - 1];
            }
        }
        System.out.println(sumExists[targetSum][arr.length - 1]);
    }
    
    public static void main(String[] args) {
        findPartition(new int[] {1, 5, 11, 5});
        findPartition(new int[] {1, 5, 3});
    }
    
}
