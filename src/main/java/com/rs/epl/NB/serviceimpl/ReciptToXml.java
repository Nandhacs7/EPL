package com.rs.epl.NB.serviceimpl;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


import com.firstapex.rs.acnt.webservices.receiptInterface.FgResponseVO;

public class ReciptToXml {
	
	public StringWriter Recipttoxml(FgResponseVO recipt) throws JAXBException{
		
		JAXBContext jcontext=JAXBContext.newInstance(FgResponseVO.class);
		Marshaller marshaller = jcontext.createMarshaller();
		StringWriter Writer=new StringWriter();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(recipt,Writer);
		return Writer;
	}
	

}
