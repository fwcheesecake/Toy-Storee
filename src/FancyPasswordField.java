import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FancyPasswordField extends FancyTextField implements KeyListener {
    //Public Members
    public FancyPasswordField() {
        this.addKeyListener(this);

        this.setPassword("");
        this.setTop(0);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == '\b') {
            setTop(getTop() - 1);
        } else {
            this.setPassword(this.getPassword() + e.getKeyChar());
            this.setText(this.getText() + "*");
            setTop(getTop() + 1);
        }
        System.out.println(this.getPassword());
    }
    @Override
    write

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public String getPassword() {
        if(getTop() != password.length())
            return password.substring(0, getTop());
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }

    //Private Members
    private String password;
    private int top;
}
