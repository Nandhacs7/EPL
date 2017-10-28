/*package com.fa.component.eapps.receipt;

public class StackReverse {
	
	private int maxSize;

	private char[] stackArray;

	private int top;

	public StackReverse(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = 0;
	}

	public void push(char j) {
		stackArray[top] = j;
		top++;
	}

	public char pop() {

	return stackArray[--top];	
		
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == 0);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}


	public static void main(String[] args) {
		
		String input = "input";
		int stackSize = input.length();

		StackReverse theStack = new StackReverse(stackSize);

		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			theStack.push(ch);
		}

		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			System.out.println(ch);
		}

		

	}

}
*/