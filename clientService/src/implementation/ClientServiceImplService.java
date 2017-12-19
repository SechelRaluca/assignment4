
package implementation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClientServiceImplService", targetNamespace = "http://implementation/", wsdlLocation = "http://localhost:9089/client?wsdl")
public class ClientServiceImplService
    extends Service
{

    private final static URL CLIENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CLIENTSERVICEIMPLSERVICE_QNAME = new QName("http://implementation/", "ClientServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9089/client?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CLIENTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ClientServiceImplService() {
        super(__getWsdlLocation(), CLIENTSERVICEIMPLSERVICE_QNAME);
    }

    public ClientServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public ClientServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CLIENTSERVICEIMPLSERVICE_QNAME);
    }

    public ClientServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public ClientServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClientServiceImpl
     */
    @WebEndpoint(name = "ClientServiceImplPort")
    public ClientServiceImpl getClientServiceImplPort() {
        return super.getPort(new QName("http://implementation/", "ClientServiceImplPort"), ClientServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientServiceImpl
     */
    @WebEndpoint(name = "ClientServiceImplPort")
    public ClientServiceImpl getClientServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://implementation/", "ClientServiceImplPort"), ClientServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CLIENTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CLIENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
