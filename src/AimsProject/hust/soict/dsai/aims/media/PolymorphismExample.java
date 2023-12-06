package AimsProject.hust.soict.dsai.aims.media;

import AimsProject.hust.soict.dsai.aims.book.Book;
import AimsProject.hust.soict.dsai.aims.compactDisc.CompactDisc;
import AimsProject.hust.soict.dsai.aims.disc.DVD;

import java.util.ArrayList;

public class PolymorphismExample {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();

        Book book = new Book(1, "The Catcher in the Rye", "Fiction", 15.99f);
        DVD dvd = new DVD( "The Matrix", "Science Fiction", "The Wachowskis", 120, 19.99f);
        CompactDisc cd = new CompactDisc(3, "Greatest Hits", "Music", 15.99f, 60, "Various Artists", "Artist Name");

        mediaList.add(book);
        mediaList.add(dvd);
        mediaList.add(cd);

        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}