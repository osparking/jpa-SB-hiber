package space.bumee.SBHiber.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bumee.SBHiber.repos.OrderEntryRepo;

@SpringBootTest
class OrderEntryTest {
  
  @Autowired
  private OrderEntryRepo orderEntryRepo;

  @Test
  public void whenSaveCompositeIdEntity_thenOk() {
    OrderEntryPK entryPK = new OrderEntryPK();
    entryPK.setOrderId(1L);
    entryPK.setProductId(30L);

    OrderEntry entry = new OrderEntry();
    entry.setEntryId(entryPK);
    orderEntryRepo.save(entry);

    assertThat(entry.getEntryId().getOrderId()).isEqualTo(1L);
  }

}
