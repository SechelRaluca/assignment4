
package implementation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for route complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APackage" type="{http://implementation/}packagee" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routePairs" type="{http://implementation/}routePair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "route", propOrder = {
    "aPackage",
    "id",
    "routePairs"
})
public class Route {

    @XmlElement(name = "APackage")
    protected Packagee aPackage;
    protected int id;
    @XmlElement(nillable = true)
    protected List<RoutePair> routePairs;

    /**
     * Gets the value of the aPackage property.
     * 
     * @return
     *     possible object is
     *     {@link Packagee }
     *     
     */
    public Packagee getAPackage() {
        return aPackage;
    }

    /**
     * Sets the value of the aPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packagee }
     *     
     */
    public void setAPackage(Packagee value) {
        this.aPackage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the routePairs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routePairs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutePairs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePair }
     * 
     * 
     */
    public List<RoutePair> getRoutePairs() {
        if (routePairs == null) {
            routePairs = new ArrayList<RoutePair>();
        }
        return this.routePairs;
    }

}
