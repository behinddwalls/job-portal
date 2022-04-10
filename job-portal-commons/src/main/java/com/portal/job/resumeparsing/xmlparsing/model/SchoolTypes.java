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
 * <p>Java class for schoolTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="schoolTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="highschool"/>
 *     &lt;enumeration value="secondary"/>
 *     &lt;enumeration value="trade"/>
 *     &lt;enumeration value="community"/>
 *     &lt;enumeration value="college"/>
 *     &lt;enumeration value="university"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "schoolTypes")
@XmlEnum
public enum SchoolTypes {

    @XmlEnumValue("highschool")
    HIGHSCHOOL("highschool"),
    @XmlEnumValue("secondary")
    SECONDARY("secondary"),
    @XmlEnumValue("trade")
    TRADE("trade"),
    @XmlEnumValue("community")
    COMMUNITY("community"),
    @XmlEnumValue("college")
    COLLEGE("college"),
    @XmlEnumValue("university")
    UNIVERSITY("university");
    private final String value;

    SchoolTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchoolTypes fromValue(String v) {
        for (SchoolTypes c: SchoolTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
