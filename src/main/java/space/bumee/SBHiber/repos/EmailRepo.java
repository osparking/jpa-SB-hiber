package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.models.Email;

public interface EmailRepo extends JpaRepository<Email, Long> {

}
