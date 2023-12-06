package AimsProject.hust.soict.dsai.aims.book;

import AimsProject.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors;

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.authors = new ArrayList<>();
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", "Programming", 29.99f);
        book.addAuthor("John Doe");
        book.addAuthor("Jane Smith");

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Authors: " + book.getAuthors());

        book.removeAuthor("John Doe");
        System.out.println("Authors after removal: " + book.getAuthors());
    }
}
