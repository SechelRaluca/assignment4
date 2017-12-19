
package implementation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="roleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT"/>
 *     &lt;enumeration value="ADMIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roleEnum")
@XmlEnum
public enum RoleEnum {

    CLIENT,
    ADMIN;

    public String value() {
        return name();
    }

    public static RoleEnum fromValue(String v) {
        return valueOf(v);
    }

}
