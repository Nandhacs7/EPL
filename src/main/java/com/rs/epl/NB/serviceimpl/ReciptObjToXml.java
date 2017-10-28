package com.rs.epl.NB.serviceimpl;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.firstapex.rs.acnt.webservices.receiptInterface.FgReceiptVO;



public class ReciptObjToXml {
	public StringWriter policyobjtoXML(FgReceiptVO recvo) throws JAXBException{
		JAXBContext jcontext=JAXBContext.newInstance(FgReceiptVO.class);
		 Marshaller marshaller = jcontext.createMarshaller();
		 StringWriter Writer=new StringWriter();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		 marshaller.marshal(recvo,Writer);
//		 System.out.println(Writer.toString());
	     return Writer;
	  }	
	
	

}
