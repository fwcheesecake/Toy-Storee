import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Clients extends JFrame {
    public Clients() {
        super("Clients");
        this.setContentPane(contentPanel);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        DefaultTableModel tableModel = (DefaultTableModel) clientsTable.getModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Address");
        tableModel.addColumn("Phone 1");
        tableModel.addColumn("Phone 2");
        tableModel.addColumn("Email");

        SQL.searchAction("", "clients", "", clientsTable);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String target = searchField.getText().trim();
                SQL.searchAction(target, "clients", "id, firstname, lastname", clientsTable);
            }
        });
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED) {
                    String selected = itemEvent.getItem().toString();
                    switch (selected) {
                        case "Orders" -> Windows.getOrders().setVisible(true);
                        case "Sessions" -> Windows.getSessions().setVisible(true);
                        case "Payments" -> Windows.getPayments().setVisible(true);
                        default -> System.out.println("Something happened");
                    }
                    Windows.getClients().dispose();
                }
            }
        });
    }

    private JPanel navbarPanel;
    private JLabel navLogo;
    private JButton exitButton;
    private JLabel usernameLabel;
    private JButton dashboardButton;
    private JButton productsButton;
    private JComboBox comboBox1;
    private JPanel searchPanel;
    private JTextField searchField;
    private JButton searchButton;
    private JTable clientsTable;
    private JButton createButton;
    private JPanel contentPanel;
}
