/*package com.fa.component.eapps.receipt;

public class StackRev {
	
	int maxsize;
	
	private char[] arr;
	
	private int top=0;
	
	private StackRev(int n){
		this.maxsize=n;
		arr=new char[n];
		top=0;		
	}
	
	private void push(char ch){
		arr[top]=ch;
		top++;				
	}
	
	private char pop(){
		return arr[--top];		
	}
	
	private boolean isempty(){
		if(top == 0){
			return false;
		}else{
			return true;
		}
	}

	public static void main(String[] args) {
		String str="input";		
		
		int n=str.length();
		
        StackRev rev=new StackRev(n);
		
        for(int i=0;i<n;i++){
        	char c=str.charAt(i);
        	rev.push(c);
        }
        while(rev.isempty()){
        	char c=rev.pop();
        	System.out.println(c);
        }
		
	}

}
*/