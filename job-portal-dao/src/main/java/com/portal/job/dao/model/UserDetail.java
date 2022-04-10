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
 * UserDetail generated by hbm2java
 */
@Entity
@Table(name = "user_detail", catalog = "jobPortal")
public class UserDetail implements java.io.Serializable {

	private Long userId;
	private BasicAccountDetail basicAccountDetail;
	private String firstName;
	private String lastName;
	private String profileImageUrl;
	private String profileHeadline;
	private String summary;
	private String maritalStatus;
	private String gender;
	private Date dateOfBirth;
	private String interests;
	private String mobileNumber;
	private String otherContactNumbers;
	private String recruiterType;
	private String language;
	private String address;
	private Integer ctc;
	private Integer topInstituteTier;
	private Integer pastExperienceMonths;
	private String jobFunction;
	private String skills;
	private String latestCompanyName;
	private String processedState;
	private String recruiterProcessedState;
	private String industryName;
	private String skillsFoundInWork;
	private String userResumeLink;
	private byte hideCtc;
	private byte isResumeParsed;
	private byte hasProfileChanged;
	private Set<JobRelationshipDetail> jobRelationshipDetailsForExpertId = new HashSet<JobRelationshipDetail>(
			0);
	private Set<UserTestDetail> userTestDetails = new HashSet<UserTestDetail>(0);
	private Set<UserExperinceDetail> userExperinceDetails = new HashSet<UserExperinceDetail>(
			0);
	private Set<JobRelationshipDetail> jobRelationshipDetailsForRecruiterId = new HashSet<JobRelationshipDetail>(
			0);
	private Set<JobsByUser> jobsByUsers = new HashSet<JobsByUser>(0);
	private Set<UserEducationDetail> userEducationDetails = new HashSet<UserEducationDetail>(
			0);
	private Set<JobDetail> jobDetails = new HashSet<JobDetail>(0);
	private Set<UserCertificationDetail> userCertificationDetails = new HashSet<UserCertificationDetail>(
			0);
	private Set<UserPatentDetail> userPatentDetails = new HashSet<UserPatentDetail>(
			0);
	private Set<UserProjectDetail> userProjectDetails = new HashSet<UserProjectDetail>(
			0);
	private Set<UserPublicationDetail> userPublicationDetails = new HashSet<UserPublicationDetail>(
			0);
	private Set<JobDetail> jobDetails_1 = new HashSet<JobDetail>(0);
	private Set<JobRelationshipDetail> jobRelationshipDetailsForJobseekerId = new HashSet<JobRelationshipDetail>(
			0);
	private Set<UserAwardDetail> userAwardDetails = new HashSet<UserAwardDetail>(
			0);
	private Set<UserVolunteerDetail> userVolunteerDetails = new HashSet<UserVolunteerDetail>(
			0);
	private Set<UserByJob> userByJobs = new HashSet<UserByJob>(0);

	public UserDetail() {
	}

	public UserDetail(BasicAccountDetail basicAccountDetail, byte hideCtc,
			byte isResumeParsed, byte hasProfileChanged) {
		this.basicAccountDetail = basicAccountDetail;
		this.hideCtc = hideCtc;
		this.isResumeParsed = isResumeParsed;
		this.hasProfileChanged = hasProfileChanged;
	}

