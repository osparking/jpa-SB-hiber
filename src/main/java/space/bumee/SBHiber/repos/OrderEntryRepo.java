package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.entities.OrderEntry;
import space.bumee.SBHiber.entities.OrderEntryPK;

public interface OrderEntryRepo
    extends JpaRepository<OrderEntry, OrderEntryPK> {

}
