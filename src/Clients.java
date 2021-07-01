import javax.swing.*;

public class Clients extends JFrame {
    public Clients() {
        super("Clients");
        this.setContentPane(contentPanel);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
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
