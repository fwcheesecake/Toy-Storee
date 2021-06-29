import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //LogIn login = new LogIn();
        //UserSession userSession = new UserSession();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainSession mainSession = new MainSession();
                mainSession.setSize(1280, 720);
                mainSession.setVisible(true);
                mainSession.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
