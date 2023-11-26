package OtherProject.hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class bt2_2_6 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double a;
        double b;
        strNum1 = JOptionPane.showInputDialog(null, "Nguyen Viet Anh 20183479 - Please input a of the equation ax + b = 0: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,"Nguyen Viet Anh 20183479 - Please input b of the equation ax + b = 0:","Input the second number", JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strNum2);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Nguyen Viet Anh 20183479 - The equation is an identity equation.");
            } else {
                System.out.println("Nguyen Viet Anh 20183479 - The equation has no solution.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nguyen Viet Anh 20183479 - The value of x is: " + x, "Solve", JOptionPane. INFORMATION_MESSAGE);
        }
    }
}
