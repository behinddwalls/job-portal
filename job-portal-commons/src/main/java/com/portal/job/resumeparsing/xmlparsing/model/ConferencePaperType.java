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
 * A paper or presentation given at a conference or published as part of conference proceedings.
 * 
 * <p>Java class for ConferencePaperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConferencePaperType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ns.hr-xml.org/2006-02-28}BasicBibliographicRecordType">
 *       &lt;sequence>
 *         &lt;element name="EventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConferenceDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/>
 *         &lt;element name="ConferenceLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConferencePaperType", propOrder = {
    "eventName",
    "conferenceDate",
    "conferenceLocation"
})
public class ConferencePaperType
    extends BasicBibliographicRecordType
{

    @XmlElement(name = "EventName")
    protected String eventName;
    @XmlElement(name = "ConferenceDate")
    protected FlexibleDatesType conferenceDate;
    @XmlElement(name = "ConferenceLocation")
    protected String conferenceLocation;

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the conferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleDatesType }
     *     
     */
    public FlexibleDatesType getConferenceDate() {
        return conferenceDate;
    }

    /**
     * Sets the value of the conferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleDatesType }
     *     
     */
    public void setConferenceDate(FlexibleDatesType value) {
        this.conferenceDate = value;
    }

    /**
     * Gets the value of the conferenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceLocation() {
        return conferenceLocation;
    }

    /**
     * Sets the value of the conferenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceLocation(String value) {
        this.conferenceLocation = value;
    }

}