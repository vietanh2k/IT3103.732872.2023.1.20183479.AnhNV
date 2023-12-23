package AimsProject.hust.soict.dsai.aims.compactDisc;

import AimsProject.hust.soict.dsai.aims.media.Media;
import AimsProject.hust.soict.dsai.aims.playable.Playable;
import GuiProject.hust.soict.dsai.PlayerException;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc() {
        super();
        this.artist = "";
        this.tracks = new ArrayList<>();
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track " + track.getTitle() + " is already in the list of tracks.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track " + track.getTitle() + " does not exist in the list of tracks.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        if(this.getLength() > 0){
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD artist: " + this.getArtist());
            System.out.println("Total CD length: " + this.getLength() + " minutes");

            for (Track track : tracks) {
                track.play();
            }

            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()){
                nextTrack = (Track) iter.next();
                try{
                    nextTrack.play();
                }catch (PlayerException e){
                    throw e;
                }
            }
        }else{
            throw new PlayerException("error");
        }

    }
}
