/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

public class Book implements Display {
    public String title;
    private Author author;
    private int no;
    private String genre;
    private int version;
    private String date;
    private boolean onLoan;

    public Book(String title, Author author, int no, String genre, int version, String date, boolean onLoan) {
        this.title = title;
        this.author = author;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.date = date;
        this.onLoan = onLoan;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    

    @Override
    public String getInfo() {
        return String.format("Book Information:%nTitle: %s%nAuthor: %s%nNumber: %d%nGenre: %s%nVersion: %d%nDate: %s%nOn Loan: %b",
                title, author, no, genre, version, date, onLoan);
    }
    

    @Override
    public boolean inLoan() {
        return onLoan;
    }
}

