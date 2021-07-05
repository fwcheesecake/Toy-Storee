import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //LogIn login = new LogIn();
        //UserSession userSession = new UserSession();
        SQL sql = new SQL();

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            //Windows.getLogin();
            //Windows.getUserSession();
            //Windows.getDashboard();
            //Windows.getPayments();
            Windows.getProducts();
            //Windows.getClients();
            //Windows.getOrders();
            //System.out.println("jesh".hashCode());
        });
    }
}
