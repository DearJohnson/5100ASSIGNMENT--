/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralorder;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author asus
 */
public class SpiralOrder {
    
    public List<Integer> matrix(int[][] matrix){
    List<Integer> a;
    a = new LinkedList<>();
    int x,y,z,r,c,i;
    x=matrix.length;
    y=matrix[0].length;
    z=Math.min(x, y);
    int spiralNumber = (z+ 1) / 2;
    for(i=0;i<spiralNumber;i++){
    r=x-i-1;
    c=y-i-1;
    if(i==r){
    for(int j = i; j <= r; j++){
                    a.add(matrix[i][j]);
                }
        
    }
    else if(i==c){
    for(int j = i; j <= c; j++){
                    a.add(matrix[i][j]);
                }
    }
    else{
                for(int j = i; j < c; j++){
                    a.add(matrix[i][j]);
                }
                for(int j = i; j < r; j++){
                    a.add(matrix[j][c]);
                }
                for(int j = c; j > i; j--){
                    a.add(matrix[r][j]);
                }
                for(int j = r; j > i; j--){
                    a.add(matrix[j][i]);
                }
    }
    }
    return a;
    
     /**
     * @param args the command line arguments
     */
   
   
}
}
