package info.devlink.core.api.core.recruiter;

public class Recruiter {
    private final String developerId;
    private final String recruiterId;
    private final String recruiterName;
    private final String companyWorkFor;
    private final String serviceAddress;

    public Recruiter() {
        developerId = null;
        recruiterId = null;
        recruiterName = null;
        companyWorkFor = null;
        serviceAddress = null;
    }

    public Recruiter(String developerId, String recruiterId, String recruiterName, String companyWorkFor, String serviceAddress) {
        this.developerId = developerId;
        this.recruiterId = recruiterId;
        this.recruiterName = recruiterName;
        this.companyWorkFor = companyWorkFor;
        this.serviceAddress = serviceAddress;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public String getRecruiterId() {
        return recruiterId;
    }

    public String getRecruiterName() {
        return recruiterName;
    }

    public String getCompanyWorkFor() {
        return companyWorkFor;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

}
