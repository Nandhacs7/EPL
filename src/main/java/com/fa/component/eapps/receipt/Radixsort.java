/*package com.fa.component.eapps.receipt;

import java.util.Scanner;

public class Radixsort {

	public static void main(String[] args) {
		System.out.println("Radix Sort Test \n");		
		System.out.println("Enter No of element to Be sort");
		Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter The"+n+"No of Elements into array To Sort");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Before Sorting The Elements Of Array");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		sort(a);
		
		System.out.println("After Sorting The Elements Of array");
		for(i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
		
	}

	private static void sort(int[] a) {
		int i,m=a[0],exp=1,n=a.length;
		
		int[] b=new int[10];
	for( i=1;i<n;i++){
		if(a[i]>m){
			m=a[i];
		}
	}
	while(m/exp>0){
		int[] bucket=new int[10];
		for(i=0;i<n;i++){
			bucket[(a[i]/exp) % 10]++;
		}
		for(i=1;i<10;i++){
			bucket[i]+=bucket[i-1];
		}
		
		for(i=n-1;i>=0;i--){
			b[--bucket[(a[i]/exp) % 10]]=a[i];
		}
		for(i=0;i<n;i++){
			a[i]=b[i];
		}
		exp*=10;
	}
  }
}
*/