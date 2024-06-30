package space.bumee.SBHiber.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cart {
  @Id
  private String customerId;

  @Id
  private int visitSn; // 방문차수, 고객별 증가번호.

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "cart")
  private List<BuyItem> buyItems;
}
