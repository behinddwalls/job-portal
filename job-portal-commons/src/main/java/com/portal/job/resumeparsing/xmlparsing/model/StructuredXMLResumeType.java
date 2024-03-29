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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredXMLResumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredXMLResumeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://ns.hr-xml.org/2006-02-28}SEPContactInfoType" minOccurs="0"/>
 *         &lt;element name="ExecutiveSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}EmploymentHistory" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}EducationHistory" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}LicensesAndCertifications" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}MilitaryHistory" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}PatentHistory" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}PublicationHistory" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}SpeakingEventsHistory" minOccurs="0"/>
 *         &lt;element name="Qualifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QualificationSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Competency" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Languages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Language" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Achievements" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Associations" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}References" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}SecurityCredentials" minOccurs="0"/>
 *         &lt;element name="ResumeAdditionalItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ns.hr-xml.org/2006-02-28}ResumeAdditionalItem" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupportingMaterials" type="{http://ns.hr-xml.org/2006-02-28}StaffingSupportingMaterialsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfessionalAssociations" type="{http://ns.hr-xml.org/2006-02-28}ProfessionalAssociationType" minOccurs="0"/>
 *         &lt;group ref="{http://ns.hr-xml.org/2006-02-28}Comments" minOccurs="0"/>
 *         &lt;element name="RevisionDate" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredXMLResumeType", propOrder = {
    "contactInfo",
    "executiveSummary",
    "objective",
    "employmentHistory",
    "educationHistory",
    "licensesAndCertifications",
    "militaryHistory",
    "patentHistory",
    "publicationHistory",
    "speakingEventsHistory",
    "qualifications",
    "languages",
    "achievements",
    "associations",
    "references",
    "securityCredentials",
    "resumeAdditionalItems",
    "supportingMaterials",
    "professionalAssociations",
    "comments",
    "revisionDate"
})
public class StructuredXMLResumeType {

