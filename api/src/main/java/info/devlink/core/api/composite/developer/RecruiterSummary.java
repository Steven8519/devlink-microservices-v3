package info.devlink.core.api.composite.developer;

public class RecruiterSummary {
    private final String recruiterId;
    private final String recruiterInfo;

    public RecruiterSummary(String recruiterId, String recruiterInfo) {
        this.recruiterId = recruiterId;
        this.recruiterInfo = recruiterInfo;
    }

    public String getRecruiterId() {
        return recruiterId;
    }

    public String getRecruiterInfo() {
        return recruiterInfo;
    }



}
