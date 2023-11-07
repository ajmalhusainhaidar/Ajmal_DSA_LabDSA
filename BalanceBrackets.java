package com.greatlearning.java;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
	public static boolean isBalancedBrackets(String input) {
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<input.length();i++) {
			char c=input.charAt(i);
			if(c== '(' || c=='{'|| c=='[') {
				stack.push(c);
			}
			else if(c==')' && !stack.isEmpty() && stack.peek()== '(') {
				stack.pop();
			}
			else if(c== '}' && stack.peek()=='{' && !stack.isEmpty()) {
				stack.pop();
			}
			else if(c== ']' && stack.peek()=='[' && !stack.isEmpty()) {
				stack.pop();

			}
			else {
				return false;	
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string of brackets:");
		String input =sc.next()
				;
		boolean output=isBalancedBrackets(input);
		if(output) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
	}
}