    @XmlElement(name = "ContactInfo")
    protected SEPContactInfoType contactInfo;
    @XmlElement(name = "ExecutiveSummary")
    protected String executiveSummary;
    @XmlElement(name = "Objective")
    protected String objective;
    @XmlElement(name = "EmploymentHistory")
    protected EmploymentHistoryType employmentHistory;
    @XmlElement(name = "EducationHistory")
    protected EducationHistoryType educationHistory;
    @XmlElement(name = "LicensesAndCertifications")
    protected LicensesAndCertifications licensesAndCertifications;
    @XmlElement(name = "MilitaryHistory")
    protected MilitaryHistoryType militaryHistory;
    @XmlElement(name = "PatentHistory")
    protected PatentHistoryType patentHistory;
    @XmlElement(name = "PublicationHistory")
    protected PublicationHistoryType publicationHistory;
    @XmlElement(name = "SpeakingEventsHistory")
    protected SpeakingEventsHistory speakingEventsHistory;
    @XmlElement(name = "Qualifications")
    protected StructuredXMLResumeType.Qualifications qualifications;
    @XmlElement(name = "Languages")
    protected StructuredXMLResumeType.Languages languages;
    @XmlElement(name = "Achievements")
    protected Achievements achievements;
    @XmlElement(name = "Associations")
    protected Associations associations;
    @XmlElement(name = "References")
    protected References references;
    @XmlElement(name = "SecurityCredentials")
    protected SecurityCredentials securityCredentials;
    @XmlElement(name = "ResumeAdditionalItems")
    protected StructuredXMLResumeType.ResumeAdditionalItems resumeAdditionalItems;
    @XmlElement(name = "SupportingMaterials")
    protected List<StaffingSupportingMaterialsType> supportingMaterials;
    @XmlElement(name = "ProfessionalAssociations")
    protected ProfessionalAssociationType professionalAssociations;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "RevisionDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String revisionDate;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SEPContactInfoType }
     *     
     */
    public SEPContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEPContactInfoType }
     *     
     */
    public void setContactInfo(SEPContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the executiveSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveSummary() {
        return executiveSummary;
    }

    /**
     * Sets the value of the executiveSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveSummary(String value) {
        this.executiveSummary = value;
    }

    /**
     * Gets the value of the objective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjective() {
        return objective;
    }

    /**
     * Sets the value of the objective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjective(String value) {
        this.objective = value;
    }

    /**
     * Gets the value of the employmentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentHistoryType }
     *     
     */
    public EmploymentHistoryType getEmploymentHistory() {
        return employmentHistory;
    }

    /**
     * Sets the value of the employmentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentHistoryType }
     *     
     */
    public void setEmploymentHistory(EmploymentHistoryType value) {
        this.employmentHistory = value;
    }

    /**
     * Gets the value of the educationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EducationHistoryType }
     *     
     */
    public EducationHistoryType getEducationHistory() {
        return educationHistory;
    }

    /**
     * Sets the value of the educationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationHistoryType }
     *     
     */
    public void setEducationHistory(EducationHistoryType value) {
        this.educationHistory = value;
    }

    /**
     * Gets the value of the licensesAndCertifications property.
     * 
     * @return
     *     possible object is
     *     {@link LicensesAndCertifications }
     *     
     */
    public LicensesAndCertifications getLicensesAndCertifications() {
        return licensesAndCertifications;
    }

    /**
     * Sets the value of the licensesAndCertifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensesAndCertifications }
     *     
     */
    public void setLicensesAndCertifications(LicensesAndCertifications value) {
        this.licensesAndCertifications = value;
    }

    /**
     * Gets the value of the militaryHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryHistoryType }
     *     
     */
    public MilitaryHistoryType getMilitaryHistory() {
        return militaryHistory;
    }

    /**
     * Sets the value of the militaryHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryHistoryType }
     *     
     */
    public void setMilitaryHistory(MilitaryHistoryType value) {
        this.militaryHistory = value;
    }

    /**
     * Gets the value of the patentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PatentHistoryType }
     *     
     */
    public PatentHistoryType getPatentHistory() {
        return patentHistory;
    }

    /**
     * Sets the value of the patentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentHistoryType }
     *     
     */
    public void setPatentHistory(PatentHistoryType value) {
        this.patentHistory = value;
    }

    /**
     * Gets the value of the publicationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationHistoryType }
     *     
     */
    public PublicationHistoryType getPublicationHistory() {
        return publicationHistory;
    }

    /**
     * Sets the value of the publicationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationHistoryType }
     *     
     */
    public void setPublicationHistory(PublicationHistoryType value) {
        this.publicationHistory = value;
    }

    /**
     * Gets the value of the speakingEventsHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SpeakingEventsHistory }
     *     
     */
    public SpeakingEventsHistory getSpeakingEventsHistory() {
        return speakingEventsHistory;
    }

    /**
     * Sets the value of the speakingEventsHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeakingEventsHistory }
     *     
     */
    public void setSpeakingEventsHistory(SpeakingEventsHistory value) {
        this.speakingEventsHistory = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredXMLResumeType.Qualifications }
     *     
     */
    public StructuredXMLResumeType.Qualifications getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredXMLResumeType.Qualifications }
     *     
     */
    public void setQualifications(StructuredXMLResumeType.Qualifications value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredXMLResumeType.Languages }
     *     
     */
    public StructuredXMLResumeType.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredXMLResumeType.Languages }
     *     
     */
    public void setLanguages(StructuredXMLResumeType.Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the achievements property.
     * 
     * @return
     *     possible object is
     *     {@link Achievements }
     *     
     */
    public Achievements getAchievements() {
        return achievements;
    }

    /**
     * Sets the value of the achievements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Achievements }
     *     
     */
    public void setAchievements(Achievements value) {
        this.achievements = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link Associations }
     *     
     */
    public Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Associations }
     *     
     */
    public void setAssociations(Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    public References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     */
    public void setReferences(References value) {
        this.references = value;
    }

    /**
     * Gets the value of the securityCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCredentials }
     *     
     */
    public SecurityCredentials getSecurityCredentials() {
        return securityCredentials;
    }

    /**
     * Sets the value of the securityCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCredentials }
     *     
     */
    public void setSecurityCredentials(SecurityCredentials value) {
        this.securityCredentials = value;
    }

    /**
     * Gets the value of the resumeAdditionalItems property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredXMLResumeType.ResumeAdditionalItems }
     *     
     */
    public StructuredXMLResumeType.ResumeAdditionalItems getResumeAdditionalItems() {
        return resumeAdditionalItems;
    }

    /**
     * Sets the value of the resumeAdditionalItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredXMLResumeType.ResumeAdditionalItems }
     *     
     */
    public void setResumeAdditionalItems(StructuredXMLResumeType.ResumeAdditionalItems value) {
        this.resumeAdditionalItems = value;
    }

    /**
     * Gets the value of the supportingMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffingSupportingMaterialsType }
     * 
     * 
     */
    public List<StaffingSupportingMaterialsType> getSupportingMaterials() {
        if (supportingMaterials == null) {
            supportingMaterials = new ArrayList<StaffingSupportingMaterialsType>();
        }
        return this.supportingMaterials;
    }

    /**
     * Gets the value of the professionalAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalAssociationType }
     *     
     */
    public ProfessionalAssociationType getProfessionalAssociations() {
        return professionalAssociations;
    }

    /**
     * Sets the value of the professionalAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalAssociationType }
     *     
     */
    public void setProfessionalAssociations(ProfessionalAssociationType value) {
        this.professionalAssociations = value;
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
     * Gets the value of the revisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionDate() {
        return revisionDate;
    }

    /**
     * Sets the value of the revisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionDate(String value) {
        this.revisionDate = value;
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
     *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Language" maxOccurs="unbounded"/>
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
        "language"
    })
    public static class Languages {

        @XmlElement(name = "Language", required = true)
        protected List<Language> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Language }
         * 
         * 
         */
        public List<Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<Language>();
            }
            return this.language;
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
     *         &lt;element name="QualificationSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Competency" maxOccurs="unbounded" minOccurs="0"/>
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
        "qualificationSummary",
        "competency"
    })
    public static class Qualifications {

        @XmlElement(name = "QualificationSummary")
        protected String qualificationSummary;
        @XmlElement(name = "Competency")
        protected List<CompetencyType> competency;

        /**
         * Gets the value of the qualificationSummary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualificationSummary() {
            return qualificationSummary;
        }

        /**
         * Sets the value of the qualificationSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualificationSummary(String value) {
            this.qualificationSummary = value;
        }

        /**
         * Gets the value of the competency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the competency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompetency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompetencyType }
         * 
         * 
         */
        public List<CompetencyType> getCompetency() {
            if (competency == null) {
                competency = new ArrayList<CompetencyType>();
            }
            return this.competency;
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
     *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}ResumeAdditionalItem" maxOccurs="unbounded"/>
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
        "resumeAdditionalItem"
    })
    public static class ResumeAdditionalItems {

        @XmlElement(name = "ResumeAdditionalItem", required = true)
        protected List<AdditionalItemType> resumeAdditionalItem;

        /**
         * Gets the value of the resumeAdditionalItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resumeAdditionalItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResumeAdditionalItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalItemType }
         * 
         * 
         */
        public List<AdditionalItemType> getResumeAdditionalItem() {
            if (resumeAdditionalItem == null) {
                resumeAdditionalItem = new ArrayList<AdditionalItemType>();
            }
            return this.resumeAdditionalItem;
        }

    }

}
