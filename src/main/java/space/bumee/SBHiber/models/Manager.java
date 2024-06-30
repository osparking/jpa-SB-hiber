package space.bumee.SBHiber.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Manager {
  @Id
  private Long id;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "manager")
  private List<Email> emails;

}
