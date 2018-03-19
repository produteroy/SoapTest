package com.pro.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandlerResolver implements HandlerResolver {

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();
		 
	      //HeaderHandler hh = new HeaderHandler();
		    HeaderHandler1 hh = new HeaderHandler1();
	      handlerChain.add(hh);
	 
	      return handlerChain;
	}

}
