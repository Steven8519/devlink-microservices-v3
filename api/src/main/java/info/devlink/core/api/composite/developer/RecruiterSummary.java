package info.devlink.core.api.composite.developer;

public class RecruiterSummary {
    private final int recruiterId;
    private final String recruiterInfo;

    public RecruiterSummary(int recruiterId, String recruiterInfo) {
        this.recruiterId = recruiterId;
        this.recruiterInfo = recruiterInfo;
    }

    public int getRecruiterId() {
        return recruiterId;
    }

    public String getRecruiterInfo() {
        return recruiterInfo;
    }



}
