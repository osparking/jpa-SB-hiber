package space.bumee.SBHiber.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "allergens")
@Data
class AllergensAsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    Long mealId;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "meal_id")
    Meal meal;

    @Column(name = "peanuts")
    boolean peanuts;

    @Column(name = "celery")
    boolean celery;

    @Column(name = "sesame_seeds")
    boolean sesameSeeds;
}