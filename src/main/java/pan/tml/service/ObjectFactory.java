
package pan.tml.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pan.tml.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PANRequest_QNAME = new QName("http://service.TML.PAN/", "PANRequest");
    private final static QName _PANResponse_QNAME = new QName("http://service.TML.PAN/", "PANResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pan.tml.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PANRequestObject }
     * 
     */
    public PANRequestObject createPANRequestObject() {
        return new PANRequestObject();
    }

    /**
     * Create an instance of {@link PANResponseObject }
     * 
     */
    public PANResponseObject createPANResponseObject() {
        return new PANResponseObject();
    }

    /**
     * Create an instance of {@link ResultPANObject }
     * 
     */
    public ResultPANObject createResultPANObject() {
        return new ResultPANObject();
    }

    /**
     * Create an instance of {@link ResultNameObject }
     * 
     */
    public ResultNameObject createResultNameObject() {
        return new ResultNameObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PANRequestObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.TML.PAN/", name = "PANRequest")
    public JAXBElement<PANRequestObject> createPANRequest(PANRequestObject value) {
        return new JAXBElement<PANRequestObject>(_PANRequest_QNAME, PANRequestObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PANResponseObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.TML.PAN/", name = "PANResponse")
    public JAXBElement<PANResponseObject> createPANResponse(PANResponseObject value) {
        return new JAXBElement<PANResponseObject>(_PANResponse_QNAME, PANResponseObject.class, null, value);
    }

}
