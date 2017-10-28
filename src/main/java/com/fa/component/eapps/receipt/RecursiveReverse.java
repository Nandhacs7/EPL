/*package com.fa.component.eapps.receipt;

public class RecursiveReverse {
	
	public  String Reverse(String rev){
		String reverse = "";
		if(rev.length() == 1){
			return rev;
		}else{
			reverse +=rev.charAt(rev.length()-1) + Reverse(rev.substring(0, rev.length()-1));
			return reverse;
		}
		
	}

	public static void main(String[] args) {
		
		RecursiveReverse rs=new RecursiveReverse();
		System.out.println("Result: " + rs.Reverse("Java2novice"));
	}

}
*/