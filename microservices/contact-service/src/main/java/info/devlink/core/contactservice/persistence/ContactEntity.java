package info.devlink.core.contactservice.persistence;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contacts", indexes = { @Index(name = "contacts_unique_idx", unique = true, columnList = "developerId, contactId") })
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version
    private int version;
    private int developerId;
    private int recruiterId;
    private int contactId;
    private String email;
    private String phoneNumber;
    private String serviceAddress;

}
