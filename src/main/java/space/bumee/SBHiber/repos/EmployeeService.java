package space.bumee.SBHiber.repos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import space.bumee.SBHiber.models.Employee;

@Service
public class EmployeeService {
  
  @Autowired
  private EmployeeRepo employeeRepo;
  
  public Employee saveEmployee(Employee employee) {
    return employeeRepo.save(employee);
  }
  
  public Employee findEmployeeById(Long eid) {
    return employeeRepo.findById(eid).orElse(null);
  }

}
