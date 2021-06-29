import javax.swing.*;
import java.util.Objects;

public class Dashboard extends JFrame {
    public Dashboard() {
        super("Admin Dashboard");
        this.setContentPane(contentPanel);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
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
