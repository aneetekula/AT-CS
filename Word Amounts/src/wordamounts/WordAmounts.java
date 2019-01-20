package wordamounts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Aneesh R Tekulapally
 * @date 9/6/17
 *
 */
public class WordAmounts {
	//variables
	private static Scanner keyboard;
	private static Scanner temp;
	private static String filename;
	private static Scanner input; 
	private static String phrase;
	private static String word;
	
	public static void main(String[] args) {
		//intialzing Scanner object
		keyboard =  new Scanner(System.in);
		
		//entering filename
		System.out.println("Enter the filename:");
		filename = keyboard.next();
		
		//Arraylist of Word objects and Strings
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Word> wordnumbers = new ArrayList<Word>();
		
		Word tempword = new Word("temporary");
		wordnumbers.add(tempword);
		
		String a ="",b="",c="",d="",e="";
		
		//removes unwanted characters 
		try{
			File file = new File(filename);
			input = new Scanner(file);
			
			while(input.hasNextLine()){
				phrase = input.nextLine();
				phrase = phrase.toLowerCase();
				a=phrase.replaceAll(",", "");
				b=a.replace('.', ' ');
				c=b.replaceAll("\'", "");
				d=c.replaceAll("\'s", "");
				e=d.replaceAll("!", "");
					
					
				//System.out.println(e);
				temp = new Scanner(e);
				while(temp.hasNext()){
					word=temp.next();
					if(!(word.charAt(0)==45))
						words.add(word);
				}
					
			}
			
			String temp;
			boolean trueOrFalse=false;
			for(int x=0;x<words.size();x++){
				temp=words.get(x);
				for(int y=0;y<wordnumbers.size();y++){
					if(wordnumbers.get(y).getWord().equals(temp)){
						wordnumbers.get(y).count();
						trueOrFalse=false;
						break;
					}
					
					if(!trueOrFalse){
						wordnumbers.add(new Word(temp));
						trueOrFalse=true;
					}

				}
			}
			
			
			
			
			wordnumbers.remove(0);
			
			//sort by number of occurences
			wordnumbers=sort(wordnumbers);
			
			words.remove(words.size()-1);
			//print results
			if(wordnumbers.size()>=30){
			for(int z=0;z<30;z++){
				System.out.println("" + (z+1) + ") " + wordnumbers.get(z).getWord() + "\t" + (wordnumbers.get(z).getNumber()-1));
			}
			}
			else{
				for(int z=0;z<wordnumbers.size();z++){
					System.out.println("" + (z+1) + ") " + wordnumbers.get(z).getWord() + "\t" + (wordnumbers.get(z).getNumber()-1));
				}
			}
			
			
			
			System.out.println("\n\nCount:"+(words.size()));
			System.out.println("\n\nUnique Count:"+(count(wordnumbers)));
			
		} catch(FileNotFoundException f){
			System.out.println("File not Found");
			f.printStackTrace();
		}
		
		
		
		input.close();
		keyboard.close();
	}
	
	public static int count(ArrayList<Word> list){
		int a=-10;
		for(int x=0; x<list.size();x++){
			if(list.get(x).getNumber()>1)
				a++;
		}
		return a;
	}
	
	public static ArrayList<Word> sort(ArrayList<Word> list){
		
		ArrayList<Word> temp = new ArrayList<Word>();
		Word word = new Word("notGoingToExist",0);
		temp.add(word);
		for(int x=0; x<list.size();x++){
			for(int y=0;y<temp.size();y++){
				if(list.get(x).getNumber()>=temp.get(y).getNumber()){
					temp.add(y, new Word(list.get(x).getWord(),list.get(x).getNumber()));
					break;
				}
			}
		}
		temp.remove(temp.size()-1);
		
	
		return temp;
	}
	


}
