package space.bumee.SBHiber.serve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import space.bumee.SBHiber.models.Email;
import space.bumee.SBHiber.repos.EmailRepo;

@Service
public class EmailService {
  
  @Autowired
  private EmailRepo emailRepo;
  
  public Email saveEmail(Email email) {
    return emailRepo.save(email);
  }

}
