import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FancyTextField extends JTextField implements FocusListener {
    //Public Members
    public FancyTextField() {
        super();
        addFocusListener(this);

        this.setHint("Enter your username");
        this.setTextColor(Colors.DARK_BLUE);
        this.setHintColor(Colors.DARK_BLUE);
        this.setForeground(this.getHintColor());
        this.setText(this.getHint());
        this.setTyped(false);
        this.setBackground(Colors.GREEN);
    }
    public FancyTextField(String hint) {
        super();
        addFocusListener(this);

        this.setHint(hint);
        this.setTextColor(Colors.DARK_BLUE);
        this.setHintColor(Colors.DARK_BLUE);
        this.setForeground(this.getHintColor());
        this.setText(this.getHint());
        this.setTyped(false);
        this.setBackground(Colors.GREEN);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(!this.isTyped()) {
            this.setText("");
            this.setForeground(this.getTextColor());
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if(this.getText().equals("")) {
            this.setText(this.getHint());
            this.setForeground(this.getHintColor());
            this.setTyped(false);
        } else {
            this.setTyped(true);
        }
    }

    public String getHint() {
        return hint;
    }
    public void setHint(String hint) {
        this.hint = hint;
    }

    public Color getHintColor() {
        return hintColor;
    }
    public void setHintColor(Color hintColor) {
        this.hintColor = hintColor;
    }

    public Color getTextColor() {
        return textColor;
    }
    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public boolean isTyped() {
        return typed;
    }
    public void setTyped(boolean typed) {
        this.typed = typed;
    }

    //Private Members
    private String hint;
    private Color hintColor;
    private Color textColor;
    private boolean typed;
}
