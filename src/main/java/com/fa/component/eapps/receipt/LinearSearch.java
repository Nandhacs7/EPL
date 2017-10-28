/*package com.fa.component.eapps.receipt;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		   int m=-1;
		
		System.out.println("Enter No of Elements in Array");
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr =new int[n];
		
	System.out.println("Eneter Elements Into Array");	
		for(int i=0;i<arr.length;i++){		
			arr[i]=sc.nextInt();
		}		
		System.out.println("Enter The Element To Search in Array");
         int k=sc.nextInt();
      
         boolean flag = false;
		
         for(int h=0;h<arr.length;h++){       	 
        	 if(k == arr[h]){
        		 m=h;
        		 flag=true;
        		 break;
        	 }else{		 
        		 flag=false;
        	 }
         }
         
         if(flag && m>-1){
        	 System.out.println("The Given Number is Found In index  "+m);
         }else{
        	 System.out.println("The Given Number is not Found");
         }
		
	}

}
*/