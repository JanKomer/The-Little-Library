package hr.janko.library.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "publisher", orphanRemoval = true)
    private List<Book> books;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
