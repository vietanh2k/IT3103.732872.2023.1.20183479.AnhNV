package AimsProject.hust.soict.dsai.aims.cart;

import AimsProject.hust.soict.dsai.aims.disc.DVD;
import AimsProject.hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final Media[] itemsOrdered = new Media[MAX_NUMBERS_ORDERED];
    int qtyOrdered;
    int targetId;
    float myTotalCost = 0;

    public boolean checkFull() {
        if (qtyOrdered < 20) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkExist(DVD disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                targetId = i;
                return true;
            }
        }
        return false;
    }

    public Media search(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                return itemsOrdered[i];
            }
        }

        return null;
    }

    public boolean checkExist(Media media) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(media)) {
                targetId = i;
                return true;
            }
        }
        return false;
    }

    public void readDVD() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i]);
        }
    }

    public void addMedia(Media media) {
        if (!checkFull()) {
            itemsOrdered[qtyOrdered] = media;
            System.out.println("Object added successfully.");
            qtyOrdered++;
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void removeMedia(Media media) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Can not remove any object.");
        } else {
            if (checkExist(media) && qtyOrdered > 1) {
                for (int i = targetId; i < qtyOrdered - 1; i++) {
                    int j = i + 1;
                    Media temp = itemsOrdered[i];
                    itemsOrdered[i] = itemsOrdered[j];
                    itemsOrdered[j] = temp;

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

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void printCart() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Can not remove any object.");
        } else {
            System.out.println("*******************CART*******************");
            myTotalCost = 0;
            for (int i = 1; i <= qtyOrdered; i++) {
                String dvdStr = i + ". "+ itemsOrdered[i].toString();
                System.out.println(dvdStr);
                myTotalCost += itemsOrdered[i].getCost();
            }
            System.out.println("Total cost: " + myTotalCost);
            System.out.println("*****************************************");
        }
    }

    public void searchByTitle(String title) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Can not remove any object.");
        } else {
            System.out.println("*******************CART*******************");
            myTotalCost = 0;
            int ind = 1;
            for (int i = 1; i <= qtyOrdered; i++) {
                if(itemsOrdered[i].getTitle().equals(title)) {
                    String dvdStr = ind + ". " + itemsOrdered[i].toString();
                    System.out.println(dvdStr);
                    myTotalCost += itemsOrdered[i].getCost();
                }
            }
            System.out.println("Total cost: " + myTotalCost);
            System.out.println("*****************************************");
        }
    }

    public void searchById(int id) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Can not remove any object.");
        } else {
            System.out.println("*******************CART*******************");
            myTotalCost = 0;
            int ind = 1;
            for (int i = 1; i <= qtyOrdered; i++) {
                if(itemsOrdered[i].getId()== id) {
                    String dvdStr = ind + ". " + itemsOrdered[i].toString();
                    System.out.println(dvdStr);
                    myTotalCost += itemsOrdered[i].getCost();
                }
            }
            System.out.println("Total cost: " + myTotalCost);
            System.out.println("*****************************************");
        }
    }

}
