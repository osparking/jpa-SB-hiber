package space.bumee.SBHiber.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bumee.SBHiber.repos.StudentRepo;

@SpringBootTest
class StudentTest {
  @Autowired
  private StudentRepo studentRepo;

  @Test
  void ifStudentCreatedThenAutoUUIDCreated() {
    var st = new Student();
    st.setName("이");
    st = studentRepo.save(st);
    var st2 = new Student();
    st2.setName("김");
    st2 = studentRepo.save(st2);
    var stList = studentRepo.findAll();
    assertEquals(2, stList.size());
  }
}
