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
	
	
}
