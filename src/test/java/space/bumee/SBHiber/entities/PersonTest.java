package space.bumee.SBHiber.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bumee.SBHiber.repos.AddressRepo;
import space.bumee.SBHiber.repos.PersonRepo;

@SpringBootTest
class PersonTest {

  @Autowired
  private PersonRepo personRepo;

  @Autowired
  private AddressRepo addressRepo;

  @Test
  void test() {
    var p = new Person();
    p.setName("김");
    p.setId(1);
    personRepo.save(p);
    
    var a = new Address();
    a.setId(1);
    a.setHouseNumber(1);
    a.setZipCode(12345);
    a.setPerson(p);
    addressRepo.save(a);

    personRepo.deleteById(1);
    assertEquals(0, addressRepo.count());
  }

}
