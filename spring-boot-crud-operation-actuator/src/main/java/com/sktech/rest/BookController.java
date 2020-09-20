package com.sktech.rest;

import com.sktech.model.Book;
import com.sktech.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    //getBooks
    @GetMapping(value = "/books")
    public List<Book> getBooks(){
        return bookService.getAllBook();
    }
    //getBookById
    @GetMapping(value = "/books/{bookId}")
    public Book getBookById(@PathVariable int bookId){
        return bookService.getBookById(bookId);
    }
    //saveBook
    @PostMapping(value = "/book")
    public Book saveBook(@RequestBody Book book){
       return bookService.save(book);
    }
    //deleteBook
    @DeleteMapping(value = "/book/{bookId}")
    public  void deleteBookById(@PathVariable int bookId){
     bookService.deleteById(bookId);
    }
    //updateBook
    @PutMapping(value = "/book")
    public Book updateBook(@RequestBody Book book){
        return bookService.update(book);
    }
}
