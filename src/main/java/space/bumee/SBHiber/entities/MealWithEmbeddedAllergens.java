package space.bumee.SBHiber.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "meal")
@SecondaryTable(name = "allergens", 
    pkJoinColumns = @PrimaryKeyJoinColumn(name = "meal_id"))
@Data
public class MealWithEmbeddedAllergens {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Long id;

  @Column(name = "name")
  String name;

  @Column(name = "description")
  String description;

  @Column(name = "price")
  BigDecimal price;

  @Embedded
  AllergensAsEmbeddable allergens;
}

@Embeddable
class AllergensAsEmbeddable {

  @Column(name = "peanuts", table = "allergens")
  boolean peanuts;

  @Column(name = "celery", table = "allergens")
  boolean celery;

  @Column(name = "sesame_seeds", table = "allergens")
  boolean sesameSeeds;
}