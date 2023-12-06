package AimsProject.hust.soict.dsai.aims.store;

import AimsProject.hust.soict.dsai.aims.disc.DVD;
import AimsProject.hust.soict.dsai.aims.media.Media;

public class Store {
    public static final int MAX_NUMBERS = 999;
    private final Media[] itemsInStore = new Media[MAX_NUMBERS];
    int qtyOrdered;

    public boolean checkFull() {
        if (qtyOrdered < 20) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkExist(Media media) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInStore[i].equals(media)) {
                return true;
            }
        }
        return false;
    }

    public void addMedia(Media media) {
        if (!checkFull()) {
            itemsInStore[qtyOrdered] = media;
            System.out.println("Object added successfully.");
            qtyOrdered++;
        } else {
            System.out.println("The store is full.");
        }
    }

    public Media search(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInStore[i].getTitle().equals(title)) {
                return itemsInStore[i];
            }
        }

        return null;
    }

    public void removeMedia(Media media) {
        if (qtyOrdered == 0) {
            System.out.println("The store is empty. Can not remove any object.");
        } else {
            if (checkExist(media) && qtyOrdered > 1) {
                for (int i = 0; i < qtyOrdered - 1; i++) {
                    int j = i + 1;
                    Media temp = itemsInStore[i];
                    itemsInStore[i] = itemsInStore[j];
                    itemsInStore[j] = temp;

                }
                qtyOrdered--;
                System.out.println("Remove successfully.");
            } else if (checkExist(media)) {
                qtyOrdered--;
                System.out.println("Remove successfully.");
            } else {
                System.out.println("There is no object matching the object you want to delete.");
            }
        }
    }

}
