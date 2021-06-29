import javax.swing.*;
import java.util.Stack;

public class Windows {
    private static LogInGUI login;
    private static MainSession userSession;

    //private static Stack<JFrame> windows;

    public static LogInGUI getLogin() {
        if(login == null)
            login = new LogInGUI();
        return login;
    }

    public static MainSession getUserSession() {
        if(userSession == null)
            userSession = new MainSession();
        return userSession;
    }
}
