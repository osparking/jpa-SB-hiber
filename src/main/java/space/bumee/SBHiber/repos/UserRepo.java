package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.entities.StoreUser;

public interface UserRepo extends JpaRepository<StoreUser, Long>{

}
