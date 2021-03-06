
package com.sendwordnow.contract.users.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Users Management Service v2.3
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Users", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", wsdlLocation = "https://wsnet.sendwordnow.com/webservices/v2/users.wsdl")
public class Users
    extends Service
{

    private final static URL USERS_WSDL_LOCATION;
    private final static WebServiceException USERS_EXCEPTION;
    private final static QName USERS_QNAME = new QName("http://www.sendwordnow.com/contract/users/v2", "Users");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://wsnet.sendwordnow.com/webservices/v2/users.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERS_WSDL_LOCATION = url;
        USERS_EXCEPTION = e;
    }

    public Users() {
        super(__getWsdlLocation(), USERS_QNAME);
    }

    public Users(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERS_QNAME, features);
    }

    public Users(URL wsdlLocation) {
        super(wsdlLocation, USERS_QNAME);
    }

    public Users(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERS_QNAME, features);
    }

    public Users(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Users(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsersSoap
     */
    @WebEndpoint(name = "UsersSoap")
    public UsersSoap getUsersSoap() {
        return super.getPort(new QName("http://www.sendwordnow.com/contract/users/v2", "UsersSoap"), UsersSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsersSoap
     */
    @WebEndpoint(name = "UsersSoap")
    public UsersSoap getUsersSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sendwordnow.com/contract/users/v2", "UsersSoap"), UsersSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns UsersSoap
     */
    @WebEndpoint(name = "UsersSoap12")
    public UsersSoap getUsersSoap12() {
        return super.getPort(new QName("http://www.sendwordnow.com/contract/users/v2", "UsersSoap12"), UsersSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsersSoap
     */
    @WebEndpoint(name = "UsersSoap12")
    public UsersSoap getUsersSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sendwordnow.com/contract/users/v2", "UsersSoap12"), UsersSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERS_EXCEPTION!= null) {
            throw USERS_EXCEPTION;
        }
        return USERS_WSDL_LOCATION;
    }

}
