package com.pro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPBinding;

import com.sendwordnow.contract.users.v2.Users;
import com.sendwordnow.contract.users.v2.UsersSoap;

public class ServiceCall implements SOAPHandler<SOAPMessageContext>{

	
	 private static final String SOAP_ELEMENT_PASSWORD = "Password";
	 private static final String SOAP_ELEMENT_USERNAME = "Username";
	 private static final String SOAP_ELEMENT_USERNAME_TOKEN = "UsernameToken";
	 private static final String SOAP_ELEMENT_SECURITY = "Security";
	 private static final String NAMESPACE_SECURITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	 private static final String PREFIX_SECURITY = "wsse";
	 
	 private String usernameText;
	 private String passwordText;
	
	public ServiceCall(String usernameText, String passwordText) {
		 this.usernameText = usernameText;
		 this.passwordText = passwordText;
		 }
	
	public static void main(String[] args) {
		Users users = new Users();
		UsersSoap usersSoap = users.getUsersSoap();
		String msg = usersSoap.echo("Produte is calling this service");
		System.out.println(msg);
        //System.out.println(usersSoap.echoAuthenticated("Authenticated value"));
        //System.out.println(usersSoap.getOTID());
		
//		Map<String, Object> req_ctx = ((BindingProvider)usersSoap).getRequestContext();
//        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://wsnet.sendwordnow.com/webservices/v2/users.wsdl");
//
//        Map<String, List<String>> headers = new HashMap<String, List<String>>();
//        headers.put("Username", Collections.singletonList("produte.roy@appdirect.com"));
//        headers.put("Password", Collections.singletonList("8X9$kZmbuntAZx"));
//        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
//        System.out.println(usersSoap.echoAuthenticated("This is authenticated echo"));
		
		 
		
		BindingProvider bindingProvider = (BindingProvider) usersSoap;
		List<Handler> handlerChain = new ArrayList<Handler>();
		
		//System.out.println("lol");
		handlerChain.add((Handler) new ServiceCall("produte.roy@appdirect.com", "8X9$kZmbuntAZx"));
		//System.out.println("lol2");
		bindingProvider.getBinding().setHandlerChain(handlerChain);
		//System.out.println("lol3");
		//bindingProvider.getRequestContext().put("http://wsnet.sendwordnow.com/webservices/v2/users", "https://wsnet.sendwordnow.com/webservices/v2/users.wsdl");
		
		System.out.println(usersSoap.echoAuthenticated("This is authenticated echo"));
		
	}
	
	 public boolean handleMessage(SOAPMessageContext soapMessageContext) {
		 
		 //System.out.println("lol222");
		 Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		 
		 if (outboundProperty.booleanValue()) {
		 
		 try {
		 SOAPEnvelope soapEnvelope = soapMessageContext.getMessage().getSOAPPart().getEnvelope();
		 
		 SOAPHeader header = soapEnvelope.getHeader();
//		 if (header == null) {
//		 header = soapEnvelope.addHeader();
//		 }
		 
		 SOAPElement soapElementSecurityHeader = header.addChildElement(SOAP_ELEMENT_SECURITY, PREFIX_SECURITY,
		 NAMESPACE_SECURITY);
		 
		 SOAPElement soapElementUsernameToken = soapElementSecurityHeader.addChildElement(SOAP_ELEMENT_USERNAME_TOKEN, PREFIX_SECURITY);
		 SOAPElement soapElementUsername = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_USERNAME, PREFIX_SECURITY);
		 soapElementUsername.addTextNode(this.usernameText);
		 
		 SOAPElement soapElementPassword = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_PASSWORD, PREFIX_SECURITY);
		 soapElementPassword.addTextNode(this.passwordText);
		 soapMessageContext.getMessage().saveChanges();
		 soapMessageContext.getMessage().writeTo(System.out);
		 
		 } catch (Exception e) {
		 throw new RuntimeException("Error on wsSecurityHandler: " + e.getMessage());
		 }
		 
		 }
		 
		 return true;
		 }

//	@Override
//	public boolean handleMessage(SOAPMessageContext context) {
//		// TODO Auto-generated method stub
//		return false;
//	}

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
