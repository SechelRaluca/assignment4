
package implementation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://implementation/}routePair" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://implementation/}packagee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStatus", propOrder = {
    "arg0",
    "arg1"
})
public class UpdateStatus {

    protected RoutePair arg0;
    protected Packagee arg1;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePair }
     *     
     */
    public RoutePair getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePair }
     *     
     */
    public void setArg0(RoutePair value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link Packagee }
     *     
     */
    public Packagee getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packagee }
     *     
     */
    public void setArg1(Packagee value) {
        this.arg1 = value;
    }

}
