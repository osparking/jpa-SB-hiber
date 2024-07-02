package space.bumee.SBHiber.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
  @Id
  @StudId
  private Long studentId;
  
  private String name;

}
