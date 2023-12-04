/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

import java.util.List;

public class Loan {
    private Student student;
    private List<Book> books;
    private String dueDate;

    public Loan(Student student, List<Book> books, String dueDate) {
        this.student = student;
        this.books = books;
        this.dueDate = dueDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    @Override
    public String toString() {
        return "Loan{" +
                "student=" + student +
                ", books=" + books +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}

