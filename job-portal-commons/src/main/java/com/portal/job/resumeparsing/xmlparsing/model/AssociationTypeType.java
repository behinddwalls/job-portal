//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.23 at 05:06:12 PM IST 
//


package com.portal.job.resumeparsing.xmlparsing.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssociationTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Social"/>
 *     &lt;enumeration value="Community"/>
 *     &lt;enumeration value="Non-Profit"/>
 *     &lt;enumeration value="Religious"/>
 *     &lt;enumeration value="Political"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssociationTypeType")
@XmlEnum
public enum AssociationTypeType {

    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("Social")
    SOCIAL("Social"),
    @XmlEnumValue("Community")
    COMMUNITY("Community"),
    @XmlEnumValue("Non-Profit")
    NON_PROFIT("Non-Profit"),
    @XmlEnumValue("Religious")
    RELIGIOUS("Religious"),
    @XmlEnumValue("Political")
    POLITICAL("Political");
    private final String value;

    AssociationTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssociationTypeType fromValue(String v) {
        for (AssociationTypeType c: AssociationTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
