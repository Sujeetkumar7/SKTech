package com.sktech.services;

import com.sktech.model.Book;
import com.sktech.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(int bookId){
        Optional<Book> book = bookRepository.findById(bookId);
        if(book.isPresent()){
            return book.get();
        }else{
            System.out.println("Book Detail not found");
            return new Book();
        }
    }

    public Book save(Book book){
        bookRepository.save(book);
        return book;
    }

    public void deleteById(int bookId){
        bookRepository.deleteById(bookId);
    }
    public Book update(Book book){
        Book updatedBook = bookRepository.findById(book.getBookId()).get();
        updatedBook.setBookId(book.getBookId());
        updatedBook.setBookName(book.getBookName());
        updatedBook.setAuthor(book.getAuthor());
        bookRepository.save(updatedBook);
        return updatedBook;
    }
}
