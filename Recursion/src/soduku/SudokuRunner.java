package soduku;
import java.util.Scanner;

public class SudokuRunner {

	public static void main(String[] args){
		
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Enter the size of the Sudoku grid: ");
//		int size = keyboard.nextInt();
//		if (size > 8){
//			size = 8; 
//			System.out.println("Value is too big... defaulting to max size...\n");
//		}
//		Sudoku mySud = new Sudoku(size);
//		mySud.fillSudoku();
//		System.out.print(mySud.toString());
		
		//7, 9, 11 are broke
		//1, 2, 3, 4, 5, 6, 8, 10, 12 work
		SudokuDifferent sud = new SudokuDifferent(12);
		sud.fillArray();
		System.out.println(sud.toString());
		
	}
}
