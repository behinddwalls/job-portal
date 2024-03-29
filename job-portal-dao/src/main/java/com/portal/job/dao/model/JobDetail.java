package com.portal.job.dao.model;

// Generated Nov 15, 2015 11:59:15 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JobDetail generated by hbm2java
 */
@Entity
@Table(name = "job_detail", catalog = "jobPortal")
public class JobDetail implements java.io.Serializable {

	private Long jobId;
	private UserDetail userDetail;
	private String jobProcessingState;
	private String jobseekerProcessingState;
	private Date lastProcessedTime;
	private String title;
	private String organisationName;
	private String industryName;
	private Integer minSalary;
	private Integer maxSalary;
	private String salaryCurrencyCode;
	private byte keepSalayHidden;
	private byte onlyTopTierInstitute;
	private String jdFileLocation;
	private String jobDescription;
	private String jobStatus;
	private Date expireDate;
	private Date createDate;
	private Date modifiedDate;
	private String locationDetail;
	private String employmentType;
	private Integer jobExperiance;
	private String jobApplicabilityType;
	private String linkToSite;
	private String jobFunction;
	private String jobSkills;
	private Integer organisationTier;
	private Set<JobRelationshipDetail> jobRelationshipDetails = new HashSet<JobRelationshipDetail>(
			0);
	private Set<UserByJob> userByJobs = new HashSet<UserByJob>(0);
	private Set<JobsByUser> jobsByUsers = new HashSet<JobsByUser>(0);

	public JobDetail() {
	}

	public JobDetail(UserDetail userDetail, String title,
			String salaryCurrencyCode, byte keepSalayHidden,
			byte onlyTopTierInstitute, String jobStatus, Date expireDate,
			Date createDate) {
		this.userDetail = userDetail;
		this.title = title;
		this.salaryCurrencyCode = salaryCurrencyCode;
		this.keepSalayHidden = keepSalayHidden;
		this.onlyTopTierInstitute = onlyTopTierInstitute;
		this.jobStatus = jobStatus;
		this.expireDate = expireDate;
		this.createDate = createDate;
	}

	public JobDetail(UserDetail userDetail, String jobProcessingState,
			String jobseekerProcessingState, Date lastProcessedTime,
			String title, String organisationName, String industryName,
			Integer minSalary, Integer maxSalary, String salaryCurrencyCode,
			byte keepSalayHidden, byte onlyTopTierInstitute,
			String jdFileLocation, String jobDescription, String jobStatus,
			Date expireDate, Date createDate, Date modifiedDate,
			String locationDetail, String employmentType,
			Integer jobExperiance, String jobApplicabilityType,
			String linkToSite, String jobFunction, String jobSkills,
			Integer organisationTier,
			Set<JobRelationshipDetail> jobRelationshipDetails,
			Set<UserByJob> userByJobs, Set<JobsByUser> jobsByUsers) {
		this.userDetail = userDetail;
		this.jobProcessingState = jobProcessingState;
		this.jobseekerProcessingState = jobseekerProcessingState;
		this.lastProcessedTime = lastProcessedTime;
		this.title = title;
		this.organisationName = organisationName;
		this.industryName = industryName;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.salaryCurrencyCode = salaryCurrencyCode;
		this.keepSalayHidden = keepSalayHidden;
		this.onlyTopTierInstitute = onlyTopTierInstitute;
		this.jdFileLocation = jdFileLocation;
		this.jobDescription = jobDescription;
		this.jobStatus = jobStatus;
		this.expireDate = expireDate;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.locationDetail = locationDetail;
		this.employmentType = employmentType;
		this.jobExperiance = jobExperiance;
		this.jobApplicabilityType = jobApplicabilityType;
		this.linkToSite = linkToSite;
		this.jobFunction = jobFunction;
		this.jobSkills = jobSkills;
		this.organisationTier = organisationTier;
		this.jobRelationshipDetails = jobRelationshipDetails;
		this.userByJobs = userByJobs;
		this.jobsByUsers = jobsByUsers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "job_id", unique = true, nullable = false)
	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recruiter_id", nullable = false)
	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Column(name = "job_processing_state", length = 200)
	public String getJobProcessingState() {
		return this.jobProcessingState;
	}

	public void setJobProcessingState(String jobProcessingState) {
		this.jobProcessingState = jobProcessingState;
	}

	@Column(name = "jobseeker_processing_state", length = 200)
	public String getJobseekerProcessingState() {
		return this.jobseekerProcessingState;
	}

