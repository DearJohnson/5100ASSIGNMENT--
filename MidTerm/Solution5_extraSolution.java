// Solution of Q5
// A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]
// A rat starts from source and has to reach destination, the rat can move only in two directions: forward and down
// In the maze matrix, 0 means the block is dead end and 1 means the block can be used in the path from source to destination, Your function should take the maze as an input and return an ArrayList of the resulting path

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
        // Validate isInpath() first
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
