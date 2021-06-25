import res.fonts.Fonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LogIn extends JFrame implements ActionListener {
    //Public Members
    public LogIn() {
        this.setIconImage(new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/res" +
                "/icons/transparent_dark_logo.png"))).getImage());

        this.setSize(400, 500);
        this.setLocationRelativeTo(null);

        this.initComponents();
        this.addComponents();

        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Private Members
    private JLabel headerLabel;

    private FancyTextField usernameField;
    private FancyPasswordField passwordField;

    private FancyButton loginButton;
    private FancyButton signupButton;

    private JPanel contentPanel;

    private void initComponents() {
        contentPanel = new JPanel();
        contentPanel.setBackground(Colors.BLACK);
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

        headerLabel = new JLabel();
        headerLabel.setIcon(new ImageIcon(Objects.requireNonNull(this.getClass().getResource(
                "/res/icons/dark_background_imagotype.png"))));
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        headerLabel.setVerticalAlignment(JLabel.CENTER);

        usernameField = new FancyTextField();
        usernameField.setPreferredSize(new Dimension(300, 50));
        usernameField.setFont(Fonts.get("Regular", 30));

        passwordField = new FancyPasswordField();
        passwordField.setPreferredSize(new Dimension(300, 50));
        passwordField.setFont(Fonts.get("Regular", 30));

        loginButton = new FancyButton();
        loginButton.setPreferredSize(new Dimension(120, 30));
        loginButton.setFont(Fonts.get("Light", 20));
        loginButton.setText("Log In");

        signupButton = new FancyButton();
        signupButton.setPreferredSize(new Dimension(120, 30));
        signupButton.setFont(Fonts.get("Light", 20));
        signupButton.setText("Sign Up");
    }
    private void addComponents() {
        this.setContentPane(contentPanel);

        contentPanel.add(headerLabel);

        contentPanel.add(usernameField);
        contentPanel.add(passwordField);

        contentPanel.add(loginButton);
        contentPanel.add(signupButton);
    }
}
