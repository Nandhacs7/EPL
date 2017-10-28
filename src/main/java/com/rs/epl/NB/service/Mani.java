/*package com.rs.epl.NB.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mani {

	public static void main(String[] args) {
		
        String sts="<PolicyResponseVO><status>FAIL</status><oprId>T02</oprId><polNo>VPC0719017000100</polNo><endtNo>000</endtNo><prdCd>VPC</prdCd><errorMsg>E_FICUW_WS_100 | E_FICUW_AUX_021 | E_FICUW_WS_146</errorMsg><successMsg>null</successMsg></ErrorDetails></PolicyResponseVO>";
        
  int i=sts.indexOf("<errorMsg>");
  int j=sts.indexOf("</errorMsg>");
  String stx=sts.substring(i,j).replaceAll("<errorMsg>", "");
        if(!stx.equalsIgnoreCase("null")){
        	
            if(stx.contains(" | ")){                
                Map <String,String> mp=new HashMap<String,String>();
                mp.put("E_FICUW_AUX_021", "IUWP2_MR_COLOR(vehiclecolor)is invalid(Iaxmmccd:COL)");
                mp.put("E_FICUW_WS_100", "primeIUWP3_INCR_PREM(itempremium) predecimal is 15 and postdecimal is 6");
                mp.put("E_FICUW_WS_146", "IUWP2_MR_LOG_BOOK(logbook) length exceeds limit 30");
                          
                String [] erercodes=stx.split(" | ");
                List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
                list.removeAll(Collections.singleton("|"));
                erercodes=list.toArray(new String[0]);
                StringBuilder completeError = new StringBuilder();
                for(String error:erercodes){
                	
                	completeError.append(error+"========>"+mp.get(error)+"\r\n ");

                }
                System.out.println(completeError.toString());
                
          }else{
        	  
        	  
          }
        	
             
        }

        
        
	}

}
*/