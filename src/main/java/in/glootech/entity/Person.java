package in.glootech.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    private String partyId;
    private String firstName;
    private String middleName;
    private String lastName;
    private Character gender;
    private LocalDate birthDate;
    private String maritalStatusEnumId;
    private String employmentStatusEnumId;
    private String occupation;
    
    @OneToOne(mappedBy = "person")
    private Party party;
}


