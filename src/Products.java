import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Products extends JFrame {
    public Products() {
        super("Toys");
        this.setContentPane(contentPanel);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        DefaultTableModel tableModel = (DefaultTableModel) productsTable.getModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Category");
        tableModel.addColumn("Price");
        tableModel.addColumn("Description");

        SQL.searchAction("", "toys", "", productsTable);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String target = searchField.getText().trim();
                SQL.searchAction(target, "toys", "id, name, description", productsTable);
            }
        });

        productsTable.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                propertyChangeEvent.getNewValue();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Windows.logOut(Windows.getProducts());
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
    private JButton createButton;
    private JTable productsTable;
    private JPanel contentPanel;
}
