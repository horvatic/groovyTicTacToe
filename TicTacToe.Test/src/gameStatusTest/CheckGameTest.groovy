package gameStatusTest
import org.junit.Test
import gameValues.*
import gameStatus.CheckGame

public class CheckGameTest {

	@Test
	void New_Board_No_Winner() {
		def ticTacToeBoard = [[ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ],
						     [ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ],
						     [ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.ONGOING 
	}
	
	@Test
	void Tie_Game() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.O, BoardValue.X ],
							 [ BoardValue.O, BoardValue.X, BoardValue.O ],
							 [ BoardValue.O, BoardValue.X, BoardValue.O ]]

		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.TIE
	}
	
	@Test
	void Row_One_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.O, BoardValue.O ],
							 [ BoardValue.X, BoardValue.NONE, BoardValue.X ],
							 [ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O 
	}
	
	@Test
	void Row_Two_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.NONE, BoardValue.X ],
			[ BoardValue.O, BoardValue.O, BoardValue.O ],
			[ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
	
	@Test
	void Row_Three_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.NONE, BoardValue.X ],
							 [ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ],
							 [ BoardValue.O, BoardValue.O, BoardValue.O ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
	
	@Test
	void Row_One_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.X, BoardValue.X ],
							 [ BoardValue.O, BoardValue.NONE, BoardValue.O ],
							 [ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Row_Two_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.NONE, BoardValue.O ],
			[ BoardValue.X, BoardValue.X, BoardValue.X ],
			[ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Row_Three_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.NONE, BoardValue.O ],
							 [ BoardValue.NONE, BoardValue.NONE, BoardValue.NONE ],
							 [ BoardValue.X, BoardValue.X, BoardValue.X ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}

	@Test
	void Col_One_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.X, BoardValue.NONE ],
							 [ BoardValue.O, BoardValue.NONE, BoardValue.X ],
							 [ BoardValue.O, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
	
	@Test
	void Col_Two_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.O, BoardValue.NONE ],
							 [ BoardValue.NONE, BoardValue.O, BoardValue.X ],
							 [ BoardValue.NONE, BoardValue.O, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
	
	@Test
	void Col_Three_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.X, BoardValue.O ],
							 [ BoardValue.NONE, BoardValue.X, BoardValue.O ],
							 [ BoardValue.NONE, BoardValue.NONE, BoardValue.O ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
	
	@Test
	void Col_One_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.O, BoardValue.NONE ],
							 [ BoardValue.X, BoardValue.NONE, BoardValue.O ],
							 [ BoardValue.X, BoardValue.NONE, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Col_Two_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.X, BoardValue.NONE ],
							 [ BoardValue.NONE, BoardValue.X, BoardValue.O ],
							 [ BoardValue.NONE, BoardValue.X, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Col_Three_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.O, BoardValue.X ],
							 [ BoardValue.NONE, BoardValue.O, BoardValue.X ],
							 [ BoardValue.NONE, BoardValue.NONE, BoardValue.X ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Diagonal_Left_To_Right_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.X, BoardValue.O, BoardValue.NONE ],
							 [ BoardValue.NONE, BoardValue.X, BoardValue.NONE ],
							 [ BoardValue.NONE, BoardValue.O, BoardValue.X ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Diagonal_Right_To_Left_X_Winner() {
		def ticTacToeBoard = [[ BoardValue.NONE, BoardValue.O, BoardValue.X ],
							 [ BoardValue.NONE, BoardValue.X, BoardValue.NONE ],
							 [ BoardValue.X, BoardValue.O, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.X
	}
	
	@Test
	void Diagonal_Left_To_Right_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.O, BoardValue.X, BoardValue.NONE ],
							 [ BoardValue.NONE, BoardValue.O, BoardValue.NONE ],
							 [ BoardValue.NONE, BoardValue.X, BoardValue.O ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
	
	@Test
	void Diagonal_Right_To_Left_O_Winner() {
		def ticTacToeBoard = [[ BoardValue.NONE, BoardValue.X, BoardValue.O ],
							 [ BoardValue.NONE, BoardValue.O, BoardValue.NONE ],
							 [ BoardValue.O, BoardValue.X, BoardValue.NONE ]]
		
		def boardChecker = new CheckGame(ticTacToeBoard)
		assert boardChecker.CurrentGameStatus() == VictoryValue.O
	}
}