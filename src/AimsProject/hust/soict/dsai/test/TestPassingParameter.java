package AimsProject.hust.soict.dsai.test;

import AimsProject.hust.soict.dsai.aims.disc.DVD;

public class TestPassingParameter {

    public static void main(String[] args){
        DVD jungleDVD = new DVD("Jungle");
        DVD cinderellaDVD  = new DVD("Cinderrella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: "+jungleDVD.getTitle());
        System.out.println("cinderella DVD title: "+cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: "+jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DVD dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DVD(oldTitle);
    }
}
