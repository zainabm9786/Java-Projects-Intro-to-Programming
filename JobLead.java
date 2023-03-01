public class JobLead {
    private String companyName;
    private String contactName;
    private String contactpersonPhoneNumber;
    private String jobTitle;
    private String jobDescription;

    JobLead(String companyName,String contactName, String contactpersonPhoneNumber, String jobDescription, String jobTitle){
        this.companyName=companyName;
        this.contactName=contactName;
        this.jobDescription=jobDescription;
        this.contactpersonPhoneNumber=contactpersonPhoneNumber;
        this.jobTitle=jobTitle;
    }
    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactpersonPhoneNumber() {
        return contactpersonPhoneNumber;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactpersonPhoneNumber(String contactpersonPhoneNumber) {
        this.contactpersonPhoneNumber = contactpersonPhoneNumber;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "JobLead{" +
                "companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactpersonPhoneNumber='" + contactpersonPhoneNumber + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
