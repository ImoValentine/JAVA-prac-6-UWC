public class SolveMazeRecursively{

	int endRow = 7;		 	// row of goal position
	int endCol = 31;	 	// column of goal position
	int startRow = 5;	 	// row of starting position
	int startCol = 1;	 	// column of starting position


	
// The maze contains the following rows
// -------------------------------------

	int[] r1 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	int[] r2 = new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
	int[] r3 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
	int[] r4 = new int[] { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 };
	int[] r5 = new int[] { 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 };
	int[] r6 = new int[] { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 };
	int[] r7 = new int[] { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };
	int[] r8 = new int[] { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 };
	int[] r9 = new int[] { 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
	int[] r10 = new int[] { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 };
	int[] r11 = new int[] { 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 };
	int[] r12 = new int[] { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 };
	int[] r13 = new int[] { 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 };
	int[] r14 = new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 };
	int[] r15 = new int[] { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 };
	int[] r16 = new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 };
	int[] r17 = new int[] { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
	int[] r18 = new int[] { 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 };
	int[] r19 = new int[] { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1 };
	int[] r20 = new int[] { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
	int[] r21 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	int[][] maze = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21};
	
	
	public void run()
	{
	
		solveMaze();
	
	}
	
	boolean pathFound = false;
	
	public void buildMaze(int[][] Amaze)
	{
		maze = Amaze;
	}
	
	public void mark(int[][] Amaze, int row, int col)
	{
		Amaze[row][col] = 2;
	}
	
	public void unMark(int[][] Amaze, int row, int col)
	{
		Amaze[row][col] = -2;
	}
	
	public boolean isMarked(int[][] Amaze, int row, int col)
	{
		if(Amaze[row][col] == 2){
			return true;}
		else{
			return false;}
	}
	
	public boolean openRight(int[][] Amaze, int row, int col)
	{
		return (Amaze[row][col+1] == 0);
		
	}
	
	public boolean openLeft(int[][] Amaze, int row, int col)
	{
		return (Amaze[row][col-1] == 0);
	}
	
	public boolean openTop(int[][] Amaze, int row, int col)
	{
		return (Amaze[row-1][col] == 0);
	}
	
	public boolean openBottom(int[][] Amaze, int row, int col)
	{
		return (Amaze[row+1][col] == 0);
	}

	public int getStartingRow()
	{
		return startRow;
	}
	
	public int getStartingColumn()
	{
		return startCol;
	}
	
	public boolean isGoal(int[][] Amaze, int row, int col)
	{
		return ((row == endRow) && (col == endCol));
	}
	
	public String nextMove(String dir)
	{
		
		     if(dir == "UP"){
			dir = "DOWN";}
			
		else if(dir == "DOWN"){
			dir = "LEFT";}
			
		else if(dir == "LEFT"){
			dir = "RIGHT";}
			
		return dir;
	}
	
	public boolean markPath(int r,int c,int[][] Amaze)
	{	
		String dir = "DOWN";
		boolean temp = false; 
		boolean found = false;
		boolean done = true;
		if(isGoal(Amaze, r, c)){
			printMaze(maze);
			System.out.println("Maze solved!");}
		else if(isMarked(Amaze, r, c)){
			found = false;}
		else{
			mark(Amaze, r, c);
			found = false;
			dir = "UP";
			done = false;}
			
		while(done == false)
		{	
			if(dir == "UP")
			{
				if(openTop(Amaze,r,c)){
					found = markPath(r-1,c,Amaze);}
					
			}

			else if(dir == "DOWN")
			{
				if(openBottom(Amaze,r,c)){
					found = markPath(r+1,c,Amaze);}
			}

			else if(dir == "LEFT"){
				if(openLeft(Amaze,r,c)){
					found = markPath(r,c-1,Amaze);}

			}

			else if(dir == "RIGHT"){
				if(openRight(Amaze,r,c)){
					found = markPath(r,c+1,Amaze);}
			}
		

			if((found == true) || (dir == "RIGHT")){
				done = true;}
			if(done == false){
				dir = nextMove(dir);}
				
		}	//End of while
		if(found == false){
			unMark(Amaze, r, c);
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
		if(pathFound){
			System.out.println("No Path!!!!!!!!");}
		
			
	}		

	public String character(int r,int c) 		// appropriate characters provided for printing purposes
	{
		String temp = "";
		int arg = maze[r][c];
		if((r == startRow) && (c == startCol)){
			temp = "S";} 		// indicates starting position in maze
		else if((r == endRow) && (c == endCol)){
			temp = "G";}
		else if(arg == 0){ 		// indicates starting position in maze
			temp = " ";} 		// indicates unvisited cell
		else if(arg == 1){
			temp = "#";}		// indicates wall
		else if(arg == 2){		// indicates cell visited when solving maze
			temp = "p";}
		else if(arg == -2){ 		// indicates cell visited but unmarked when it was not leading to a solution
			temp = "-";}
			
		return temp;	
	}		
	
	public void printMaze(int[][] Amaze){		// print the entire maze
		String sLine = "";
		for(int r = 0; r<(Amaze.length); r++)
		{
			for(int c = 0; c<(Amaze[0].length); c++)
			{
				System.out.print(character(r, c));
			}
			System.out.println();
		}
		
		//print
		//print
	}		
	
// Start of main routine
// ----------------------
	public static void main(String[] args)
	{
		SolveMazeRecursively tstObj = new SolveMazeRecursively();
		tstObj.run();
		
	}
	
	
}
