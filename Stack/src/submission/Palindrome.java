package submission;

import java.util.Stack;

public class Palindrome {
	String yourWord = "";
	String reverseWord = "";
	Stack<Character> yourStack = new Stack<Character>();	
	public boolean isPalindrome(String s) {
		yourWord = s;
		return false;
	}
	public Stack stringToStack(){

		for (int i = 0; i < yourWord.length(); i++) {
            yourStack.push(yourWord.charAt(i));
		}
		return yourStack;}
	
	public String reverseString(){
		while (!yourStack.isEmpty()){
			reverseWord += yourStack.pop();
			}
		System.out.println(reverseWord);
		return reverseWord;
		}
	
	public boolean isItPalindrome(){
		boolean Verdict = false;
		if (yourWord.equals(reverseWord)){
			System.out.println("It is a palindrome.");
			Verdict = true;}
		else if (!yourWord.equals(reverseWord)){
			System.out.println("It is not a palindrome.");
			Verdict = false;}
		return Verdict;
		}
}
