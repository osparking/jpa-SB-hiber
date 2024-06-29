package space.bumee.SBHiber.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {
  
  @Id
  @Column(name = "user_id")
  private Long id;
  
  @OneToOne
  @MapsId
  @JoinColumn(name = "user_id")
  private User user;
}
