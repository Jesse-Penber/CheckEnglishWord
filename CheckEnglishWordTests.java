package challenge;

import java.util.*;
import dictionary.isEnglishWord;

//SDET homework challenge - Method tests
//By Jesse Penber, 9/24/2018

public class CheckEnglishWordTests {

	static StringBuilder string = new StringBuilder("ab");
	static ArrayList<String> partitionedList = new ArrayList<String>();
	static ArrayList<String> wordsInDictionary = new ArrayList<String>();
	
	//tests reverse method and then resets value of class variable string
	public static void reverseStringTest() {
		string.reverse();
		if(string.toString().matches("ba")) {
			System.out.println("reverseStringTest pass");
			} else {
			System.out.println("reverseStringTest fail");
			}
		string.replace(0, 2, "ab");
		}	
		
	//tests partition method by verifying presence of "a", "b", and "ab" in partitionedList
	public static void partitionStringTest() {
		for(int i = 0; i <= string.length(); i++) {
			int subStringLength = string.length();
			while (subStringLength > i) {
				String smallerString = string.substring(i, subStringLength);
				partitionedList.add(smallerString);
				subStringLength--; 
				}
			}
		if(partitionedList.contains("a") && partitionedList.contains("b") && partitionedList.contains("ab")) {
			System.out.println("partitionStringTest pass");
		} else {
			System.out.println("partitionStringTest fail");
		}	
	}
	
	//tests add method by verifying presence of added value
	public static void addValidWordsTest() {
		ArrayList<String> partitionedListTest = new ArrayList<String>();
		String wordInListTest = "test";
		Boolean wordIsInDictionaryTest = wordInList.isEnglishWord();
		if(wordIsInDictionaryTest) {
			partitionedListTest.add(wordInListTest);
			}
		if(partitionedListTest.contains("test")) {
			System.out.println("addValidWordsTest pass");
			} else {
			System.out.println("addValidWordsTest fail");
			}
		}
	
	//tests unique method by adding duplicate values 
	public static void printUniqueWordsTest() {
		ArrayList<String> uniqueListTest = new ArrayList<String>();
		uniqueListTest.add("test");
		uniqueListTest.add("test");
		HashSet<String> setTest = new HashSet<String>(uniqueListTest);
		ArrayList<String> uniqueWords = new ArrayList<String>(setTest);
		if(uniqueWords.size() == 1) {
			System.out.println("printUniqueWordsTest pass");
			} else {
			System.out.println("printUniqueWordsTest fail");
			}
	}
	
	public static void main(String[] args) {
	    reverseStringTest();
	    partitionStringTest();
	    addValidWordsTest();
	    printUniqueWordsTest();
	}
}