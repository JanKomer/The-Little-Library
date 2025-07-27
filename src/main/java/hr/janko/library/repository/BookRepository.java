package hr.janko.library.repository;

import hr.janko.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    List<Book> findByAuthorId(Long authorId);

    List<Book> findByPublisherId(Long publisherId);

    List<Book> findByTitleContainingIgnoreCase(String keyword);
}
