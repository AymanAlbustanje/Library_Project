

package com.mycompany.library_project;
import java.util.List;
import java.util.Scanner;


public class Library_Project {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addLoan();
                    break;
                case 4:
                    searchBooksByTitle();
                    break;
                case 5:
                    searchBooksByNo();
                    break;
                case 6:
                    searchBooksByAuthor();
                    break;
                case 7:
                    checkBookLoans();
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n------ Library System Menu ------");
        System.out.println("1. Add a Book");
        System.out.println("2. Add a Student");
        System.out.println("3. Add a Loan");
        System.out.println("4. Search Books by Title");
        System.out.println("5. Search Books by Number");
        System.out.println("6. Search Books by Author");
        System.out.println("7. Check Book Loans");
        System.out.println("8. Exit");
    }

    private static void addBook() {
        //thats just an exxample i will remove it later to use gui
    }

    private static void addStudent() {
        //thats just an exxample i will remove it later to use gui
    }

    private static void addLoan() {
        //thats just an exxample i will remove it later to use gui
    }

    private static void searchBooksByTitle() {
        System.out.print("Enter the title to search: ");
        String title = scanner.nextLine();
        System.out.println(library.searchByTitle(title));
    }

    private static void searchBooksByNo() {
        System.out.print("Enter the book number to search: ");
        int bookNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println(library.searchByNo(bookNo));
    }

    private static void searchBooksByAuthor() {
        System.out.print("Enter the author's name to search: ");
        String authorName = scanner.nextLine();
        System.out.println(library.searchByAuthor(authorName));
    }

    private static void checkBookLoans() {
        //thats just an exxample i will remove it later to use gui
    }






















        //simple demo
        Author a1 = new Author(1,"ayman","hebron","0568248992");
        
        Book b1 = new Book("Book1", a1, 101, "Fiction", 1, "2023-01-01", false);
        
        Magazine m1 = new Magazine("Magazine1", a1, 201, "Science", 1, "2023-02-01", false, 1, "2023-01-15");
        
        Journal j1 = new Journal("Journal1", a1, 301, "Technology", 1, "2023-03-01", false, "Conference1", 1);
        
        Student st1 = new Student(201125, "alaa", "ramallah", "03-03-2002", "Computer Science");
        
        Library L1 = new Library();
        
        Loan loan1 = new Loan(st1, List.of(b1, m1, j1), "2023-02-15");
    }
