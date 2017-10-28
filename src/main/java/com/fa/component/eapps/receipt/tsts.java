/*package com.fa.component.eapps.receipt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class tsts {

	public static void main(String[] args) {
		
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");		
		//"yyyy/MM/dd HH:mm:ss"
		
		//"hh:mm a"
		
//	       Date date = new Date();
//	       String ram=sdf.format(date).toString();
//	       String sam=ram.substring(0,2);
//	       
//	       //ram.indexOf(" ").trim()
//	       
//	       String sts=sam.substring(0,2);
//	       if(Integer.valueOf(sts)>=23  || Integer.valueOf(sts)<=03){
//	    	   System.out.println("yes");	    	   
//	       }
//	       else {
//	    	   System.out.println("no");
//	       }
//	       
//	      System.out.println(date.);
		
		
		
		Calendar cal = Calendar.getInstance(); //Create Calendar-Object
		cal.setTime(new Date());               //Set the Calendar to now
		int hour = cal.get(Calendar.HOUR_OF_DAY); //Get the hour from the calendar
		if(hour <= 23 && hour >= 1)              // Check if hour is between 8 am and 11pm
		{
		    System.out.println(hour);
		}else{
			System.out.println("not In Hours");
		}
		
		
		
		
		
		
		
		
		

	}

}
*/