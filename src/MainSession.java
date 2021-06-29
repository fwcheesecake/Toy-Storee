import javax.swing.*;

public class MainSession extends JFrame {
    //Public Members
    public MainSession() {
        super("Main Session");
        this.setContentPane(contentPanel);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    //Private Members
    private JLabel navLogo;
    private JButton ordersButton;
    private JButton exitButton;
    private JTextField searchTextField;
    private JButton payButton;
    private JButton clientButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton amountButton;
    private JButton a4Button;
    private JButton a7Button;
    private JButton plusMinusButton;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton discountButton;
    private JButton priceButton;
    private JButton eraseButton;
    private JButton a0Button;
    private JButton pointButton;
    private JPanel contentPanel;
    private JPanel billPanel;
    private JPanel rightPanel;
    private JPanel categoryBar;
    private JPanel productPanel;
    private JPanel keyboardPanel;
    private JPanel numpadPanel;
    private JPanel navbarPanel;
    private JPanel searchbarPanel;
    private JLabel searchIcon;
    private JLabel usernameLabel;
    private JButton homeButton;
    private JButton category1Button;
    private JButton category2Button;
}
