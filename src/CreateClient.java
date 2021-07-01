import javax.swing.*;

public class CreateClient extends JFrame {
    public CreateClient() {
        super("Create Client");
        this.setContentPane(contentPanel);

        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    private JPanel searchPanel;
    private JButton saveButton;
    private JButton cancelButton;
    private JTextField firstnameField;
    private JTextField address1Field;
    private JTextField phone1Field;
    private JTextField homeNumberField;
    private JTextField doorNumberField;
    private JTextField phone2Field;
    private JTextField address2Field;
    private JTextField emailField;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipcodeField;
    private JPanel contentPanel;
    private JPanel formPanel;
    private JTextField lastnameField;
}
