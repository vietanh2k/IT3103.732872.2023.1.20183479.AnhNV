package lab02;

public class Aims {
    public static void main(String[] args) {
        System.out.println("HoVaTen: Nguyen Viet Anh");
        System.out.println("MSSV: 20183479\n\n\n\n");
        Cart anOrder = new Cart();

        DVD dvd1 = new DVD("Badminton", "game", "Nam", 20, 30f);
        anOrder.addDVD(dvd1);

        DVD dvd2 = new DVD("Khoa hoc", "science", "Huu tu", 30, 25f);
        anOrder.addDVD(dvd2);

        DVD dvd3 = new DVD("Name3", "unknown", 30f);
        anOrder.addDVD(dvd3);

        anOrder.readDVD();
        System.out.println("Total cost is:  ");
        System.out.printf("%.2f", anOrder.totalCost());
        System.out.println();

        anOrder.removeDVD(dvd1);
        anOrder.readDVD();
    }
}
