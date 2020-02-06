package info.devlink.core.api.core.developer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Developer {
    private int developerId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private int companyNumber;
    private String serviceAddress;

    public Developer() {
        developerId = 0;
        firstName = null;
        lastName = null;
        jobTitle = null;
        companyNumber = 0;
        serviceAddress = null;
    }
}
