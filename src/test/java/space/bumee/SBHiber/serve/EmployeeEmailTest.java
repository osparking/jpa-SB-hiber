package space.bumee.SBHiber.serve;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;
import space.bumee.SBHiber.models.Email;
import space.bumee.SBHiber.models.Employee;
import space.bumee.SBHiber.repos.EmployeeService;

@SpringBootTest
class EmployeeEmailTest {
  @Autowired
  private EmployeeService employeeService;
  @Autowired
  private EmailService emailService;

  @Test
  @Transactional
  void testEmployeeWith1EmailReadsEmailListWell() {
    var employee = employeeService.saveEmployee(new Employee());
    var email = new Email();
    
    employee.getEmails().add(email);
    email.setEmployee(employee);
    email = emailService.saveEmail(email);
   
    employee = employeeService.findEmployeeById(employee.getId());
    assertEquals(1, employee.getEmails().size());
  }

}
