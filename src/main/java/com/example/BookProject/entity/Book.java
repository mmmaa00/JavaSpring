package com.example.BookProject.entity;

import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.io.Serializable;
@Component
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "idAuthor")
    private int idAuthor;

    public Book(String name, int idAuthor) {

    }

    public Book(int id, String name, int idAuthor) {
        this.id = id;
        this.name = name;
        this.idAuthor = idAuthor;
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

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + id +
                ", nameBook='" + name + '\'' +
                ", authorId=" + idAuthor +
                '}';
    }
}
