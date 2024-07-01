package space.bumee.SBHiber.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String street;
  private int houseNumber;
  private String city;
  private int zipCode;
  @ManyToOne(fetch = FetchType.LAZY)
  private Person person;
}
