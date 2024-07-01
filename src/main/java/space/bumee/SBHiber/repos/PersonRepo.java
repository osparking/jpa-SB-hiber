package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.entities.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
