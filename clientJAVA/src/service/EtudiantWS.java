
package service;

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
@WebServiceClient(name = "EtudiantWS", targetNamespace = "http://service/", wsdlLocation = "http://192.168.144.234:809/EtudiantWS?wsdl")
public class EtudiantWS
    extends Service
{

    private final static URL ETUDIANTWS_WSDL_LOCATION;
    private final static WebServiceException ETUDIANTWS_EXCEPTION;
    private final static QName ETUDIANTWS_QNAME = new QName("http://service/", "EtudiantWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.144.234:809/EtudiantWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ETUDIANTWS_WSDL_LOCATION = url;
        ETUDIANTWS_EXCEPTION = e;
    }

    public EtudiantWS() {
        super(__getWsdlLocation(), ETUDIANTWS_QNAME);
    }

    public EtudiantWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), ETUDIANTWS_QNAME, features);
    }

    public EtudiantWS(URL wsdlLocation) {
        super(wsdlLocation, ETUDIANTWS_QNAME);
    }

    public EtudiantWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ETUDIANTWS_QNAME, features);
    }

    public EtudiantWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EtudiantWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EtudiantService
     */
    @WebEndpoint(name = "EtudiantServicePort")
    public EtudiantService getEtudiantServicePort() {
        return super.getPort(new QName("http://service/", "EtudiantServicePort"), EtudiantService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EtudiantService
     */
    @WebEndpoint(name = "EtudiantServicePort")
    public EtudiantService getEtudiantServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "EtudiantServicePort"), EtudiantService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ETUDIANTWS_EXCEPTION!= null) {
            throw ETUDIANTWS_EXCEPTION;
        }
        return ETUDIANTWS_WSDL_LOCATION;
    }

}
