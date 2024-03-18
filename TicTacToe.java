import java.util.*;
class TicTacToe{
   
    static HashSet<Integer> userSet = new HashSet<Integer>();
    static HashSet<Integer> cpuSet = new HashSet<Integer>();

	public static void main(String[] args) {
		
		char g_Board [] [] = {

			{' ','|',' ','|',' '},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '}
			
		};
      

	}
	static void print_Board(char [][] g_Board){

		for (int i=0; i<g_Board.length; i++) {
			
			for (int j=0; j<g_Board[i].length; j++) {
				
				System.out.print(g_Board[i][j]+" ");
			}
			System.out.println();
		}
	}

	static void place_Holder(char [][] g_Board,int position,String user){

		char symbol = ' ';

		if (user.equals("You") {
			
			symbol = 'X';

			userSet.add(position);
		}
		else if(user.equals("Cpu")){

			symbol = 'O';

			cpuSet.add(position);
		}

		switch(position){

		case 1 : {

              g_Board[0][0] = symbol;
              break;
		  }
		 case 2 : {

              g_Board[0][2] = symbol;
              break;
		  }
		  case 3 : {

              g_Board[0][4] = symbol;
              break;
		  }
		  case 4 : {

              g_Board[2][0] = symbol;
              break;
		  }
		  case 5 : {

              g_Board[2][2] = symbol;
              break;
		  }
		  case 6 : {

              g_Board[2][4] = symbol;
              break;
		  }
		  case 7 : {

              g_Board[4][0] = symbol;
              break;
		  } 
		  case 8 : {

              g_Board[4][2] = symbol;
              break;
		  }
		case 9 : {

              g_Board[4][4] = symbol;
              break;
		  }
		default : 

			System.out.println("Invalid input!");
		}
		print_Board();
	}
}