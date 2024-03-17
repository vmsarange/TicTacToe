class TicTacToe{

	public static void main(String[] args) {
		
		char g_Board [] [] = {

			{' ','|',' ','|',' '},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '}
			
		};

		print_Board(g_Board);
	}
	static void print_Board(char [][] g_Board){

		for (int i=0; i<g_Board.length; i++) {
			
			for (int j=0; j<g_Board[i].length; j++) {
				
				System.out.print(g_Board[i][j]+" ");
			}
			System.out.println();
		}
	}
}