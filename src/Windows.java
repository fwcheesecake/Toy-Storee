import javax.swing.*;
import java.util.Objects;
import java.util.Stack;

public class Windows {
    private static LogInGUI login;
    private static MainSession userSession;
    private static Dashboard dashboard;

    //private static Stack<JFrame> windows;
    private static ImageIcon appIcon =
            new ImageIcon(Objects.requireNonNull(Windows.class.getResource("/res/icons" +
                    "/transparent_dark_logo.png")));

    public static LogInGUI getLogin() {
        if(login == null) {
            login = new LogInGUI();
            login.setIconImage(appIcon.getImage());
        }
        return login;
    }

    public static MainSession getUserSession() {
        if(userSession == null) {
            userSession = new MainSession();
            userSession.setIconImage(appIcon.getImage());
        }
        return userSession;
    }

    public static Dashboard getDashboard() {
        if(dashboard == null)
            dashboard = new Dashboard();
            dashboard.setIconImage(appIcon.getImage());
        return dashboard;
    }
}
