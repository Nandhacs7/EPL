package com.rs.epl.NB.controllers;

public class test {

	public static void main(String[] args) {
/*
//		String Status="<?xml version=1.0 encoding=UTF- standalone=yes?>"
//				+ "<fgResponseVO><errorDetailVOList>"
//				+ "<errorCode>E_AC_0061</errorCode><errorDesc>Invalid Back-Dated Cheque : cheque.chequeDate</errorDesc>"
//				+"<errorCode>E_AC_0062</errorCode><errorDesc>Invalid Back-Dated Cheque RAm</errorDesc>"
//				+ "</errorDetailVOList><status>FAIL</status><voucherNumber>MVV269432</voucherNumber></fgResponseVO>";
		
		String Status="<?xml version= encoding= standalone><fgResponseVO><status>FAIL</status><voucherNumber>MVP280101</voucherNumber><XSD_AUX_NC>E_FICACNT_WS_003 | E_FICACNT_WS_020</XSD_AUX_NC></fgResponseVO>";

		
		
		
//		String responseTextVo=Status.replaceAll("<[^>]+>", "-");
//		System.out.println(":::"+responseTextVo);

		  int i=Status.indexOf("<errorCode>");
		  int j=Status.lastIndexOf("</errorDesc>");
		  String stx2=Status.substring(i, j);
		  String ram=stx2.replaceAll("<.*?>", "  ").trim().replace("  " , "=>");
		  System.out.println(ram);		*/
		
			
		}

	}


