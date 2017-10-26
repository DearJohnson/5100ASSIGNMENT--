// Solution of Q4
// Given n dice each with m faces, numbered from 1 to m, find the number of ways to get sum X
// X is the summation of values on each facewhen all the dice are thrown
// Your function should take, number of faces, number of dice and required sum as input and return a number of possible ways

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

public class countNumberOfPossibleWays {
    
    public static int countNumberOfPossibleWays(int m,int n,int x){
    	if(x<1)
    	    return 0;
    	if(n==1 && x<=m)
    	    return 1;
    	int sum = 0;
    	 
        for(int i=1; i<=m; i++)
            sum = sum + countNumberOfPossibleWays(m,n-1,x-i);
        return sum;
    }
    
}
