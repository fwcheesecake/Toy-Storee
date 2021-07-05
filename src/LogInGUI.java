import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInGUI extends JFrame {
    //Public Members
    public LogInGUI() {
        super("Log In or Sign Up");
        this.setContentPane(contentPanel);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    //Public Members
    private JPanel contentPanel;
    private JLabel logoLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
}
