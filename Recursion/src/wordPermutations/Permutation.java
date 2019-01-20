package wordPermutations;

import java.util.*;
import static java.lang.System.*;

public class Permutation {
	//variables
	private String word;
	private String list;
	
	//constructor
	public Permutation(String word) {
		this.word = word;
		list = "";
	}
	
	/**
	 * Displays the word and calls method 
	 */
   public void permutation() { 
   	System.out.println("\nPERMUTATION OF WORD :: " + word);
   	permutation(word, "");
   }
   
   /**
    * Determines if word is the correct lenght and if combination already exists in the string
    * @param word
    * @param sent
    */
	private void permutation(String word, String sent) {
		if(word.length() == sent.length()){
			System.out.println(sent);
		}
		else {
			for(int x=0;x<word.length();x++){
				if(!sent.contains("" + word.charAt(x))) {
					permutation(word, sent +""+word.charAt(x));
				}
			}
		}
	}

}