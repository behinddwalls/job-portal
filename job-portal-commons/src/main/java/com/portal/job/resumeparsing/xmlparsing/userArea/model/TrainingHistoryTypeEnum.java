//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.23 at 05:06:12 PM IST 
//


package com.portal.job.resumeparsing.xmlparsing.userArea.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainingHistoryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrainingHistoryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Vocational"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="LowerCraft"/>
 *     &lt;enumeration value="MiddleCraft"/>
 *     &lt;enumeration value="HigherCraft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrainingHistoryTypeEnum")
@XmlEnum
public enum TrainingHistoryTypeEnum {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("Vocational")
    VOCATIONAL("Vocational"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("LowerCraft")
    LOWER_CRAFT("LowerCraft"),
    @XmlEnumValue("MiddleCraft")
    MIDDLE_CRAFT("MiddleCraft"),
    @XmlEnumValue("HigherCraft")
    HIGHER_CRAFT("HigherCraft");
    private final String value;

    TrainingHistoryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainingHistoryTypeEnum fromValue(String v) {
        for (TrainingHistoryTypeEnum c: TrainingHistoryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
