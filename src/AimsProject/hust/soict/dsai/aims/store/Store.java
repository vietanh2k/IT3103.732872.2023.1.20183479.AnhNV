package AimsProject.hust.soict.dsai.aims.store;

import AimsProject.hust.soict.dsai.aims.disc.DVD;

public class Store {
    public static final int MAX_NUMBERS = 999;
    private final DVD[] itemsInStore = new DVD[MAX_NUMBERS];
    int qtyOrdered;

    public boolean checkFull() {
        if (qtyOrdered < 20) {
            return false;
        } else {
            return true;
        }
    }


    public void addDVD(DVD disc) {
        if (!checkFull()) {
            itemsInStore[qtyOrdered] = disc;
            System.out.println("Object added successfully.");
            qtyOrdered++;
        } else {
            System.out.println("The store is full.");
        }
    }

    public void addDVD(DVD[] discList) {
        for(DVD disc: discList){
            if (!checkFull()) {
                itemsInStore[qtyOrdered] = disc;
                System.out.println("Object added successfully.");
                qtyOrdered++;
            } else {
                System.out.println("The store is full.");
                return;
            }
        }
    }
}
