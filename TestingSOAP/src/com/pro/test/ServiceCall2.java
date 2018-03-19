package com.pro.test;

import javax.xml.ws.BindingProvider;

import com.sendwordnow.contract.users.v2.Users;
import com.sendwordnow.contract.users.v2.UsersSoap;


public class ServiceCall2 {

	public static void main(String[] args) {
		Users users = new Users();
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		users.setHandlerResolver(handlerResolver);
		UsersSoap usersSoap = users.getUsersSoap();
		
//		BindingProvider bindingProvider = (BindingProvider) usersSoap;
//		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://wsnet.sendwordnow.com/webservices/v2/users.wsdl");
		//bindingProvider.getRequestContext().put("SSLSocketFactory", getCustomSocketFactory());
		//System.out.println(usersSoap.getOTID());
		//System.out.println(usersSoap.echoAuthenticated("\nHello ! This is echo authenticated"));
		System.out.println(usersSoap.echo("\nHello ! This is echo "));

	}

}
