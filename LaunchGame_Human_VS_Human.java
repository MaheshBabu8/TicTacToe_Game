import java.util.Scanner;

public class LaunchGame_Human_VS_Human {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to TicTacToe Game ! \nPlease enter Player 1 Name");
		String firstPlayerName = scan.next();
		System.out.println("Please enter Player 1 Symbol");
		String mark1 = scan.next();
		char firstPlayerMark = mark1.charAt(0);
		
		System.out.println("Please enter Player 2 Name");
		String secondPlayerName = scan.next();
		System.out.println("Please enter Player 2 Symbol");
		String mark2 = scan.next();
		char secondPlayerMark = mark2.charAt(0);
		
		Board board = new Board();
		HumanPlayer p1 = new HumanPlayer(firstPlayerName,firstPlayerMark);
		HumanPlayer p2 = new HumanPlayer(secondPlayerName,secondPlayerMark);
		HumanPlayer currenPlayer = p1;
		
		while(true)
		{
			// check for the board is full and still  no one wins the game
			if(board.isBoardFull() && !board.checkForWin() )
			{
				System.out.println("Sorry no Player has won the Game, Please start the game again");
				p1.closeScanner();
				p2.closeScanner();
				break;
			}
		currenPlayer.makeMove();
		board.displayBoard();
		if(board.checkForWin())
		{
			System.out.println(currenPlayer.name+" has WON!");
			p1.closeScanner();
			p2.closeScanner();
			break;
		}
		else
		{
			if(currenPlayer == p1)
			{
				currenPlayer = p2;
			}
			else
			{
				currenPlayer = p1;
			}
		}
		}
		
	}

}
