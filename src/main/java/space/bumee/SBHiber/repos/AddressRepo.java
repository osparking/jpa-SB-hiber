package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.entities.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
