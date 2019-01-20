package soduku;
import java.util.*;
import java.util.Arrays;
import static java.lang.System.*;

public class Sudoku
{
	private int[] nums;
	private int[][] sud;

	public Sudoku(int rows)
	{
		sud = new int[rows][rows];
		nums = new int[rows];
		for (int i = 0; i < nums.length; i++){
			nums[i] = i + 1;
		}
	}
	
	public void fillSudoku(){
		fillSudoku(0, 0, 0, 1);
	}

	private void fillSudoku(int r, int c, int counter, int forwards)
	{
		if (c >= sud[0].length){
			c = 0;
			r++;
			if (r >= sud.length){
				return;
			}
			fillSudoku(r, c, 0, forwards);
		}

		sud[r][c] = nums[counter];
		
		if (contains(r, c)){
			counter += forwards;
			if (counter >= nums.length){
				counter = nums.length - 1;
				c --;
				forwards = -1;
			}
			else if (counter < 0){
				counter = 0;
				c --;
				forwards = 1;
			}
			fillSudoku(r, c, counter, forwards);
		} else{
			c++;
			counter = 0;
			fillSudoku(r, c, counter, forwards);
		}

	}
	
	public boolean contains(int r, int c){
		return (vcontains(r, c) || hcontains(r, c));
	}

	public boolean vcontains(int r, int c){
		for (int i = 0; i < sud.length; i++){
			if (sud[i][c] == sud[r][c] && i != r){
				return true;
			}
		}
		return false;
	}
	
	public boolean hcontains(int r, int c){
		for (int i = 0; i < sud[0].length; i++){
			if (sud[r][i] == sud[r][c] && i != c){
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		String array = "";
		for (int i = 0; i < sud.length; i++){
			for (int j = 0; j < sud[0].length; j++){
				array += sud[i][j] + "  ";
			}
			array += "\n";
		}
		return array;
	}
}