package space.bumee.SBHiber.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class UserProfile {
  @Id
  private Long profileId;
  
  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  private StoreUser user;
}
