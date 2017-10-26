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
