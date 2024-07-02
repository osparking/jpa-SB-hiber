package space.bumee.SBHiber.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@IdClass(OrderEntryPK.class)
public class OrderEntry {
  @Id
  private long orderId;
  @Id
  private long productId;
  private int itemCount;
  @ManyToOne
  private Person person;
}
