package com.example.BookProject.entity;

import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.io.Serializable;
@Component
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    public Author() {

    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + id +
                ", nameBook='" + name + '\'' +
                '}';
    }
}
