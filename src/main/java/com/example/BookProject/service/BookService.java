package com.example.BookProject.service;

import com.example.BookProject.entity.Book;
import com.example.BookProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository repository;

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book getById(int id) {
        try {
            return repository.getOne(id);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean create(String name, int idAuthor) {
        try{
            Book newBook = new Book(name,idAuthor);
            repository.save(newBook);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(int id) {
        try{
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(int id, String name, int idAuthor) {
        try{
            if(repository.findById(id) != null) {
                Book updateBook = new Book(name, idAuthor);
                repository.save(updateBook);
                return true;
            }
            else
                return false;
        } catch (Exception e) {
            return false;
        }
    }
}
