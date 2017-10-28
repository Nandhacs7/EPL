package com.firstapex.rs.epl.cn.common;



	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
 public class TestToRameshMap {

		public static void main(String[] args) {
			
		String str="Apple=5,Apple=10,Orange=10,Mango=10,Orange=10,Mango=5";
			
			Map<String,Integer> map=new HashMap<String,Integer>();
				String[] values=str.split(",");
				
			for(String s:values){
				
				String[] ss=s.split("=");
				String i=ss[1].toString();
				
				if(!map.containsKey(ss[0])){
					map.put(ss[0],Integer.parseInt(i));
				}else{
//					if(map.containsKey(ss[0])){
//						System.out.println(map.get(ss[0]));
//					}
					map.put(ss[0],Integer.parseInt(i)+map.get(ss[0]));
				}
			}
			
			for(Map.Entry e:map.entrySet()){
				
				System.out.println(e.getKey()+"::"+e.getValue());
				
			}
			
		}

	}
