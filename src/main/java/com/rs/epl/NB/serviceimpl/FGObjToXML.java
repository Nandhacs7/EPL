package com.rs.epl.NB.serviceimpl;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
//import com.firstapex.rs.uw.webservices.policymovements.*;

import com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO;
//import com.firstapex.rs.uw.webservices.policymovements.ObjectFactory;

public class FGObjToXML {
	
public StringWriter policyobjtoXML(FguwPolicyVO polvo ) throws JAXBException{
	JAXBContext jcontext=JAXBContext.newInstance(FguwPolicyVO.class);
	 Marshaller marshaller = jcontext.createMarshaller();
	 StringWriter Writer=new StringWriter();
	 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 marshaller.marshal(polvo,Writer);
//	 System.out.println(Writer.toString());
     return Writer;
  }
}

//JAXBContext.newInstance(FguwPolicyVO.class);