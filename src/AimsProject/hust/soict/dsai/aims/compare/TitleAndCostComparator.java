package AimsProject.hust.soict.dsai.aims.compare;

import AimsProject.hust.soict.dsai.aims.media.Media;

import java.util.Comparator;

public class TitleAndCostComparator implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        return (titleComparison != 0) ? titleComparison : Float.compare(media2.getCost(), media1.getCost());
    }
}
