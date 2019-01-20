package soduku;
public class SudokuDifferent {

	private int[][] sud;
	private int[] nums;

	public SudokuDifferent(int rows)
	{
		sud = new int[rows][rows];
		nums = new int[rows];
		for (int i = 0; i < nums.length; i++){
			nums[i] = i + 1;
		}
	}
	
	public void fillArray(){
		for (int i = 0; i < sud.length; i++){
			fillRow(i, 0);
			for (int j = 0; j < sud[0].length; j++){
				if (contains(i, j)){
					for (int k = 0; k < sud[0].length; k++){
						sud[i][k] = 0;
					}
					fixRow(i, 0);
				}
			}
		}
	}
	
	public void fillRow(int r, int c){
		if (c >= sud[0].length){
			return;
		}
		for (int i = 0; i < nums.length; i++){
//			System.out.println(toString());
			sud[r][c] = nums[i];
			if (!contains(r, c)){
				fillRow(r, c + 1);
				break;
			}
		}
	}
	
	public void fixRow(int r, int c){
		if (c >= sud[0].length){
			return;
		}
		for (int i = nums.length - 1; i >= 0; i--){
//			System.out.println(toString());
			sud[r][c] = nums[i];
			if (!contains(r, c)){
				fixRow(r, c + 1);
				break;
			}
		}
		
	}
	
	private boolean contains(int r, int c){
		return (vcontains(r, c) || hcontains(r, c));
	}

	private boolean vcontains(int r, int c){
		for (int i = 0; i < sud.length; i++){
			if (sud[i][c] == sud[r][c] && i != r){
				return true;
			}
		}
		return false;
	}
	
	private boolean hcontains(int r, int c){
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
