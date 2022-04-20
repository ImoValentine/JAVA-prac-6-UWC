import java.util.*;

public class MazeGame {
    int endRow = 7;
    int endCol = 31;
    int startRow = 5;
    int startCol = 1;
    
    int[] r1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] r2 = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
    int[] r3 = { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
    int[] r4 = { 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 };
    int[] r5 = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 };
    int[] r6 = { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 };
    int[] r7 = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };
    int[] r8 = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 };
    int[] r9 = { 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
    int[] r10 ={ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 };
    int[] r11 ={ 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 };
    int[] r12 ={ 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 };
    int[] r13 ={ 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 };
    int[] r14 ={ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 };
    int[] r15 ={ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 };
    int[] r16 ={ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 };
    int[] r17 ={ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
    int[] r18 ={ 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 };
    int[] r19 ={ 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1 };
    int[] r20 ={ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
    int[] r21 ={ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    int[][]maze = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21};
    
    boolean pathFound = false;
    public void buildMaze(int[][] maze) {
        int[][] Amaze = maze;
    }
    

    public void mark(int [][] Amaze,int row,int col){
        Amaze[row][col]=2;   
    }
    public void unMark(int[][] Amaze, int row, int col){
        Amaze[row][col]= -2; 
    }
    public boolean isMarked(int[][] Amaze, int row, int col){
        if (Amaze[row][col]==2){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean openRight(int[][] Amaze,int row,int col){
        return Amaze[row][col++] == 0;
    }
    public boolean openLeft(int[][] Amaze,int row,int col){
        return Amaze[row][col--] == 0;
    }
    public boolean openTop(int[][] Amaze,int row,int col){
        return Amaze[row--][col] == 0;
    }
    public boolean openBottom(int[][] Amaze,int row,int col){
        return Amaze[row++][col] == 0;
    }
    
    
    public int getStartingRow(){
        return startRow;
    }
    public int getStartingColumn(){
        return startCol;
    }
    public boolean isGoal(int[][] Amaze, int row, int col){
        return(row == endRow) & (col == endCol);
    }
    
    
    public String nextMove(String dir){
        if(dir=="UP"){
            return "DOWN";
        }
        else if (dir=="DOWN"){
            return "LEFT";
        }
        else{
            if(dir == "LEFT"){
                return "RIGHT";
            }
        }  
        return null;
    }
    public void markPath(int r,int c,int[][] Amaze){
        if (isGoal(Amaze,r,c )){
            boolean found = true;
        }
        else{
            if(isMarked(Amaze,r,c)){
                boolean found = false;
            }
            else{
                mark(Amaze,r,c);
                boolean found = false;
                String dir = "UP";
                boolean done = false;
                while (!done){
                    if(dir == "UP"){
                        
                    }
                    else if (dir == "DOWN"){
                        
                    }
                    else if (dir == "LEFT"){
                        
                    }
                    else{
                        if(dir == "RIGHT"){
                            
                        }
                    }
                    if((found)||(dir == "RIGHT")){
                        done = true;
                    }
                    if(!done){
                        dir = nextMove(dir);
                    }
                
                }
                if(!found){
                    unMark(Amaze,r,c);
                }
            }
        }
    }
    public void solveMaze(){
       //global pathFound, maze;
       buildMaze(maze);
       printMaze(maze);
       int startR = getStartingRow();
       int startC = getStartingColumn();
       pathFound = markPath(startR,startC,maze);
       if (pathFound){
           printMaze(maze);
           System.out.println("Maze Solved");
       }
       else{
           System.out.println("No path found");
       }
    }
    public String character(int r, int c){
        int arg = maze[r][c];
        if (r == startRow & c == startCol){
            return "S";
        }
        else if(r == endRow & c == endCol){
            return "G";
        }
        else if(arg == 0){
            return " ";
        }
        else if(arg == 1){
            return "#";
        }
        else if(arg == 2){
            return "p";
        }
        else{
            if(arg== -2){
                return "-";
            }
        }
        return null;
    }
    
    public void printMaze(int[][] maze) {
        for (int r=0, r > Amaze.length){
            for (c<Amaze.length){
                System.out.println(character(int r,int c));
            }            
        }
    }
    public static void main(String args[]){
        solveMaze.obj = new obj();
    }

    

   
}


