//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.23 at 05:06:12 PM IST 
//


package com.portal.job.resumeparsing.xmlparsing.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains copyright information, such as year and copyright text.
 * 
 * <p>Java class for CopyrightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyrightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyrightDates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginalDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType"/>
 *                   &lt;element name="MostRecentDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CopyrightText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyrightType", propOrder = {
    "copyrightDates",
    "copyrightText"
})
public class CopyrightType {

    @XmlElement(name = "CopyrightDates")
    protected CopyrightType.CopyrightDates copyrightDates;
    @XmlElement(name = "CopyrightText")
    protected String copyrightText;

    /**
     * Gets the value of the copyrightDates property.
     * 
     * @return
     *     possible object is
     *     {@link CopyrightType.CopyrightDates }
     *     
     */
    public CopyrightType.CopyrightDates getCopyrightDates() {
        return copyrightDates;
    }

    /**
     * Sets the value of the copyrightDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyrightType.CopyrightDates }
     *     
     */
    public void setCopyrightDates(CopyrightType.CopyrightDates value) {
        this.copyrightDates = value;
    }

    /**
     * Gets the value of the copyrightText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightText() {
        return copyrightText;
    }

    /**
     * Sets the value of the copyrightText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightText(String value) {
        this.copyrightText = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OriginalDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType"/>
     *         &lt;element name="MostRecentDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originalDate",
        "mostRecentDate"
    })
    public static class CopyrightDates {

        @XmlElement(name = "OriginalDate", required = true)
        protected FlexibleDatesType originalDate;
        @XmlElement(name = "MostRecentDate")
        protected FlexibleDatesType mostRecentDate;

        /**
         * Gets the value of the originalDate property.
         * 
         * @return
         *     possible object is
         *     {@link FlexibleDatesType }
         *     
         */
        public FlexibleDatesType getOriginalDate() {
            return originalDate;
        }

        /**
         * Sets the value of the originalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexibleDatesType }
         *     
         */
        public void setOriginalDate(FlexibleDatesType value) {
            this.originalDate = value;
        }

        /**
         * Gets the value of the mostRecentDate property.
         * 
         * @return
         *     possible object is
         *     {@link FlexibleDatesType }
         *     
         */
        public FlexibleDatesType getMostRecentDate() {
            return mostRecentDate;
        }

        /**
         * Sets the value of the mostRecentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexibleDatesType }
         *     
         */
        public void setMostRecentDate(FlexibleDatesType value) {
            this.mostRecentDate = value;
        }

    }

}
