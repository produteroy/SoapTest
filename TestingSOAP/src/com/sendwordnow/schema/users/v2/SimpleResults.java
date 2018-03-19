
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleResults.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleResults">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Succeeded"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SimpleResults")
@XmlEnum
public enum SimpleResults {

    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    SimpleResults(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleResults fromValue(String v) {
        for (SimpleResults c: SimpleResults.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
