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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EducationHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolOrInstitution" type="{http://ns.hr-xml.org/2006-02-28}SchoolOrInstitutionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationHistoryType", propOrder = {
    "schoolOrInstitution"
})
public class EducationHistoryType {

    @XmlElement(name = "SchoolOrInstitution", required = true)
    protected List<SchoolOrInstitutionType> schoolOrInstitution;

    /**
     * Gets the value of the schoolOrInstitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolOrInstitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolOrInstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolOrInstitutionType }
     * 
     * 
     */
    public List<SchoolOrInstitutionType> getSchoolOrInstitution() {
        if (schoolOrInstitution == null) {
            schoolOrInstitution = new ArrayList<SchoolOrInstitutionType>();
        }
        return this.schoolOrInstitution;
    }

}
