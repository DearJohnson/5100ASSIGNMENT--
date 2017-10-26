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
