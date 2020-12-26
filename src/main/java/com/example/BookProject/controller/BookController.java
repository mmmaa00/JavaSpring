package com.example.BookProject.controller;

import com.example.BookProject.entity.Book;
import com.example.BookProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BookController")
public class BookController {
    @Autowired
    BookService service;

    @GetMapping("/getAll")
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public Book getById(@RequestParam int id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public boolean update(@RequestParam int id, @RequestParam String name, @RequestParam int idAuthor) {
        return service.update(id, name, idAuthor);
    }

    @PostMapping("/add")
    public boolean add(@RequestParam String name, @RequestParam int idAuthor) {
        return service.create(name, idAuthor);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@RequestParam int id) {
        return service.delete(id);
    }
}
