package hr.janko.library.repository;

import hr.janko.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByLastName(String lastName);

    List<Author> findByFirstName(String firstName);

    Optional<Author> findByFirstNameAndLastName(String firstName, String lastName);

    List<Author> findByFirstNameContainingIgnoreCase(String keyword);
}
