import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Orders extends JFrame {
    public Orders() {
        super("Orders");
        this.setContentPane(contentPanel);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        DefaultTableModel tableModel = (DefaultTableModel) ordersTable.getModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Session");
        tableModel.addColumn("Ticket");
        tableModel.addColumn("State");

        SQL.searchAction("", "orders", "", ordersTable);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String target = searchField.getText().trim();
                SQL.searchAction(target, "orders", "id, state", ordersTable);
            }
        });
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED) {
                    String selected = itemEvent.getItem().toString();
                    switch (selected) {
                        case "Clients" -> Windows.getClients().setVisible(true);
                        case "Sessions" -> Windows.getSessions().setVisible(true);
                        case "Payments" -> Windows.getClients().setVisible(true);
                        default -> System.out.println("Something happened");
                    }
                    Windows.getOrders().dispose();
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
    private JTable ordersTable;
    private JPanel contentPanel;
}
