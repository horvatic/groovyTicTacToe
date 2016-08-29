package gameStatus
import gameValues.*

class CheckGame {
	def ticTacToeBoard
	CheckGame(ticTacToeBoard) {
		this.ticTacToeBoard = ticTacToeBoard
	}
	
	public CurrentGameStatus() {
		if(CheckForVictory(BoardValue.X))
			VictoryValue.X
		else if(CheckForVictory(BoardValue.O))
			VictoryValue.O
		else if(CheckForTie())
			VictoryValue.TIE
		else
			VictoryValue.ONGOING
	}
	
	private CheckForVictory(boradValue) {
		RowVictory(boradValue) || ColumnVictory(boradValue) || DiagonalVictory(boradValue)
	}
	
	private CheckForTie() {
		for(boardRowValues in this.ticTacToeBoard) {
			for(boardValue in boardRowValues)
				if(boardValue.is(BoardValue.NONE))
					return false
		}
		true
	}
	
	private DiagonalVictory(boradValue) {
		CheckForDiagonalVictory(0, 1, 2, boradValue) || CheckForDiagonalVictory(2, 1, 0, boradValue)
	}
	
	private CheckForDiagonalVictory(startIndex, middleIndex, endIndex, boradValue) {
		this.ticTacToeBoard[0][startIndex].is(boradValue) &&
		this.ticTacToeBoard[1][middleIndex].is(boradValue) &&
		this.ticTacToeBoard[2][endIndex].is(boradValue)
	}
	
	private ColumnVictory(boradValue) {
		CheckForColumnVictory(boradValue, 0) ||
		CheckForColumnVictory(boradValue, 1) ||
		CheckForColumnVictory(boradValue, 2)
	}
	
	private CheckForColumnVictory (boradValue, columnIndex) {
		this.ticTacToeBoard[0][columnIndex].is(boradValue) &&
		this.ticTacToeBoard[1][columnIndex].is(boradValue) &&
		this.ticTacToeBoard[2][columnIndex].is(boradValue)
	}
	
	private RowVictory(boradValue) {
		CheckForRowVictory(boradValue, 0) ||
		CheckForRowVictory(boradValue, 1) ||
		CheckForRowVictory(boradValue, 2)
	}
	
	private CheckForRowVictory(boradValue, rowIndex) {
		this.ticTacToeBoard[rowIndex][0].is(boradValue) &&
		this.ticTacToeBoard[rowIndex][1].is(boradValue) &&
		this.ticTacToeBoard[rowIndex][2].is(boradValue)
	}
	
}