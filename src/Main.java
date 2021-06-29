import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //LogIn login = new LogIn();
        //UserSession userSession = new UserSession();

        SwingUtilities.invokeLater(() -> {
            //Windows.getLogin();
            //Windows.getUserSession();
            Windows.getDashboard();
        });
    }
}
