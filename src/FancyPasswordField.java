import res.fonts.Fonts;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FancyPasswordField extends JPasswordField {
    //Public Members
    public FancyPasswordField() {
        super();

        this.setHint("Password");

        this.setTextColor(Colors.DARK_BLUE);
        this.setHintColor(Colors.BLACK);

        this.setForeground(this.getHintColor());
        this.setBackground(Colors.GREEN);

        Border rounded = new LineBorder(Colors.GREEN, 1, true);
        Border empty = new EmptyBorder(0, 5, 0, 5);
        Border border = new CompoundBorder(rounded, empty);

        this.setBorder(border);
    }
    public FancyPasswordField(String hint) {
        super();

        this.setHint(hint);
        this.setTextColor(Colors.DARK_BLUE);
        this.setHintColor(Colors.DARK_BLUE);
        this.setForeground(this.getHintColor());
        this.setBackground(Colors.GREEN);
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

    //Protected Members
    @Override
    protected void paintComponent(final Graphics pG) {
        super.paintComponent(pG);

        final Graphics2D g = (Graphics2D) pG;
        g.drawLine(this.getInsets().left, pG.getFontMetrics().getMaxAscent() + 10,
                this.getWidth() - this.getInsets().right,
                pG.getFontMetrics().getMaxAscent() + 10);

        if(this.getHint().length() == 0 || this.getPassword().length > 0)
            return;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(this.getHintColor());
        g.drawString(hint, this.getInsets().left, pG.getFontMetrics().getMaxAscent() + 5);
    }

    //Private Members
    private String hint;
    private Color hintColor;
    private Color textColor;

}