package in.glootech.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderItem {
    @Id
    private String orderItemId;
    
    // Define composite primary key
    private String orderId;
    private String orderItemSeqId;
    
    private String productId;
    private String itemDescription;
    private BigDecimal quantity;
    private BigDecimal unitAmount;
    private String itemTypeEnumId;
    
    @ManyToOne
    @JoinColumn(name = "orderId", insertable = false, updatable = false)
    private OrderHeader orderHeader;
    
    @ManyToOne
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;
}




