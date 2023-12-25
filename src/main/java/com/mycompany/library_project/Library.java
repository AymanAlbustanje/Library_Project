package com.mycompany.library_project;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Journal> journals;
    private List<Magazine> magazines;
    private List<Author> authors;
    private List<Book> books;
    private List<Student> students;
    private List<Loan> loans;

    public Library() {
        this.journals = new ArrayList<>();
        this.magazines =new ArrayList<>();
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Journal> getJournals() {
        return journals;
    }

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }
    
    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
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

        // Search for books
        result.append("");
        result.append(searchItemsByTitle(books, title));

        // Search for magazines
        result.append("");
        result.append(searchItemsByTitle(magazines, title));

        // Search for journals
        result.append("");
        result.append(searchItemsByTitle(journals, title));

        return result.toString();
    }
    private <T extends Display> String searchItemsByTitle(List<T> items, String title) {
        StringBuilder result = new StringBuilder();
        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                result.append(item.getInfo()).append("\n");
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
    
    public void addJournal(Journal journal) {
        journals.add(journal);
    }
    
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public void addAuthor(Author author) {
    authors.add(author);
    
}
    public Author getAuthorByName(String authorName) {
        for (Author existingAuthor : authors) {
            if (existingAuthor.getName().equalsIgnoreCase(authorName)) {
                return existingAuthor;
            }
        }
        // Handle the case where the author is not found (optional)
        return null;
    }
    
}

