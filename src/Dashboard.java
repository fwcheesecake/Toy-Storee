import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class Dashboard extends JFrame {
    public Dashboard() {
        super("Admin Dashboard");
        this.setContentPane(contentPanel);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED) {
                    String selected = itemEvent.getItem().toString();
                    switch (selected) {
                        case "Clients" -> Windows.getClients().setVisible(true);
                        case "Orders" -> Windows.getOrders().setVisible(true);
                        case "Payments" -> Windows.getPayments().setVisible(true);
                        case "Sessions" -> Windows.getSessions().setVisible(true);
                    }
                    Windows.getDashboard().dispose();
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    private JPanel contentPanel;
    private JPanel navbarPanel;
    private JLabel navLogo;
    private JButton exitButton;
    private JLabel usernameLabel;
    private JButton dashboardButton;
    private JButton productsButton;
    private JComboBox comboBox1;
    private JTextField searchField;
    private JButton searchButton;
    private JPanel searchPanel;
    private JPanel shopsPanel;
}
