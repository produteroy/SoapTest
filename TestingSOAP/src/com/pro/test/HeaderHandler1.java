package com.pro.test;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Random;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HeaderHandler1 implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext smc) {
		 Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		 
	        if (outboundProperty.booleanValue()) {
	 
	            SOAPMessage message = smc.getMessage();
	 
	            try {
	 
	                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
	                envelope.addAttribute(new QName("xmlns:soap"), "http://www.w3.org/2003/05/soap-envelope");
	                envelope.addAttribute(new QName("xmlns:v2"), "http://www.sendwordnow.com/contract/users/v2");
	                //SOAPHeader header = envelope.addHeader();
	                SOAPHeader header = envelope.getHeader();
	       		 if (header == null) {
	       		 header = envelope.addHeader();
	       		 }
	 
	                SOAPElement security =
	                        header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
	                security.setAttribute("SOAP-ENV:mustUnderstand", "1");
	 
	                SOAPElement usernameToken =
	                        security.addChildElement("UsernameToken", "wsse");
	                usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
	                usernameToken.addAttribute(new QName("wsu:Id"), "UsernameToken-1");
	                
	 
	                SOAPElement username =
	                        usernameToken.addChildElement("Username", "wsse");
	                username.addTextNode("produte.roy@appdirect.com");
	 
	                SOAPElement password =
	                        usernameToken.addChildElement("Password", "wsse");
	                password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
	            	password.addTextNode("8X9$kZmbuntAZx");
	            	
	            	SOAPElement nonce = usernameToken.addChildElement("Nonce", "wsse");
	                nonce.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
//	                nonce.addTextNode(((new String(Base64.getEncoder().encode("asdbvweoegohdouy".getBytes())))));
//	                System.out.println(Base64.getEncoder().encode("asdbvweoegohdouy".getBytes()));
	                
	                byte[] r = new byte[16]; 
	                new Random().nextBytes(r);
	                String s = Base64.getEncoder().encodeToString(r);
	                nonce.addTextNode(s);
	                
	                SOAPElement created = usernameToken.addChildElement("Created", "wsu");
	                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	                Calendar c1 = Calendar.getInstance();
	                created.addTextNode(sdf.format(c1.getTime()));
	 
	                //Print out the outbound SOAP message to System.out
	            	message.saveChanges();
	                message.writeTo(System.out);
	                System.out.println("Hi "+header.getAttributes().getLength());
	                System.out.println("");
	                
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	 
	        } else {
	            try {
	                
	                //This handler does nothing with the response from the Web Service so
	                //we just print out the SOAP message.
	                SOAPMessage message = smc.getMessage();
	                message.writeTo(System.out);
	                System.out.println("");
	 
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            } 
	        }
	 
	 
	        return outboundProperty;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
