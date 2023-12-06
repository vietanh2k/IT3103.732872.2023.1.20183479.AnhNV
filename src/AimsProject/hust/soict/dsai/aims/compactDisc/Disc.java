package AimsProject.hust.soict.dsai.aims.compactDisc;

import AimsProject.hust.soict.dsai.aims.media.Media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
        this.length = 0;
        this.director = "";
    }

    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
