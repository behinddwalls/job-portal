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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PatentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatentDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inventors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InventorName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PatentDetail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IssuingAuthority" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="countryCode" type="{http://ns.hr-xml.org/2006-02-28}CountryCodeType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PatentMilestone" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://ns.hr-xml.org/2006-02-28}PatentStatusTypes" minOccurs="0"/>
 *                             &lt;element name="Date" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNkNaType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Link" type="{http://ns.hr-xml.org/2006-02-28}InternetWebAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentDescriptionType", propOrder = {
    "patentTitle",
    "description",
    "inventors",
    "patentDetail",
    "link"
})
public class PatentDescriptionType {

    @XmlElement(name = "PatentTitle")
    protected String patentTitle;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Inventors")
    protected PatentDescriptionType.Inventors inventors;
    @XmlElement(name = "PatentDetail")
    protected List<PatentDescriptionType.PatentDetail> patentDetail;
    @XmlElement(name = "Link")
    protected String link;

    /**
     * Gets the value of the patentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatentTitle() {
        return patentTitle;
    }

    /**
     * Sets the value of the patentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatentTitle(String value) {
        this.patentTitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inventors property.
     * 
     * @return
     *     possible object is
     *     {@link PatentDescriptionType.Inventors }
     *     
     */
    public PatentDescriptionType.Inventors getInventors() {
        return inventors;
    }

    /**
     * Sets the value of the inventors property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentDescriptionType.Inventors }
     *     
     */
    public void setInventors(PatentDescriptionType.Inventors value) {
        this.inventors = value;
    }

    /**
     * Gets the value of the patentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatentDescriptionType.PatentDetail }
     * 
     * 
     */
    public List<PatentDescriptionType.PatentDetail> getPatentDetail() {
        if (patentDetail == null) {
            patentDetail = new ArrayList<PatentDescriptionType.PatentDetail>();
        }
        return this.patentDetail;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
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
     *         &lt;element name="InventorName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "inventorName"
    })
    public static class Inventors {

        @XmlElement(name = "InventorName", required = true)
        protected List<String> inventorName;

        /**
         * Gets the value of the inventorName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inventorName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInventorName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getInventorName() {
            if (inventorName == null) {
                inventorName = new ArrayList<String>();
            }
            return this.inventorName;
        }

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
     *         &lt;element name="IssuingAuthority" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="countryCode" type="{http://ns.hr-xml.org/2006-02-28}CountryCodeType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PatentMilestone" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://ns.hr-xml.org/2006-02-28}PatentStatusTypes" minOccurs="0"/>
     *                   &lt;element name="Date" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNkNaType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "issuingAuthority",
        "patentMilestone"
    })
    public static class PatentDetail {

        @XmlElement(name = "IssuingAuthority")
        protected PatentDescriptionType.PatentDetail.IssuingAuthority issuingAuthority;
        @XmlElement(name = "PatentMilestone", required = true)
        protected List<PatentDescriptionType.PatentDetail.PatentMilestone> patentMilestone;

        /**
         * Gets the value of the issuingAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link PatentDescriptionType.PatentDetail.IssuingAuthority }
         *     
         */
        public PatentDescriptionType.PatentDetail.IssuingAuthority getIssuingAuthority() {
            return issuingAuthority;
        }

        /**
         * Sets the value of the issuingAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link PatentDescriptionType.PatentDetail.IssuingAuthority }
         *     
         */
        public void setIssuingAuthority(PatentDescriptionType.PatentDetail.IssuingAuthority value) {
            this.issuingAuthority = value;
        }

        /**
         * Gets the value of the patentMilestone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patentMilestone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatentMilestone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PatentDescriptionType.PatentDetail.PatentMilestone }
         * 
         * 
         */
        public List<PatentDescriptionType.PatentDetail.PatentMilestone> getPatentMilestone() {
            if (patentMilestone == null) {
                patentMilestone = new ArrayList<PatentDescriptionType.PatentDetail.PatentMilestone>();
            }
            return this.patentMilestone;
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
         *       &lt;attribute name="countryCode" type="{http://ns.hr-xml.org/2006-02-28}CountryCodeType" />
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
        public static class IssuingAuthority {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "countryCode")
            protected String countryCode;

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
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

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
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://ns.hr-xml.org/2006-02-28}PatentStatusTypes" minOccurs="0"/>
         *         &lt;element name="Date" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNkNaType" minOccurs="0"/>
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
            "id",
            "status",
            "date"
        })
        public static class PatentMilestone {

            @XmlElement(name = "Id")
            protected String id;
            @XmlElement(name = "Status")
            @XmlSchemaType(name = "anySimpleType")
            protected String status;
            @XmlElement(name = "Date")
            @XmlSchemaType(name = "anySimpleType")
            protected String date;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

        }

    }

}
