package GuiProject.hust.soict.dsai.wing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import AimsProject.hust.soict.dsai.aims.disc.DVD;
import AimsProject.hust.soict.dsai.aims.media.Media;
import AimsProject.hust.soict.dsai.aims.store.Store; // Import the Store class

public class StoreScreen extends JFrame {
    private Store store;

    public StoreScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

    private void initializeUI() {
        setTitle("View Store Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel northPanel = createNorthPanel();
        add(northPanel, BorderLayout.NORTH);

        JPanel centerPanel = createStoreItemsPanel();
        add(centerPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createNorthPanel() {
        JPanel northPanel = new JPanel();
        return northPanel;
    }

    public JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    public JMenuBar createMenuBar() {
        JMenu menu= new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout (FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    public JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font. PLAIN, 50));
        title.setForeground (Color.CYAN);
        JButton cart = new JButton("View cart");
        cart.setPreferredSize (new Dimension (100, 50));
        cart.setMaximumSize (new Dimension (100, 50));
        header.add(Box.createRigidArea (new Dimension (10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea (new Dimension (10, 10)));
        return header;
    }

    private JPanel createStoreItemsPanel() {
        JPanel itemsPanel = new JPanel(new GridLayout(0, 3));

        for (int i=0; i<store.qtyOrdered; i++) {
            JLabel itemLabel = new JLabel(store.getItem()[i].getTitle());
            itemsPanel.add(itemLabel);
        }

        return itemsPanel;
    }

    public JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));
        Media[] mediaInStore = store.getItem();
        for (int i = 0; i < store.qtyOrdered; i++) {
            if(i>= 9) break;
            MediaStore cell = new MediaStore (mediaInStore[i]);
            center.add(cell);
        }

        return center;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Store sampleStore = new Store();
            sampleStore.addMedia(new DVD("Item1"));
            sampleStore.addMedia(new DVD("Item2"));

            new StoreScreen(sampleStore);
        });
    }
}
