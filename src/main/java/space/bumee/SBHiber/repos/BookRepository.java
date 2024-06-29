package space.bumee.SBHiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import space.bumee.SBHiber.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