	public void setJobseekerProcessingState(String jobseekerProcessingState) {
		this.jobseekerProcessingState = jobseekerProcessingState;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_processed_time", length = 19)
	public Date getLastProcessedTime() {
		return this.lastProcessedTime;
	}

	public void setLastProcessedTime(Date lastProcessedTime) {
		this.lastProcessedTime = lastProcessedTime;
	}

	@Column(name = "title", nullable = false, length = 65535)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "organisation_name", length = 65535)
	public String getOrganisationName() {
		return this.organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	@Column(name = "industry_name", length = 65535)
	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	@Column(name = "min_salary")
	public Integer getMinSalary() {
		return this.minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	@Column(name = "max_salary")
	public Integer getMaxSalary() {
		return this.maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Column(name = "salary_currency_code", nullable = false, length = 10)
	public String getSalaryCurrencyCode() {
		return this.salaryCurrencyCode;
	}

	public void setSalaryCurrencyCode(String salaryCurrencyCode) {
		this.salaryCurrencyCode = salaryCurrencyCode;
	}

	@Column(name = "keep_salay_hidden", nullable = false)
	public byte getKeepSalayHidden() {
		return this.keepSalayHidden;
	}

	public void setKeepSalayHidden(byte keepSalayHidden) {
		this.keepSalayHidden = keepSalayHidden;
	}

	@Column(name = "only_top_tier_institute", nullable = false)
	public byte getOnlyTopTierInstitute() {
		return this.onlyTopTierInstitute;
	}

	public void setOnlyTopTierInstitute(byte onlyTopTierInstitute) {
		this.onlyTopTierInstitute = onlyTopTierInstitute;
	}

	@Column(name = "jd_file_location", length = 65535)
	public String getJdFileLocation() {
		return this.jdFileLocation;
	}

	public void setJdFileLocation(String jdFileLocation) {
		this.jdFileLocation = jdFileLocation;
	}

	@Column(name = "job_description", length = 65535)
	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Column(name = "job_status", nullable = false, length = 200)
	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expire_date", nullable = false, length = 19)
	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date", length = 19)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "location_detail", length = 65535)
	public String getLocationDetail() {
		return this.locationDetail;
	}

	public void setLocationDetail(String locationDetail) {
		this.locationDetail = locationDetail;
	}

	@Column(name = "employment_type", length = 65535)
	public String getEmploymentType() {
		return this.employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	@Column(name = "job_experiance")
	public Integer getJobExperiance() {
		return this.jobExperiance;
	}

	public void setJobExperiance(Integer jobExperiance) {
		this.jobExperiance = jobExperiance;
	}

	@Column(name = "job_applicability_type", length = 65535)
	public String getJobApplicabilityType() {
		return this.jobApplicabilityType;
	}

	public void setJobApplicabilityType(String jobApplicabilityType) {
		this.jobApplicabilityType = jobApplicabilityType;
	}

	@Column(name = "link_to_site", length = 65535)
	public String getLinkToSite() {
		return this.linkToSite;
	}

	public void setLinkToSite(String linkToSite) {
		this.linkToSite = linkToSite;
	}

	@Column(name = "job_function", length = 65535)
	public String getJobFunction() {
		return this.jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	@Column(name = "job_skills", length = 65535)
	public String getJobSkills() {
		return this.jobSkills;
	}

	public void setJobSkills(String jobSkills) {
		this.jobSkills = jobSkills;
	}

	@Column(name = "organisation_tier")
	public Integer getOrganisationTier() {
		return this.organisationTier;
	}

	public void setOrganisationTier(Integer organisationTier) {
		this.organisationTier = organisationTier;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobDetail")
	public Set<JobRelationshipDetail> getJobRelationshipDetails() {
		return this.jobRelationshipDetails;
	}

	public void setJobRelationshipDetails(
			Set<JobRelationshipDetail> jobRelationshipDetails) {
		this.jobRelationshipDetails = jobRelationshipDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobDetail")
	public Set<UserByJob> getUserByJobs() {
		return this.userByJobs;
	}

	public void setUserByJobs(Set<UserByJob> userByJobs) {
		this.userByJobs = userByJobs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobDetail")
	public Set<JobsByUser> getJobsByUsers() {
		return this.jobsByUsers;
	}

	public void setJobsByUsers(Set<JobsByUser> jobsByUsers) {
		this.jobsByUsers = jobsByUsers;
	}

}
