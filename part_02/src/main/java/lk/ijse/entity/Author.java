package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    private String aId;
    private String name;
    private String nationality;

    public Author(String name, String nationality,String aId) {
        this.aId = aId;
        this.name = name;
        this.nationality = nationality;
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
}

