package com.mycompany.library_project;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Student> students;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public String searchByTitle(String title) {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.append(book.getInfo()).append("\n");
            }
        }
        return result.toString();
    }

    public String searchByNo(int bookNo) {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            if (book.getNo() == bookNo) {
                result.append(book.getInfo()).append("\n");
            }
        }
        return result.toString();
    }

    public String searchByAuthor(String authorName) {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                result.append(book.getInfo()).append("\n");
            }
        }
        return result.toString();
    }

    public String checkBookLoans(Book book) {
        StringBuilder result = new StringBuilder();
        for (Loan loan : loans) {
            if (loan.getBooks().contains(book)) {
                result.append(loan.toString()).append("\n");
            }
        }
        return result.toString();
    }
}

