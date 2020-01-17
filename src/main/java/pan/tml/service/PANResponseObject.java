
package pan.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANResponseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANResponseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="request_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PANresult" type="{http://service.TML.PAN/}resultPANObject" minOccurs="0"/&gt;
 *         &lt;element name="Nameresult" type="{http://service.TML.PAN/}resultNameObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANResponseObject", propOrder = {
    "statusCode",
    "requestId",
    "paNresult",
    "nameresult"
})
public class PANResponseObject {

    @XmlElement(name = "status_code")
    protected String statusCode;
    @XmlElement(name = "request_id")
    protected String requestId;
    @XmlElement(name = "PANresult")
    protected ResultPANObject paNresult;
    @XmlElement(name = "Nameresult")
    protected ResultNameObject nameresult;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the paNresult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultPANObject }
     *     
     */
    public ResultPANObject getPANresult() {
        return paNresult;
    }

    /**
     * Sets the value of the paNresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultPANObject }
     *     
     */
    public void setPANresult(ResultPANObject value) {
        this.paNresult = value;
    }

    /**
     * Gets the value of the nameresult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultNameObject }
     *     
     */
    public ResultNameObject getNameresult() {
        return nameresult;
    }

    /**
     * Sets the value of the nameresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultNameObject }
     *     
     */
    public void setNameresult(ResultNameObject value) {
        this.nameresult = value;
    }

}
