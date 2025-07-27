package hr.janko.library.service;

import hr.janko.library.model.Author;
import hr.janko.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addSampleAuthors() {
        Author a1 = new Author();
        a1.setFirstName("George");
        a1.setLastName("Orwell");

        Author a2 = new Author();
        a2.setFirstName("Jane");
        a2.setLastName("Austen");

        Author a3 = new Author();
        a3.setFirstName("J.K.");
        a3.setLastName("Rowling");

        authorRepository.saveAll(List.of(a1, a2, a3));
    }
}
