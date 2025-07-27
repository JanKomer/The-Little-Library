package hr.janko.library;

import hr.janko.library.service.AuthorService;
import hr.janko.library.service.BookService;
import hr.janko.library.service.PublisherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(AuthorService authorService, PublisherService publisherService, BookService bookService) {
        return args -> {
            authorService.addSampleAuthors();
            publisherService.addSamplePublishers();
            bookService.addSampleBooks();
        };
    }

}
