//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.23 at 05:06:12 PM IST 
//


package com.portal.job.resumeparsing.xmlparsing.userArea.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CompanyNameProbability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PositionTitleProbability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OffsetOfFarthestDataFound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSelfEmployed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SelfEmploymentPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployeesSupervised" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Bullets" type="{http://sovren.com/hr-xml/2006-02-28}BulletsType" minOccurs="0"/>
 *         &lt;element name="NormalizedOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalizedTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalizedIndustries" type="{http://sovren.com/hr-xml/2006-02-28}IndustryType" minOccurs="0"/>
 *         &lt;element name="NormalizedLocation" type="{http://sovren.com/hr-xml/2006-02-28}LocationType" minOccurs="0"/>
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
    "companyNameProbability",
    "positionTitleProbability",
    "offsetOfFarthestDataFound",
    "isSelfEmployed",
    "selfEmploymentPhrase",
    "numberOfEmployeesSupervised",
    "bullets",
    "normalizedOrganizationName",
    "normalizedTitle",
    "normalizedIndustries",
    "normalizedLocation"
})
@XmlRootElement(name = "PositionHistoryUserArea")
public class PositionHistoryUserArea {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CompanyNameProbability")
    protected Integer companyNameProbability;
    @XmlElement(name = "PositionTitleProbability")
    protected Integer positionTitleProbability;
    @XmlElement(name = "OffsetOfFarthestDataFound")
    protected Integer offsetOfFarthestDataFound;
    @XmlElement(name = "IsSelfEmployed")
    protected Boolean isSelfEmployed;
    @XmlElement(name = "SelfEmploymentPhrase")
    protected String selfEmploymentPhrase;
    @XmlElement(name = "NumberOfEmployeesSupervised")
    protected Integer numberOfEmployeesSupervised;
    @XmlElement(name = "Bullets")
    protected BulletsType bullets;
    @XmlElement(name = "NormalizedOrganizationName")
    protected String normalizedOrganizationName;
    @XmlElement(name = "NormalizedTitle")
    protected String normalizedTitle;
    @XmlElement(name = "NormalizedIndustries")
    protected IndustryType normalizedIndustries;
    @XmlElement(name = "NormalizedLocation")
    protected LocationType normalizedLocation;

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
     * Gets the value of the companyNameProbability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyNameProbability() {
        return companyNameProbability;
    }

    /**
     * Sets the value of the companyNameProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyNameProbability(Integer value) {
        this.companyNameProbability = value;
    }

    /**
     * Gets the value of the positionTitleProbability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionTitleProbability() {
        return positionTitleProbability;
    }

    /**
     * Sets the value of the positionTitleProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionTitleProbability(Integer value) {
        this.positionTitleProbability = value;
    }

    /**
     * Gets the value of the offsetOfFarthestDataFound property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetOfFarthestDataFound() {
        return offsetOfFarthestDataFound;
    }

    /**
     * Sets the value of the offsetOfFarthestDataFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetOfFarthestDataFound(Integer value) {
        this.offsetOfFarthestDataFound = value;
    }

    /**
     * Gets the value of the isSelfEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelfEmployed() {
        return isSelfEmployed;
    }

    /**
     * Sets the value of the isSelfEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelfEmployed(Boolean value) {
        this.isSelfEmployed = value;
    }

    /**
     * Gets the value of the selfEmploymentPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfEmploymentPhrase() {
        return selfEmploymentPhrase;
    }

    /**
     * Sets the value of the selfEmploymentPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfEmploymentPhrase(String value) {
        this.selfEmploymentPhrase = value;
    }

    /**
     * Gets the value of the numberOfEmployeesSupervised property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfEmployeesSupervised() {
        return numberOfEmployeesSupervised;
    }

    /**
     * Sets the value of the numberOfEmployeesSupervised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfEmployeesSupervised(Integer value) {
        this.numberOfEmployeesSupervised = value;
    }

    /**
     * Gets the value of the bullets property.
     * 
     * @return
     *     possible object is
     *     {@link BulletsType }
     *     
     */
    public BulletsType getBullets() {
        return bullets;
    }

    /**
     * Sets the value of the bullets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletsType }
     *     
     */
    public void setBullets(BulletsType value) {
        this.bullets = value;
    }

    /**
     * Gets the value of the normalizedOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedOrganizationName() {
        return normalizedOrganizationName;
    }

    /**
     * Sets the value of the normalizedOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedOrganizationName(String value) {
        this.normalizedOrganizationName = value;
    }

    /**
     * Gets the value of the normalizedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedTitle() {
        return normalizedTitle;
    }

    /**
     * Sets the value of the normalizedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedTitle(String value) {
        this.normalizedTitle = value;
    }

    /**
     * Gets the value of the normalizedIndustries property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryType }
     *     
     */
    public IndustryType getNormalizedIndustries() {
        return normalizedIndustries;
    }

    /**
     * Sets the value of the normalizedIndustries property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryType }
     *     
     */
    public void setNormalizedIndustries(IndustryType value) {
        this.normalizedIndustries = value;
    }

    /**
     * Gets the value of the normalizedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getNormalizedLocation() {
        return normalizedLocation;
    }

    /**
     * Sets the value of the normalizedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setNormalizedLocation(LocationType value) {
        this.normalizedLocation = value;
    }

}
