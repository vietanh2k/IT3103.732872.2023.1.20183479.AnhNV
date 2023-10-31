package lab01;

import javax.swing.*;

public class CalculateNumber {
    public static void main(String[] arg){
        String n1,n2;
        String noti = " ";
        n1 = JOptionPane.showInputDialog(null,"Please input the first number; : ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        noti += n1 + " and ";
        n2 = JOptionPane.showInputDialog(null,"Please input the second number; : ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        noti += n2 + " = ";
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        JOptionPane.showMessageDialog(null, "Sum"+noti+Double.sum(num1, num2), "Show sum numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sub"+noti+Double.sum(num1, -num2), "Show sub numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mul"+noti+(num1*num2), "Show mul numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Div"+noti+(num1/ num2), "Show div numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
