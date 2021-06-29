import javax.swing.*;

public class LogInGUI extends JFrame {
    //Public Members
    public LogInGUI() {
        super("Log In or Sign Up");
        this.setContentPane(contentPanel);

        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    //Public Members
    private JPanel contentPanel;
    private JLabel logoLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signupButton;
}
