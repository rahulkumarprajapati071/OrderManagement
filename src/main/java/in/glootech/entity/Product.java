package in.glootech.entity;

import java.util.List;

import javax.print.event.PrintJobAttributeEvent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    private String productId;
    private String partyId;
    private String productName;
    private String description;
    private Character chargeShipping;
    private Character returnable;
    
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}


