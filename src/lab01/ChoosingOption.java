package lab01;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] arg){
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You're chosen: "
        +(option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
