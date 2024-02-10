package in.glootech.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Party {
    @Id
    private String partyId;
    private String partyEnumTypeId;
    
    @OneToOne
    @JoinColumn(name = "partyId")
    private Person person;
    
    @OneToMany(mappedBy = "party")
    private List<OrderHeader> orderHeaders;
}


