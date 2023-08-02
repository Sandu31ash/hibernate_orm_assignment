package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {

    @Id
    private String aId;
    private String name;
    private String nationality;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author(String name, String nationality,String aId,List<Book> books) {
        this.aId = aId;
        this.name = name;
        this.nationality = nationality;
        this.books = books;
    }

    public Author(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAId() {
        return aId;
    }

    public void setAId(String aId) {
        this.aId = aId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

