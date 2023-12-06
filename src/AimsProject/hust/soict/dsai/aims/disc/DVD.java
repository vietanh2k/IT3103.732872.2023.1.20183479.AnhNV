package AimsProject.hust.soict.dsai.aims.disc;

import AimsProject.hust.soict.dsai.aims.compactDisc.Disc;
import AimsProject.hust.soict.dsai.aims.playable.Playable;

public class DVD extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;
    private int id = 0;

    public DVD(){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DVD(String title){
        super(++nbDigitalVideoDiscs, title, "", 0,0, "");
        this.id = nbDigitalVideoDiscs;

    }

    public int getId() {
        return id;
    }

    public DVD(String title, String category, float cost) {
        super(0, title, category, cost, 0, "");
    }

    public DVD(String title, String category, String director, int length, float cost) {
        super(0, title, category, cost, length, director);

    }
    @Override
    public String toString() {
        return "DigitalVideoDisc [title=" + this.getTitle() + ", category=" + this.getCategory() + ", director=" + this.getLength() + ", length="
                + this.getDirector() + ", cost=" + this.getCost() + "]";
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
