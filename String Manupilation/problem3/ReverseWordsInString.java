package DSA.string;

import java.util.Stack;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		String s1 = reverseWordsInString(s);
		System.out.println(s1);
	}

	private static String reverseWordsInString(String s) {
		Stack<String> stack = new Stack<>(); // create the stack to reverse the string
		
		StringBuilder word = new StringBuilder(); //for each word creation base on the . 
		
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) !='.') {
				word.append(s.charAt(i)); // creating the word
			}
			else if(word.length()>0) {
				System.out.println(word);
				stack.push(word.toString()); // push the word to stack 
				word.setLength(0);
			}
		}
		
		if(word.length()>0) { // last word push 
			stack.push(word.toString());
		}
		StringBuilder result = new StringBuilder();
		
		while(!stack.isEmpty()){
			result.append(stack.pop());  // pop the word  and recreate the string
			if(!stack.isEmpty()) { 
				result.append("."); // add the  . after each word append in the stringbuilder
			}
		}
		return result.toString();
	}

}
