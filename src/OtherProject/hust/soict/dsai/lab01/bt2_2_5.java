package OtherProject.hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class bt2_2_5{
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1;
        double num2;
        strNum1 = JOptionPane.showInputDialog(null, "Nguyen Viet Anh 20183479 - Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,"Nguyen Viet Anh 20183479 - Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
        double add =num1 +num2;
        double diff=num1-num2;
        if(diff<0)  diff*=-1;
        double product=num1*num2;
        String ans=Double.toString(add) + " \n";
        ans+=Double.toString(diff) + " \n";
        ans+=Double.toString(product) + " \n";
        if(num2 == 0 )  ans+="no quotient";
        else ans+=Double.toString(num1/num2);
        JOptionPane.showMessageDialog(null, ans, "Show sum, difference, product, and quotient of 2 double numbers", JOptionPane. INFORMATION_MESSAGE);
        System.exit(0);
    }
}
