package OtherProject.hust.soict.dsai.lab01;

import javax.swing.*;

public class ShowTwoNumbers {
    public static void main(String[] arg){
        String n1,n2;
        String noti = "You've just entered: ";
        n1 = JOptionPane.showInputDialog(null,"Please input the first number; : ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        noti += n1 + " and ";
        n2 = JOptionPane.showInputDialog(null,"Please input the second number; : ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        noti += n2;
        JOptionPane.showMessageDialog(null, noti, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
