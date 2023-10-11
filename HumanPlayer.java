import java.util.Scanner;

public class HumanPlayer {
	
	Scanner scan = new Scanner(System.in);
	String name;
	char mark;
	
	public HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	void makeMove()
	{
		int row;
		int col;
		do {
			System.out.println("Hey "+name+"("+mark+")"+   " Please enter valid row and Column");
			row = scan.nextInt();
			col = scan.nextInt();
		} while (!isValidMove(row,col));
		
		Board.placeMark(row, col, mark);
	}
	
	boolean isValidMove(int row, int col)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2)
		{
			if(Board.board[row][col] == ' ')
			{
				return true;
			}
		}
		
		return false;
	}
	
	void closeScanner()
	{
		scan.close();
	}

}
