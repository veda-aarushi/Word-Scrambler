package wordscrambler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shuffle {
	 public static void main(String[] args) {
			    Scanner myObj = new Scanner(System.in);  
			    System.out.println("Enter an input word:");

			    String input  = myObj.nextLine();  
	 String output = shuffle(input);
	 System.out.println(output);
	 }

	 public static String shuffle(String input){
	        int i = 0;
	        ArrayList<Character> chars = new ArrayList<Character>(input.length());
	        String output = "";
	        char[] characters = input.toCharArray();
	        char[] newWord = new char[input.length() + 1];
	        
	        
	        
	        newWord[0] = characters[0];
	        newWord[input.length()-1] = characters[input.length()-1];
	        
	        for (i=1; i < input.length()-1;i++ ) {
	            chars.add(characters[i]);
	        }
	        
	        System.out.println(chars);
	        for (i = 1; i <= input.length()-2; i++)
	        {
	            Collections.shuffle(chars);
	        }
	        Character[] middle = chars.toArray(new Character[chars.size()]);
	        for (i = 0; i < newWord.length - 2; i++)
	        {
	            newWord[i] = middle[i];
	        }
	        
	    System.out.println(newWord);
	        StringBuffer r= new StringBuffer(output);
	        for (i = 0; i < newWord.length - 1; i++)
	        {
	        r.append(newWord[i]);
	        }
	        
	        return output;
	    }
}


