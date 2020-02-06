package info.devlink.core.recruiterservice.persistence;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "recruiters")
@CompoundIndex(name = "prod-rec-id", unique = true, def = "{'developerId': 1, 'recruiterId' : 1}")
public class RecruiterEntity {

    @Id
    private String id;

    @Version
    private Integer version;
    private int recruiterId;
    private int developerId;
    private String  name;
    private String companyWorkFor;
    private String serviceAddress;

}
