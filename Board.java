
public class Board {
	
	static char[][] board;
	
	public Board() {
		board = new char[3][3];
		initBoard(board);
		
	}
	
	//Initialize the board as soon as object created
	public void initBoard(char[][] arr)
	{
		char ch = ' ';
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = ch;
			}
		}
	}
	
	// Displays the board
	public void displayBoard()
	{
		System.out.println("-------------");
		for(int i=0;i<board.length;i++)
		{
			System.out.print("| ");
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.print("-------------");
			System.out.println();
		}
	}
	
	
	// Mark the Symbols 'X' or 'O'
	static void placeMark(int row,int col,char mark)
	{
		board[row][col] = mark;
		
	}
	
	
	boolean checkForWin()
	{
		if(checkRowWin())
		{
			return true;
		}
		else if(checkColWin())
		{
			return true;
		}
		else if(checkDiagWin())
		{
			return true;
		}
		
		return false;
	}
	// Check for the RowWins
	public boolean checkRowWin()
	{
		for(int i=0;i<=2;i++)
		{
			if(board[i][0]!=' '  &&
					board[i][0]==board[i][1] && board[i][1]==board[i][2])
			{
				return true;
			}
		}
		return false;
	}
	
	
	// Check for the ColumnWins
	public boolean checkColWin()
	{
		for(int j=0;j<=2;j++)
		{
			if(board[0][j]!=' '  &&
					board[0][j]==board[1][j] && board[1][j]==board[2][j])
			{
				return true;
			}
		}
		return false;
	}
	
	
	// Check for the DiagonalWins
	public boolean checkDiagWin()
	{
		for(int j=0;j<=2;j++)
		{
			if(board[0][0]!=' ' &&  
					board[0][0]==board[1][1] && board[1][1]==board[2][2]  
							|| board[0][2]!=' ' &&  board[0][2]==board[1][1] && board[1][1]==board[2][0] )
			{
				return true;
			}
		}
		return false;
	}
	
	boolean isBoardFull()
	{
		int count=0;
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j] != ' ') count++;
			}
		}
		
		if(count==9) return true;
		return false;
	}

}
