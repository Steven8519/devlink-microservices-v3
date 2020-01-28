package info.devlink.core.api.core.recruiter;

public class Recruiter {
    private final int developerId;
    private final int recruiterId;
    private final String recruiterName;
    private final String companyWorkFor;
    private final String serviceAddress;

    public Recruiter() {
        developerId = 0;
        recruiterId = 0;
        recruiterName = null;
        companyWorkFor = null;
        serviceAddress = null;
    }

    public Recruiter(int developerId, int recruiterId, String recruiterName, String companyWorkFor, String serviceAddress) {
        this.developerId = developerId;
        this.recruiterId = recruiterId;
        this.recruiterName = recruiterName;
        this.companyWorkFor = companyWorkFor;
        this.serviceAddress = serviceAddress;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public int getRecruiterId() {
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
