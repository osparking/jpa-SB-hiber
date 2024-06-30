package space.bumee.SBHiber.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
  private List<Email> emails;
  
  private String ename;

  @OneToOne(cascade = CascadeType.ALL)
  // @formatter:off
  @JoinTable(name = "emp_ws", 
      joinColumns = {
          @JoinColumn(name = "emp_id", referencedColumnName = "id") }, 
      inverseJoinColumns = {
          @JoinColumn(name = "ws_id", referencedColumnName = "id") }
  )
  // @formatter:on
  private WorkStation workStation;

}