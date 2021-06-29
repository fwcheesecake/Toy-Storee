import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class UserSession extends JFrame {
    //Public Members
    public UserSession() {
        super();
        this.setSize(1280, 720);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        initComponents();
        addComponents();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Private Members
    private JPanel contentPanel;

    private JPanel navPanel;
    private SearchBar searchBar;

    private JPanel leftPanel;
    private JPanel billPanel;
    private JPanel keyboardPanel;

    private JPanel rightPanel;
    private JPanel categoryPanel;
    private JPanel productsPanel;

    private void initComponents() {
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        this.setContentPane(contentPanel);

        navPanel = new JPanel();
        navPanel.setBackground(Colors.BLACK);
        navPanel.setLayout(null);

        searchBar = new SearchBar();

        leftPanel = new JPanel();
        billPanel = new JPanel();
        keyboardPanel = new JPanel();

        rightPanel = new JPanel();
        categoryPanel = new JPanel();
        productsPanel = new JPanel();
    }
    private void addComponents() {
        JLabel navPanelLogo =
                new JLabel(new ImageIcon(Objects.requireNonNull(this.getClass().getResource(
                        "/res/icons/nav_logo_transparent.png"))));
        navPanelLogo.setBounds(10, 5, 172, 40);
        navPanel.add(navPanelLogo);

        JButton ordersButton = new JButton("Orders");

        searchBar.setBounds(399, 11, 265, 28);
        navPanel.add(searchBar);

        navPanel.setBounds(0, 0, 1280, 50);
        contentPanel.add(navPanel);
    }
}
