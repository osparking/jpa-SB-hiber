package space.bumee.SBHiber.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "BOOK")
@Data
public class Book {
  @Id
  @GeneratedValue
  private Long id;
  private String name;

}
