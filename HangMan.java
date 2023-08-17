import java.io.*;
import java.util.*;
public class HangMan {
	 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] words = new String[183719];
		readWords(words);
		// hangman implementation goes below
		

	}
	
   // Store the words from dictionary.txt in an array
	public static void readWords(String[] words)throws IOException {
		File dict = new File("dictionary.txt");
		try(Scanner in = new Scanner(dict);){
			int i=0;
			while(in.hasNext()) {
				words[i++]=in.next();
			}
		}
	}

}
