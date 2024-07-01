package space.bumee.SBHiber.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long studentId;
  
  private String name;

}
