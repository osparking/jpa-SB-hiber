package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bumee.SBHiber.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
