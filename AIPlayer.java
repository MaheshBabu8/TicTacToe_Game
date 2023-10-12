import java.util.Random;

public class AIPlayer extends Player{
	String name = "AI";
	char mark = 'O';

	@Override
	void makeMove() {
		Random random = new Random();
		System.out.println("It's "+name+" turn");
		int row = -1 ;
		int col = -1;
		do {
			row = random.nextInt(3);
			col = random.nextInt(3);	
		} while (!isValidMove(row, col));
		Board.placeMark(row, col, mark);
	}

}
