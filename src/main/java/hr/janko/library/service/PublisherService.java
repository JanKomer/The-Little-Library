package hr.janko.library.service;

import hr.janko.library.model.Author;
import hr.janko.library.model.Publisher;
import hr.janko.library.repository.AuthorRepository;
import hr.janko.library.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public void addSamplePublishers() {
        Publisher p1 = new Publisher();
        p1.setName("Penguin Books");

        Publisher p2 = new Publisher();
        p2.setName("Bloomsbury Publishing");

        publisherRepository.saveAll(List.of(p1, p2));
    }
}
