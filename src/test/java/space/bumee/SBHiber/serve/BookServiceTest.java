package space.bumee.SBHiber.serve;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bumee.SBHiber.models.Book;

@SpringBootTest
class BookServiceTest {

  @Autowired
  private BookService bookService;
  @Test
  void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
    List<Book> books = bookService.list();
    
    Assertions.assertEquals(books.size(), 3);
  }
}
