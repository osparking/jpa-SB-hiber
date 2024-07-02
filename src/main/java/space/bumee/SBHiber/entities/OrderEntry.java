package space.bumee.SBHiber.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class OrderEntry {
  @EmbeddedId
  private OrderEntryPK entryId;
  private int itemCount;
}
