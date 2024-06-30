package space.bumee.SBHiber.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Office {
  @Id
  private Long id;
  
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "addressId")
  private Address address;
}
