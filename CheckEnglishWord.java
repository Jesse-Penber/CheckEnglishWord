package challenge;

import java.util.*;
import dictionary.isEnglishWord;

// SDET homework challenge - Find all English words in a string. 
// By Jesse Penber, 9/24/2018

// Assumptions: 
// - All characters in the provided string are in the same case (LOWER or UPPER).
// - All characters in the Dictionary class database are in the same case as previous assumption.
// - The provided string contains only valid English alphabet characters.
// - One-letter words such as "I" are valid words.
// - The imported utility class dictionary.isEnglishWord is the source of absolute truth for word validity.

// Testing note: Since the isEnglishWord() utility is mock, this suite may be tested in a real environment by declaring the Boolean wordIsInDictionary true, replacing the isEnglishWord() condition.

public class CheckEnglishWord {
	
	static StringBuilder string = new StringBuilder("WORKING");
	static ArrayList<String> partitionedList = new ArrayList<String>();
	static ArrayList<String> wordsInDictionary = new ArrayList<String>();
	
	public static void reverseString() {
		string.reverse();
	}
	
	public static void partitionString() {
		for(int i = 0; i <= string.length(); i++) {
		int subStringLength = string.length();
		while (subStringLength > i) {
			String smallerString = string.substring(i, subStringLength);
			partitionedList.add(smallerString);
			subStringLength--; 
			}
		}
	}
	
	public static void addValidWords() {
		for (String wordInList : partitionedList) {
			Boolean wordIsInDictionary = wordInList.isEnglishWord();
			if(wordIsInDictionary) {
				wordsInDictionary.add(wordInList);
			}
		}
	}

	public static void printUniqueWords() {
		HashSet<String> set = new HashSet<String>(wordsInDictionary);
		ArrayList<String> uniqueWords = new ArrayList<String>(set);
		System.out.println(uniqueWords);
	}
	
	public static void main(String[] args){
		partitionString();
		reverseString();
		partitionString();
		addValidWords();
		printUniqueWords();
	}
}