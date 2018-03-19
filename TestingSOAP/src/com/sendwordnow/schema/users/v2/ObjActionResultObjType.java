
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjActionResultObjType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjActionResultObjType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="ContactCustomField"/>
 *     &lt;enumeration value="ContactCustomFieldsDefinition"/>
 *     &lt;enumeration value="ContactPoint"/>
 *     &lt;enumeration value="ContactLocationLabel"/>
 *     &lt;enumeration value="ContactLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjActionResultObjType")
@XmlEnum
public enum ObjActionResultObjType {

    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("ContactCustomField")
    CONTACT_CUSTOM_FIELD("ContactCustomField"),
    @XmlEnumValue("ContactCustomFieldsDefinition")
    CONTACT_CUSTOM_FIELDS_DEFINITION("ContactCustomFieldsDefinition"),
    @XmlEnumValue("ContactPoint")
    CONTACT_POINT("ContactPoint"),
    @XmlEnumValue("ContactLocationLabel")
    CONTACT_LOCATION_LABEL("ContactLocationLabel"),
    @XmlEnumValue("ContactLocation")
    CONTACT_LOCATION("ContactLocation");
    private final String value;

    ObjActionResultObjType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjActionResultObjType fromValue(String v) {
        for (ObjActionResultObjType c: ObjActionResultObjType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
