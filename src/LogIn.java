import res.fonts.Fonts;

import javax.swing.*;

public class LogIn extends JFrame {
    //Public Members
    public LogIn() {
        this.setBackground(Colors.DARK_BLUE);

        this.add(new FancyPasswordField());
        this.add(new FancyPasswordField());
        this.setVisible(true);
    }

    //Private member
    private FancyTextField fancyUsername;
    private FancyTextField fancyPassword;
}
