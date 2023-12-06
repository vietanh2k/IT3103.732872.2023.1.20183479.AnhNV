package AimsProject.hust.soict.dsai.aims.compare;

import AimsProject.hust.soict.dsai.aims.media.Media;

import java.util.Comparator;

public class CostAndTitleComparator implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int costComparison = Float.compare(media2.getCost(), media1.getCost());

        return (costComparison != 0) ? costComparison : media1.getTitle().compareTo(media2.getTitle());
    }
}
