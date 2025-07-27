package hr.janko.library.service;

import hr.janko.library.model.Author;
import hr.janko.library.model.Book;
import hr.janko.library.model.Publisher;
import hr.janko.library.repository.AuthorRepository;
import hr.janko.library.repository.BookRepository;
import hr.janko.library.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookService(BookRepository bookRepository, PublisherRepository publisherRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
    }

    public void addSampleBooks() {
        Book b1 = new Book();
        b1.setIsbn("9781784879006");
        b1.setTitle("Homage to Catalonia");
        b1.setPageCount(288);
        b1.setAuthor(authorRepository.findByFirstNameAndLastName("George", "Orwell").get());
        b1.setPublisher(publisherRepository.findByName("Penguin Books").get());

        Book b2 = new Book();
        b2.setIsbn("9780141439518");
        b2.setTitle("Pride and Prejudice");
        b2.setPageCount(480);
        b2.setAuthor(authorRepository.findByFirstNameAndLastName("Jane", "Austen").get());
        b2.setPublisher(publisherRepository.findByName("Penguin Books").get());

        Book b3 = new Book();
        b3.setIsbn("9780747532743");
        b3.setTitle("Harry Potter and the Philosopher's Stone");
        b3.setPageCount(223);
        b3.setAuthor(authorRepository.findByFirstNameAndLastName("J.K.", "Rowling").get());
        b3.setPublisher(publisherRepository.findByName("Bloomsbury Publishing").get());

        Book b4 = new Book();
        b4.setIsbn("9780747538493");
        b4.setTitle("Harry Potter and the Chamber of Secrets");
        b4.setPageCount(251);
        b4.setAuthor(authorRepository.findByFirstNameAndLastName("J.K.", "Rowling").get());
        b4.setPublisher(publisherRepository.findByName("Bloomsbury Publishing").get());

        Book b5 = new Book();
        b5.setIsbn("9780141187761");
        b5.setTitle("1984");
        b5.setPageCount(328);
        b5.setAuthor(authorRepository.findByFirstNameAndLastName("George", "Orwell").get());
        b5.setPublisher(publisherRepository.findByName("Penguin Books").get());

        Book b6 = new Book();
        b6.setIsbn("9780141439607");
        b6.setTitle("Emma");
        b6.setPageCount(544);
        b6.setAuthor(authorRepository.findByFirstNameAndLastName("Jane", "Austen").get());
        b6.setPublisher(publisherRepository.findByName("Penguin Books").get());


        bookRepository.saveAll(List.of(b1, b2, b3, b4, b5, b6));
    }
}
