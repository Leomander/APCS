package projects.two;

public class Board {
	
	private char[][] board;
	
	public static void main(String[] args) {
		Board b = new Board(3);
		System.out.println(b.toString());
	}
	
	public Board(int size) {
		board = new char[size][size];
	}
	
	public void addPoint(int row, int column, char symbol) {
		board[row][column] = symbol;
	}
	
	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public String toString() {
		
		String val = "+";
		for (int i = 0; i < board.length; i++) val += "-+";
		val += "\n";
		for (int r = 0; r < board.length; r++) {
			val += "|";
			for (int c = 0; c < board[r].length; c++) {
				val += board[r][c]+"|";
			}
			val += "\n+";
			for (int i = 0; i < board.length; i++) val += "-+";
			val += "\n";
		}
		
		return val;
	}
	
	public char checkWin(char[][] board) {
		for (int i = 0; i < board.length; i++) {//checks each row for a win
			char first = board[i][0];
			boolean win = true;
			if (first != ' ') {
				for (int j = 0; j < board[i].length; j++) {
					if (board[i][j] != first) {
						win = false;
						break;
					}
				}
				if (win) {
					return first;
				}
			}
		}
		
		for (int i = 0; i < board[0].length; i++) { //checks each column for a win
			char first = board[0][i];
			boolean win = true;
			if (first != ' ') {
				for (int j = 0; j < board[0].length; j++) {
					if (board[j][i] != first) {
						win = false;
						break;
					}
				}
				if (win) {
					return first;
				}
			}
		}
		char first = board[board.length][0];
		boolean win = true;
		if (first != ' ') {
			for (int i = 0; i < board.length; i++) {//check diagonal bottom left to top right
				if (board[board.length-i-1][i]!=first) {
					win = false;
					break;
				}
			}
		}
		if (win) {
			return first;
		}
		
		first = board[0][0];
		win = true;
		if (first != ' ') {
			for (int i = 0; i < board.length; i++) {//check diagonal top left to bottom right
				if (board[i][i] != first) {
					win = false;
					break;
				}
			}
		}
		if (win) {
			return first;
		}
		return 0;
	}

}
