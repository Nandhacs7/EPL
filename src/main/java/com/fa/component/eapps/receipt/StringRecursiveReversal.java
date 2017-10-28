/*package com.fa.component.eapps.receipt;

public class StringRecursiveReversal {
	
	
	public String reverseString(String str) {
		String reverse = "";
		
		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1)
					+ reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}
	
//	public  String reverse(String str) {
//	    if ((null == str) || (str.length() <= 1)) {
//	        return str;
//	    }
//	    return reverse(str.substring(1)) + str.charAt(0);
//	}

	public static void main(String[] args) {		
	StringRecursiveReversal srr = new StringRecursiveReversal();  
	System.out.println("Result: " + srr.reverseString("Java2novice"));
		
	}

}
*/