	public UserDetail(BasicAccountDetail basicAccountDetail, String firstName,
			String lastName, String profileImageUrl, String profileHeadline,
			String summary, String maritalStatus, String gender,
			Date dateOfBirth, String interests, String mobileNumber,
			String otherContactNumbers, String recruiterType, String language,
			String address, Integer ctc, Integer topInstituteTier,
			Integer pastExperienceMonths, String jobFunction, String skills,
			String latestCompanyName, String processedState,
			String recruiterProcessedState, String industryName,
			String skillsFoundInWork, String userResumeLink, byte hideCtc,
			byte isResumeParsed, byte hasProfileChanged,
			Set<JobRelationshipDetail> jobRelationshipDetailsForExpertId,
			Set<UserTestDetail> userTestDetails,
			Set<UserExperinceDetail> userExperinceDetails,
			Set<JobRelationshipDetail> jobRelationshipDetailsForRecruiterId,
			Set<JobsByUser> jobsByUsers,
			Set<UserEducationDetail> userEducationDetails,
			Set<JobDetail> jobDetails,
			Set<UserCertificationDetail> userCertificationDetails,
			Set<UserPatentDetail> userPatentDetails,
			Set<UserProjectDetail> userProjectDetails,
			Set<UserPublicationDetail> userPublicationDetails,
			Set<JobDetail> jobDetails_1,
			Set<JobRelationshipDetail> jobRelationshipDetailsForJobseekerId,
			Set<UserAwardDetail> userAwardDetails,
			Set<UserVolunteerDetail> userVolunteerDetails,
			Set<UserByJob> userByJobs) {
		this.basicAccountDetail = basicAccountDetail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileImageUrl = profileImageUrl;
		this.profileHeadline = profileHeadline;
		this.summary = summary;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.interests = interests;
		this.mobileNumber = mobileNumber;
		this.otherContactNumbers = otherContactNumbers;
		this.recruiterType = recruiterType;
		this.language = language;
		this.address = address;
		this.ctc = ctc;
		this.topInstituteTier = topInstituteTier;
		this.pastExperienceMonths = pastExperienceMonths;
		this.jobFunction = jobFunction;
		this.skills = skills;
		this.latestCompanyName = latestCompanyName;
		this.processedState = processedState;
		this.recruiterProcessedState = recruiterProcessedState;
		this.industryName = industryName;
		this.skillsFoundInWork = skillsFoundInWork;
		this.userResumeLink = userResumeLink;
		this.hideCtc = hideCtc;
		this.isResumeParsed = isResumeParsed;
		this.hasProfileChanged = hasProfileChanged;
		this.jobRelationshipDetailsForExpertId = jobRelationshipDetailsForExpertId;
		this.userTestDetails = userTestDetails;
		this.userExperinceDetails = userExperinceDetails;
		this.jobRelationshipDetailsForRecruiterId = jobRelationshipDetailsForRecruiterId;
		this.jobsByUsers = jobsByUsers;
		this.userEducationDetails = userEducationDetails;
		this.jobDetails = jobDetails;
		this.userCertificationDetails = userCertificationDetails;
		this.userPatentDetails = userPatentDetails;
		this.userProjectDetails = userProjectDetails;
		this.userPublicationDetails = userPublicationDetails;
		this.jobDetails_1 = jobDetails_1;
		this.jobRelationshipDetailsForJobseekerId = jobRelationshipDetailsForJobseekerId;
		this.userAwardDetails = userAwardDetails;
		this.userVolunteerDetails = userVolunteerDetails;
		this.userByJobs = userByJobs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", nullable = false)
	public BasicAccountDetail getBasicAccountDetail() {
		return this.basicAccountDetail;
	}

	public void setBasicAccountDetail(BasicAccountDetail basicAccountDetail) {
		this.basicAccountDetail = basicAccountDetail;
	}

	@Column(name = "first_name", length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "profile_image_url", length = 65535)
	public String getProfileImageUrl() {
		return this.profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	@Column(name = "profile_headline", length = 65535)
	public String getProfileHeadline() {
		return this.profileHeadline;
	}

	public void setProfileHeadline(String profileHeadline) {
		this.profileHeadline = profileHeadline;
	}

	@Column(name = "summary", length = 65535)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "marital_status", length = 10)
	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth", length = 10)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "interests", length = 65535)
	public String getInterests() {
		return this.interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Column(name = "mobile_number", length = 10)
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "other_contact_numbers", length = 65535)
	public String getOtherContactNumbers() {
		return this.otherContactNumbers;
	}

	public void setOtherContactNumbers(String otherContactNumbers) {
		this.otherContactNumbers = otherContactNumbers;
	}

	@Column(name = "recruiter_type", length = 20)
	public String getRecruiterType() {
		return this.recruiterType;
	}

	public void setRecruiterType(String recruiterType) {
		this.recruiterType = recruiterType;
	}

	@Column(name = "language", length = 65535)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "address", length = 65535)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ctc")
	public Integer getCtc() {
		return this.ctc;
	}

	public void setCtc(Integer ctc) {
		this.ctc = ctc;
	}

	@Column(name = "top_institute_tier")
	public Integer getTopInstituteTier() {
		return this.topInstituteTier;
	}

	public void setTopInstituteTier(Integer topInstituteTier) {
		this.topInstituteTier = topInstituteTier;
	}

	@Column(name = "past_experience_months")
	public Integer getPastExperienceMonths() {
		return this.pastExperienceMonths;
	}

	public void setPastExperienceMonths(Integer pastExperienceMonths) {
		this.pastExperienceMonths = pastExperienceMonths;
	}

