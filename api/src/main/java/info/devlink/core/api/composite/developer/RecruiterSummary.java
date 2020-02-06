package info.devlink.core.api.composite.developer;

public class RecruiterSummary {
    private final int recruiterId;
    private final String  recruiterName;
    private final String companyName;

    public RecruiterSummary() {
        recruiterId = 0;
        recruiterName = null;
        companyName = null;
    }

    public RecruiterSummary(int recruiterId, String recruiterName, String companyName) {
        this.recruiterId = recruiterId;
        this.recruiterName = recruiterName;
        this.companyName = companyName;
    }


    public String getRecruiterName() {
        return recruiterName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getRecruiterId() {
        return recruiterId;
    }


}
