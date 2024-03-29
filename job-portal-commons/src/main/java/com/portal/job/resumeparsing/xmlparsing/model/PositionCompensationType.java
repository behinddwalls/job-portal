//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.23 at 05:06:12 PM IST 
//


package com.portal.job.resumeparsing.xmlparsing.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PositionCompensationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionCompensationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartingCompensation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" />
 *                 &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" />
 *                 &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
 *                 &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EndingCompensation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" />
 *                 &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" />
 *                 &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
 *                 &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherCompensation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
 *                 &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionCompensationType", propOrder = {
    "startingCompensation",
    "endingCompensation",
    "comments",
    "otherCompensation"
})
public class PositionCompensationType {

    @XmlElement(name = "StartingCompensation")
    protected PositionCompensationType.StartingCompensation startingCompensation;
    @XmlElement(name = "EndingCompensation")
    protected PositionCompensationType.EndingCompensation endingCompensation;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "OtherCompensation")
    protected List<PositionCompensationType.OtherCompensation> otherCompensation;

    /**
     * Gets the value of the startingCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link PositionCompensationType.StartingCompensation }
     *     
     */
    public PositionCompensationType.StartingCompensation getStartingCompensation() {
        return startingCompensation;
    }

    /**
     * Sets the value of the startingCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCompensationType.StartingCompensation }
     *     
     */
    public void setStartingCompensation(PositionCompensationType.StartingCompensation value) {
        this.startingCompensation = value;
    }

    /**
     * Gets the value of the endingCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link PositionCompensationType.EndingCompensation }
     *     
     */
    public PositionCompensationType.EndingCompensation getEndingCompensation() {
        return endingCompensation;
    }

    /**
     * Sets the value of the endingCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCompensationType.EndingCompensation }
     *     
     */
    public void setEndingCompensation(PositionCompensationType.EndingCompensation value) {
        this.endingCompensation = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the otherCompensation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCompensation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCompensation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionCompensationType.OtherCompensation }
     * 
     * 
     */
    public List<PositionCompensationType.OtherCompensation> getOtherCompensation() {
        if (otherCompensation == null) {
            otherCompensation = new ArrayList<PositionCompensationType.OtherCompensation>();
        }
        return this.otherCompensation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" />
     *       &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" />
     *       &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
     *       &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EndingCompensation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "currency", required = true)
        protected String currency;
        @XmlAttribute(name = "intervalType")
        protected String intervalType;
        @XmlAttribute(name = "validFrom")
        protected String validFrom;
        @XmlAttribute(name = "validTo")
        protected String validTo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the intervalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntervalType() {
            return intervalType;
        }

        /**
         * Sets the value of the intervalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntervalType(String value) {
            this.intervalType = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidFrom(String value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidTo(String value) {
            this.validTo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
     *       &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class OtherCompensation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "validFrom")
        protected String validFrom;
        @XmlAttribute(name = "validTo")
        protected String validTo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidFrom(String value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidTo(String value) {
            this.validTo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" />
     *       &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" />
     *       &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
     *       &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class StartingCompensation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "currency", required = true)
        protected String currency;
        @XmlAttribute(name = "intervalType")
        protected String intervalType;
        @XmlAttribute(name = "validFrom")
        protected String validFrom;
        @XmlAttribute(name = "validTo")
        protected String validTo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the intervalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntervalType() {
            return intervalType;
        }

        /**
         * Sets the value of the intervalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntervalType(String value) {
            this.intervalType = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidFrom(String value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidTo(String value) {
            this.validTo = value;
        }

    }

}
