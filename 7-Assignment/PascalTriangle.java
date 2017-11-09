/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments7;

class PascalTriangle{
    public static final int LINES = 10; 
    public static void main(String[] args) {
	int [][] pascalTriangle = new int [LINES][];
	for (int i = 0; i < LINES; i++){
            pascalTriangle[i] = new int[i+1];
            if (i ==0) {
		System.out.println((pascalTriangle[i][0] = 1) + " ");
		continue;
            }
            System.out.print((pascalTriangle[i][0] = 1) + " ");
            for (int j = 1; j < i; j++){
		System.out.print((pascalTriangle[i][j] =
		pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j]) + " ");
            }
	    System.out.println(pascalTriangle[i][i] = 1);
        }
    }
    
}
