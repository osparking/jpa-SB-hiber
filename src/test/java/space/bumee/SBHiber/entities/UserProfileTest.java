package space.bumee.SBHiber.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;
import space.bumee.SBHiber.repos.UserProfileReop;
import space.bumee.SBHiber.repos.UserRepo;

@SpringBootTest
class UserProfileTest {
  @Autowired
  private UserRepo userRepo;
  @Autowired
  private UserProfileReop userProfileReop;
  
  @Test
  @Transactional
  public void whenSaveDerivedIdEntity_thenOk() {        
      StoreUser user = new StoreUser();
      user.setName("최");
      user = userRepo.save(user);
         
      UserProfile profile = new UserProfile();
      profile.setUser(user);
      profile = userProfileReop.save(profile);

      assertThat(profile.getProfileId()).isEqualTo(user.getId());
  }
}
