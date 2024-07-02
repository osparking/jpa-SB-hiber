package space.bumee.SBHiber.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class OrderEntryPK implements Serializable {

  private static final long serialVersionUID = 1L;
  private long orderId;
  private long productId;
}