import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //LogIn login = new LogIn();
        //UserSession userSession = new UserSession();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Windows.getLogin();
                Windows.getUserSession();
            }
        });
    }
}