	@Column(name = "job_function", length = 200)
	public String getJobFunction() {
		return this.jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	@Column(name = "skills", length = 65535)
	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Column(name = "latest_company_name", length = 65535)
	public String getLatestCompanyName() {
		return this.latestCompanyName;
	}

	public void setLatestCompanyName(String latestCompanyName) {
		this.latestCompanyName = latestCompanyName;
	}

	@Column(name = "processed_state", length = 200)
	public String getProcessedState() {
		return this.processedState;
	}

	public void setProcessedState(String processedState) {
		this.processedState = processedState;
	}

	@Column(name = "recruiter_processed_state", length = 200)
	public String getRecruiterProcessedState() {
		return this.recruiterProcessedState;
	}

	public void setRecruiterProcessedState(String recruiterProcessedState) {
		this.recruiterProcessedState = recruiterProcessedState;
	}

	@Column(name = "industry_name", length = 200)
	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	@Column(name = "skills_found_in_work", length = 65535)
	public String getSkillsFoundInWork() {
		return this.skillsFoundInWork;
	}

	public void setSkillsFoundInWork(String skillsFoundInWork) {
		this.skillsFoundInWork = skillsFoundInWork;
	}

	@Column(name = "user_resume_link", length = 65535)
	public String getUserResumeLink() {
		return this.userResumeLink;
	}

	public void setUserResumeLink(String userResumeLink) {
		this.userResumeLink = userResumeLink;
	}

	@Column(name = "hide_ctc", nullable = false)
	public byte getHideCtc() {
		return this.hideCtc;
	}

	public void setHideCtc(byte hideCtc) {
		this.hideCtc = hideCtc;
	}

	@Column(name = "is_resume_parsed", nullable = false)
	public byte getIsResumeParsed() {
		return this.isResumeParsed;
	}

	public void setIsResumeParsed(byte isResumeParsed) {
		this.isResumeParsed = isResumeParsed;
	}

	@Column(name = "has_profile_changed", nullable = false)
	public byte getHasProfileChanged() {
		return this.hasProfileChanged;
	}

	public void setHasProfileChanged(byte hasProfileChanged) {
		this.hasProfileChanged = hasProfileChanged;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetailByExpertId")
	public Set<JobRelationshipDetail> getJobRelationshipDetailsForExpertId() {
		return this.jobRelationshipDetailsForExpertId;
	}

	public void setJobRelationshipDetailsForExpertId(
			Set<JobRelationshipDetail> jobRelationshipDetailsForExpertId) {
		this.jobRelationshipDetailsForExpertId = jobRelationshipDetailsForExpertId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserTestDetail> getUserTestDetails() {
		return this.userTestDetails;
	}

	public void setUserTestDetails(Set<UserTestDetail> userTestDetails) {
		this.userTestDetails = userTestDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserExperinceDetail> getUserExperinceDetails() {
		return this.userExperinceDetails;
	}

	public void setUserExperinceDetails(
			Set<UserExperinceDetail> userExperinceDetails) {
		this.userExperinceDetails = userExperinceDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetailByRecruiterId")
	public Set<JobRelationshipDetail> getJobRelationshipDetailsForRecruiterId() {
		return this.jobRelationshipDetailsForRecruiterId;
	}

	public void setJobRelationshipDetailsForRecruiterId(
			Set<JobRelationshipDetail> jobRelationshipDetailsForRecruiterId) {
		this.jobRelationshipDetailsForRecruiterId = jobRelationshipDetailsForRecruiterId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<JobsByUser> getJobsByUsers() {
		return this.jobsByUsers;
	}

	public void setJobsByUsers(Set<JobsByUser> jobsByUsers) {
		this.jobsByUsers = jobsByUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserEducationDetail> getUserEducationDetails() {
		return this.userEducationDetails;
	}

	public void setUserEducationDetails(
			Set<UserEducationDetail> userEducationDetails) {
		this.userEducationDetails = userEducationDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<JobDetail> getJobDetails() {
		return this.jobDetails;
	}

	public void setJobDetails(Set<JobDetail> jobDetails) {
		this.jobDetails = jobDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserCertificationDetail> getUserCertificationDetails() {
		return this.userCertificationDetails;
	}

	public void setUserCertificationDetails(
			Set<UserCertificationDetail> userCertificationDetails) {
		this.userCertificationDetails = userCertificationDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserPatentDetail> getUserPatentDetails() {
		return this.userPatentDetails;
	}

	public void setUserPatentDetails(Set<UserPatentDetail> userPatentDetails) {
		this.userPatentDetails = userPatentDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserProjectDetail> getUserProjectDetails() {
		return this.userProjectDetails;
	}

	public void setUserProjectDetails(Set<UserProjectDetail> userProjectDetails) {
		this.userProjectDetails = userProjectDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserPublicationDetail> getUserPublicationDetails() {
		return this.userPublicationDetails;
	}

	public void setUserPublicationDetails(
			Set<UserPublicationDetail> userPublicationDetails) {
		this.userPublicationDetails = userPublicationDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<JobDetail> getJobDetails_1() {
		return this.jobDetails_1;
	}

	public void setJobDetails_1(Set<JobDetail> jobDetails_1) {
		this.jobDetails_1 = jobDetails_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetailByJobseekerId")
	public Set<JobRelationshipDetail> getJobRelationshipDetailsForJobseekerId() {
		return this.jobRelationshipDetailsForJobseekerId;
	}

	public void setJobRelationshipDetailsForJobseekerId(
			Set<JobRelationshipDetail> jobRelationshipDetailsForJobseekerId) {
		this.jobRelationshipDetailsForJobseekerId = jobRelationshipDetailsForJobseekerId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserAwardDetail> getUserAwardDetails() {
		return this.userAwardDetails;
	}

	public void setUserAwardDetails(Set<UserAwardDetail> userAwardDetails) {
		this.userAwardDetails = userAwardDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserVolunteerDetail> getUserVolunteerDetails() {
		return this.userVolunteerDetails;
	}

	public void setUserVolunteerDetails(
			Set<UserVolunteerDetail> userVolunteerDetails) {
		this.userVolunteerDetails = userVolunteerDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetail")
	public Set<UserByJob> getUserByJobs() {
		return this.userByJobs;
	}

	public void setUserByJobs(Set<UserByJob> userByJobs) {
		this.userByJobs = userByJobs;
	}

}
