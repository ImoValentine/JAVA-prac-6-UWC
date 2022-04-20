public class SolveMazeRecursively1 {
    
    //This program solves a two dimensional maze using recursion 
    //---------------------------------------------------------- 
    int endRow = 7; // row of goal position 
    int endCol = 31; // column of goal position 
     
    int startRow = 5; // row of starting position 
    int startCol = 1; // column of starting position 
    // The maze contains the following rows 
    // ------------------------------------- 
     
    int [] r1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }; 
     
    int [] r2 = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }; 
             
    int [] r3 = { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 }; 
     
    int [] r4 = { 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 }; 
     
    int [] r5 = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 }; 
             
    int [] r6 = { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 }; 
             
    int [] r7 = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 }; 
     
    int [] r8 = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 }; 
             
    int [] r9 = { 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 }; 
             
    int [] r10 = { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 }; 
             
    int [] r11 = { 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 }; 
             
    int [] r12 = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 }; 
             
    int [] r13 = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 }; 
             
    int [] r14 = { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 }; 
             
    int [] r15 = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 }; 
             
    int [] r16 = { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 }; 
             
    int [] r17 = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 }; 
             
    int [] r18 = { 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }; 
             
    int [] r19 = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1 }; 
             
    int [] r20 = { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }; 
             
    int [] r21 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }; 
             
    int [][] maze = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21};
 
     
    boolean pathFound = false;
     
             
    public void buildMaze(int [][] Amaze) 
    {     
        maze = Amaze;
    }             
                 
     
    public void  mark(int [][] Amaze, int row, int col)
    {
        Amaze[row][col] = 2; 
    }
     
    public void unMark(int [] []Amaze, int row, int col) 
    {         
        Amaze[row][col] = -2; 
    }     
         
    public boolean  isMarked(int [] [] Amaze, int row, int col) 
    {
        boolean ans;
        if (Amaze[row][col] == 2) 
        {     
            ans = true; 
        }
        else
        {
            ans = false;
        }
    return ans;     
    }
                                 
                                 
    public boolean openRight(int [] [] Amaze, int row, int col)
    {
        return Amaze[row][col+1] == 0; 
    }
         
         
    public boolean openLeft(int [] [] Amaze, int row, int col) 
    {         
        return Amaze[row][col-1] == 0;
    }     
         
         
    public boolean openTop(int [][] Amaze, int row, int col) 
    {     
        return Amaze[row-1][col] == 0; 
    }             
                 
     
    public boolean openBottom(int [][] Amaze, int row, int col)
    {
        return Amaze[row+1][col] == 0; 
    }         
             
    public int getStartingRow()
    {
        return startRow; 
    }         
             
             
    public int getStartingColumn() 
    {
        return startCol; 
    }         
             
    public boolean isGoal(int [][]Amaze, int row, int col)
    {
        return (row == endRow) && (col == endCol); 
    }         
             
    public String nextMove(String dir)
    {
        if (dir == "UP")
        {         
            return "DOWN";
        }
                 
        else if (dir == "DOWN")
        {     
            return "LEFT";
        }
        else if (dir == "LEFT")
        {     
            return "RIGHT";
        }
        return dir; //UNSURE
    }
     
    public boolean markPath(int r, int c, int [][]Amaze)
    {
        boolean found;
        boolean done;
        if (isGoal(Amaze, r, c))
        {
            found = true;
        }     
         
        else
            if (isMarked(Amaze, r, c))
            {     
                found = false; 
            }     
           
            else
            {   
                  mark(Amaze, r, c); 
                  found = false; 
                  String dir = "UP"; 
                  done = false; 
                  while (!done)
                  {   
                    if (dir == "UP")
                    {
			if (openTop(Amaze, r, c)) {
				found = markPath(r - 1, c, Amaze);     
                    // insert your code here 
                    }}
                    else if (dir == "DOWN")
                    { 
			if (openBottom(Amaze, r, c)) {
				found = markPath(r + 1, c, Amaze);     
                    // insert your code here 
                    } }  
                    else if (dir == "LEFT") 
                    {
			if (openLeft(Amaze, r, c)) {
				found = markPath(r, c - 1, Amaze);     
                    // inset your code here else: 
                    } }      
                    else
                    {
                        if (dir == "RIGHT")
                        { 
				if (openRight(Amaze, r, c)) {
				found = markPath(r, c + 1, Amaze);     
                        // insert your code here
                        }} 
                    }           
                    if (found || (dir == "RIGHT")) 
                    {
                        done = true; 
                    }           
                    if (!done) 
                    {   
                        dir = nextMove(dir); 
                    }                   
                }
                if (!found) 
                {   
                    unMark(Amaze, r, c);
                }
            }
                 
        return found;
    } 
                                                 
    public void solveMaze()
    {
       
        buildMaze(maze);
        printMaze(maze);
        int startR = getStartingRow();
        int startC = getStartingColumn();
        pathFound = markPath(startR, startC, maze);
        if (pathFound)
        {   
            printMaze(maze);
            System.out.println("Maze solved!");
        }
        else
        {
            System.out.println("No path found");
        }
    }

    public String character(int r,int c) // appropriate characters provided for printing purposes
    {   
        int arg = maze[r][c];
        String ans = "";
        if (r == startRow && c == startCol)
        {   
            ans = "S"; // indicates starting position in maze
        }
        else if (r == endRow && c == endCol)
        {   
            ans = "G";
        }        
        else if (arg == 0) // indicates starting position in maze
        {   
            ans = " "; // indicates unvisited cell
        }
        else if (arg == 1)
        {   
            ans = "#"; // indicates wall
        }
        else if (arg == 2) // indicates cell visited when solving maze
        {   
            ans = "p";
        }
        else
        {   
            if (arg == -2) // indicates cell visited but unmarked when it was not leading to a solution
            {
                ans = "-";
            }
        }
        return ans;

    }

    public void printMaze(int [][] Amaze) // print the entire maze
    {   
        for(int r = 0; r<Amaze.length; r++)
        {
            for(int c = 0; c<Amaze[0].length; c++)
            {   
                System.out.print(character(r,c));
            }
             System.out.println();
        }
        System.out.println();     
        System.out.println();
    }
    public static void main(String [] args)
    {
        SolveMazeRecursively tstObj = new SolveMazeRecursively();
        tstObj.solveMaze();
    }

}
