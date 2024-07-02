package space.bumee.SBHiber.repos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.entities.Student;

public interface StudentRepo extends JpaRepository<Student, UUID>{

}
