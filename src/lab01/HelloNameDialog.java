package lab01;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] arg){
        String result;
        result = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi "+result+"!");
        System.exit(0);
    }
}
