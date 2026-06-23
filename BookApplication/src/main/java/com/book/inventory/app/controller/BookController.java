package com.book.inventory.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.book.inventory.app.domain.Book;
import com.book.inventory.app.repo.BookRepo;

@Controller
public class BookController {

    @Autowired
    private BookRepo repo;

    // Home Page
    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("book", new Book());
        return "addbook";
    }

    // Show Add Book Page
    @GetMapping("/addbook")
    public String showAddBook(Model model) {
        model.addAttribute("book", new Book());
        return "addbook";
    }

    // Show Update Page
    @GetMapping("/updatebook")
    public String showUpdateBook(Model model) {
        model.addAttribute("book", new Book());
        return "updatebook";
    }

    // Show Delete Page
    @GetMapping("/deletebook")
    public String showDeleteBook(Model model) {
        model.addAttribute("book", new Book());
        return "deletebook";
    }

    // Show Search Page
    @GetMapping("/search")
    public String showSearchPage(Model model) {
        model.addAttribute("book", new Book());
        return "search";
    }

    // Info Page - FIXED
    @GetMapping("/info")
    public String getInfo(Model model) {

        List<Book> books = repo.findAll();  

        long totalBooks = books.size();

        double totalBooksPrice = books.stream()
                .mapToDouble(Book::getPrice) 
                .sum();

        long totalAuthors = books.stream()
                .map(Book::getAuthor)
                .distinct()
                .count();

        model.addAttribute("totalBooks", totalBooks);
        model.addAttribute("totalBooksPrice", totalBooksPrice);
        model.addAttribute("totalAuthors", totalAuthors);
        model.addAttribute("books", books);

        return "info";
    }

    // Add Book
    @PostMapping("/addBook")
    public String saveBook(@ModelAttribute Book book, Model model) {
        try {
            repo.save(book);
            model.addAttribute("message", "Book added successfully.");
        } catch (Exception e) {
            model.addAttribute("error", "Failed to add book: " + e.getMessage());
        }
        model.addAttribute("book", new Book());
        return "addbook";
    }

    // Search Book
    @PostMapping("/searchBook")
    public String searchBook(@ModelAttribute Book book, Model model) {

        Book foundBook = repo.findByBookid(book.getBookid());

        if (foundBook != null) {
            model.addAttribute("book", foundBook);
        } else {
            model.addAttribute("book", new Book());
            model.addAttribute("error", "Book not found!");
        }

        return "search";
    }

    // Delete Book
    @PostMapping("/deleteBook")
    public String deleteBook(@ModelAttribute Book book, Model model) {

        Book deleteBook = repo.findByBookid(book.getBookid());

        if (deleteBook != null) {
            repo.delete(deleteBook);
            model.addAttribute("message", "Book Deleted Successfully");
        } else {
            model.addAttribute("error", "Book not found!");
        }

        model.addAttribute("book", new Book());
        return "deletebook";
    }
}