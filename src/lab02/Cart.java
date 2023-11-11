package lab02;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DVD[] itemsOrdered = new DVD[MAX_NUMBERS_ORDERED];
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

    public void readDVD() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i]);
        }
    }

    public void addDVD(DVD disc) {
        if (!checkFull()) {
            itemsOrdered[qtyOrdered] = disc;
            System.out.println("Object added successfully.");
            qtyOrdered++;
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void addDVD(DVD[] discList) {
        for(DVD disc: discList){
            if (!checkFull()) {
                itemsOrdered[qtyOrdered] = disc;
                System.out.println("Object added successfully.");
                qtyOrdered++;
            } else {
                System.out.println("The cart is full.");
                return;
            }
        }
    }

    public void addDVD(DVD disc1, DVD disc2) {
        if (!checkFull()) {
            itemsOrdered[qtyOrdered] = disc1;
            System.out.println("Object added successfully.");
            qtyOrdered++;
        } else {
            System.out.println("The cart is full.");
            return;
        }

        if (!checkFull()) {
            itemsOrdered[qtyOrdered] = disc2;
            System.out.println("Object added successfully.");
            qtyOrdered++;
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void removeDVD(DVD disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Can not remove any object.");
        } else {
            if (checkExist(disc) && qtyOrdered > 1) {
                for (int i = targetId; i < qtyOrdered - 1; i++) {
                    int j = i + 1;
                    DVD temp = itemsOrdered[i];
                    itemsOrdered[i] = itemsOrdered[j];
                    itemsOrdered[j] = temp;

                }
                qtyOrdered--;
                System.out.println("Remove successfully.");
            } else if (checkExist(disc)) {
                qtyOrdered--;
                System.out.println("Remove successfully.");
            } else {
                System.out.println("There is no object matching the object you want to delete.");
            }
        }
    }

    public float totalCost() {
        for (int i = 0; i < qtyOrdered; i++) {
            myTotalCost += itemsOrdered[i].getCost();
        }
        return myTotalCost;
    }
}
