package AimsProject.hust.soict.dsai.aims.compactDisc;

import AimsProject.hust.soict.dsai.aims.playable.Playable;

import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {
        this.title = "";
        this.length = 0;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength() + " minutes");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Track track = (Track) obj;
        return length == track.length && Objects.equals(title, track.title);
    }

}