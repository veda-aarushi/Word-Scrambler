package wordscrambler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter an input word:");
        String input = scanner.nextLine();  

        String shuffledWord = shuffle(input);
        System.out.println("Shuffled word: " + shuffledWord);
    }

    public static String shuffle(String input) {
        // Handle short inputs that cannot be shuffled meaningfully
        if (input.length() <= 2) {
            return input;
        }

        // Create a list for the middle characters
        ArrayList<Character> middleChars = new ArrayList<>();
        for (int i = 1; i < input.length() - 1; i++) {
            middleChars.add(input.charAt(i));
        }

        // Shuffle the middle characters
        Collections.shuffle(middleChars);

        // Build the shuffled word
        StringBuilder shuffledWord = new StringBuilder();
        shuffledWord.append(input.charAt(0)); // Append the first character
        for (char middleChar : middleChars) {
            shuffledWord.append(middleChar);
        }
        shuffledWord.append(input.charAt(input.length() - 1)); // Append the last character

        return shuffledWord.toString();
    }
}
