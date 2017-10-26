/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermb;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */

class Cell{
    int x,y;
    Cell(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "["+this.x +", "+this.y+ "]";
    }
}

public class extraSolution {
    
    public boolean findPathWithObstacles(int[][]maze,ArrayList<Cell> findPath){
        if((maze == null) || (maze.length == 0) || (maze[0].length == 0))
            return false;
        int row = maze.length;
        int col = maze[0].length;
             
        if((maze[0][0] == 0)||(maze[row - 1][col - 1] == 0)) //We need a successful(value = 1) start and finish grid
            return false;
        
        return findPathSuccessfully(maze, findPath, 0, 0);
    }
    
    // Assume the start point is (x, y)
    // since the rat can only move either downward or right, one grid at a time
    // then the problem can be solved by first solving the following subproblems
    private boolean findPathSuccessfully(int[][] maze, ArrayList<Cell> findPath, int x, int y){
        
        if(maze[x][y] == 0)
            return false;
        
        if(!isInPath(maze, x, y))
            return false;
        
        findPath.add(new Cell(x,y)); //add success point to ArrayList
        
        if(x == maze.length -1 && y == maze[0].length -1)
            return true;
        
        // subproblem 1: find the number of all unique paths from (x, y+1) to destination
        if(findPathSuccessfully(maze, findPath, x, y+1))
            return true;
 
        // subproblem 2: find the number of all unique paths from (x+1, y) to destination
        if(findPathSuccessfully(maze, findPath, x+1, y))
            return true;      
        
        findPath.remove(findPath.size() - 1);
        return false;
        
    }
    
    private boolean isInPath(int[][] maze, int x, int y){ 
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length;
    }
    
    public static void main(String[] args){
        extraSolution esol = new extraSolution();
        ArrayList<Cell> findPath = new ArrayList<Cell>();
        int[][] maze = {{1,0,0,0}, {1,1,0,0}, {0,1,0,0}, {0,1,1,1}};
        
        esol.findPathWithObstacles(maze, findPath);
        
        for(Cell c: findPath)
            c.toString();
    }
    
}
