package space.bumee.SBHiber.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BuyItem {
  @Id
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "customer_id", referencedColumnName = "customerId"),
      @JoinColumn(name = "visit_sn", referencedColumnName = "visitSn")
  })
  private Cart cart;
}
