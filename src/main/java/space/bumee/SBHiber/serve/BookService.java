package space.bumee.SBHiber.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import space.bumee.SBHiber.models.Book;
import space.bumee.SBHiber.repos.BookRepository;

@Service
public class BookService {
  @Autowired
  private BookRepository bookRepository;
  
  public List<Book> list() {
    return bookRepository.findAll();
  }

}
