package zzz;

import java.util.*;
import java.time.LocalDate;

class Book {
    String ISBN;
    String title;
    String author;
    boolean isAvailable;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}

class Member {
    int memberId;
    String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}

class LendingTransaction {
    String ISBN;
    int memberId;
    LocalDate borrowDate;
    LocalDate dueDate;
    LocalDate returnDate;

    public LendingTransaction(String ISBN, int memberId, LocalDate borrowDate) {
        this.ISBN = ISBN;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(14);
    }
}

public class lib {
    private static List<Book> books = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    private static List<LendingTransaction> transactions = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main method remains unchanged
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Remove Book");
            System.out.println("4. Remove Member");
            System.out.println("5. Search Book");
            System.out.println("6. Search Member");
            System.out.println("7. Display Book Names");
            System.out.println("8. Display Member Names");
            System.out.println("9. Lend Book");
            System.out.println("10. Return Book");
            System.out.println("11. View Lending Information");
            System.out.println("12. Display Overdue Books");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: addBook(); break;
                case 2: registerMember(); break;
                case 3: removeBook(); break;
                case 4: removeMember(); break;
                case 5: searchBook(); break;
                case 6: searchMember(); break;
                case 7: displayBookNames(); break;
                case 8: displayMemberNames(); break;
                case 9: lendBook(); break;
                case 10: returnBook(); break;
                case 11: viewLendingInformation(); break;
                case 12: displayOverdueBooks(); break;
                case 13: System.exit(0);
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        // This method remains unchanged
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        books.add(new Book(isbn, title, author));
        System.out.println("Book added successfully.");
    }

    private static void registerMember() {
        // This method remains unchanged
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        members.add(new Member(memberId, name));
        System.out.println("Member registered successfully.");
    }

    private static void removeBook() {
        System.out.print("Enter ISBN of book to remove: ");
        String isbn = scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void removeMember() {
        System.out.print("Enter Member ID to remove: ");
        int memberId = scanner.nextInt();
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).memberId == memberId) {
                members.remove(i);
                System.out.println("Member removed successfully.");
                return;
            }
        }
        System.out.println("Member not found.");
    }

    private static void searchBook() {
        System.out.print("Enter ISBN to search: ");
        String isbn = scanner.nextLine();
        for (Book book : books) {
            if (book.ISBN.equals(isbn)) {
                System.out.println("Title: " + book.title + ", Author: " + book.author + ", Available: " + book.isAvailable);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void searchMember() {
        System.out.print("Enter Member ID to search: ");
        int memberId = scanner.nextInt();
        for (Member member : members) {
            if (member.memberId == memberId) {
                System.out.println("Name: " + member.name);
                return;
            }
        }
        System.out.println("Member not found.");
    }

    private static void displayBookNames() {
        for (Book book : books) {
            System.out.println(book.title);
        }
    }

    private static void displayMemberNames() {
        for (Member member : members) {
            System.out.println(member.name);
        }
    }

    private static void lendBook() {
        System.out.print("Enter ISBN of book to lend: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();

        Book book = null;
        Member member = null;

        for (Book b : books) {
            if (b.ISBN.equals(isbn) && b.isAvailable) {
                book = b;
                break;
            }
        }

        for (Member m : members) {
            if (m.memberId == memberId) {
                member = m;
                break;
            }
        }

        if (book != null && member != null) {
            book.isAvailable = false;
            transactions.add(new LendingTransaction(isbn, memberId, LocalDate.now()));
            System.out.println("Book lent successfully.");
        } else {
            System.out.println("Unable to lend book. Please check book availability and member information.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter ISBN of book to return: ");
        String isbn = scanner.nextLine();

        LendingTransaction transaction = null;
        for (LendingTransaction t : transactions) {
            if (t.ISBN.equals(isbn) && t.returnDate == null) {
                transaction = t;
                break;
            }
        }

        if (transaction != null) {
            transaction.returnDate = LocalDate.now();
            for (Book b : books) {
                if (b.ISBN.equals(isbn)) {
                    b.isAvailable = true;
                    break;
                }
            }
            System.out.println("Book returned successfully.");

            int fine = calculateFine(transaction.dueDate, transaction.returnDate);
            if (fine > 0) {
                System.out.println("Fine: Rs. " + fine);
            }
        } else {
            System.out.println("No matching lending record found.");
        }
    }

    private static void viewLendingInformation() {
        for (LendingTransaction t : transactions) {
            System.out.println("ISBN: " + t.ISBN + ", Member ID: " + t.memberId +
                               ", Borrow Date: " + t.borrowDate + ", Due Date: " + t.dueDate +
                               ", Return Date: " + (t.returnDate != null ? t.returnDate : "Not returned"));
        }
    }

    private static void displayOverdueBooks() {
        LocalDate today = LocalDate.now();
        for (LendingTransaction t : transactions) {
            if (t.returnDate == null && t.dueDate.isBefore(today)) {
                Book book = null;
                Member member = null;

                for (Book b : books) {
                    if (b.ISBN.equals(t.ISBN)) {
                        book = b;
                        break;
                    }
                }

                for (Member m : members) {
                    if (m.memberId == t.memberId) {
                        member = m;
                        break;
                    }
                }

                System.out.println("Overdue Book: " + (book != null ? book.title : "Unknown") +
                                   ", Borrower: " + (member != null ? member.name : "Unknown") +
                                   ", Due Date: " + t.dueDate);
            }
        }
    }

    private static int calculateFine(LocalDate dueDate, LocalDate returnDate) {
        // This method remains unchanged
        long daysOverdue = returnDate.toEpochDay() - dueDate.toEpochDay();
        if (daysOverdue <= 0) return 0;

        int fine = 0;
        if (daysOverdue <= 7) {
            fine = (int) (daysOverdue * 50);
        } else {
            fine = 7 * 50 + (int) ((daysOverdue - 7) * 100);
        }
        return fine;
    }
}