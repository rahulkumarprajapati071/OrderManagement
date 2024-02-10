package in.glootech.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderHeader {
    @Id
    private String orderId;
    private String orderName;
    private LocalDateTime placedDate;
    private LocalDateTime approvedDate;
    private String statusId;
    private String currencyUomId;
    private String productStoreId;
    private String salesChannelEnumId;
    private BigDecimal grandTotal;
    private LocalDateTime completedDate;
    
    @ManyToOne
    @JoinColumn(name = "partyId", insertable = false, updatable = false)
    private Party party;
}


