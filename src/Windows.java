import res.UserOrders;

import javax.swing.*;

public class Windows {
    private static LogInGUI login;
    private static MainSession userSession;
    private static Dashboard dashboard;
    private static UserOrders userOrders;
    private static Clients clients;
    private static CreateClient createClient;
    private static Orders orders;
    private static Payments payments;
    private static Products products;
    private static PayScreen payScreen;
    private static Sessions sessions;

    private static String logedUser = "";

    //private static Stack<JFrame> windows;
    /*private static ImageIcon appIcon =
            new ImageIcon(Objects.requireNonNull(Windows.class.getResource("/res/icons" +
                    "/transparent_dark_logo.png")));
     */

    public static void logOut(JFrame currentWindow) {
        logedUser = "";
        login.setVisible(true);
        currentWindow.dispose();
    }

    public static LogInGUI getLogin() {
        if(login == null) {
            login = new LogInGUI();
        }
        return login;
    }
    public static MainSession getUserSession() {
        if(userSession == null) {
            userSession = new MainSession();
        }
        return userSession;
    }
    public static Dashboard getDashboard() {
        if(dashboard == null) {
            dashboard = new Dashboard();
        }
        return dashboard;
    }

    public static UserOrders getUserOrders() {
        if(userOrders == null) {
            userOrders = new UserOrders();
        }
        return userOrders;
    }

    public static Clients getClients() {
        if(clients == null) {
            clients = new Clients();
        }
        return clients;
    }

    public static CreateClient getCreateClient() {
        if(createClient == null) {
            createClient = new CreateClient();
        }
        return createClient;
    }

    public static Orders getOrders() {
        if(orders == null) {
            orders = new Orders();
        }
        return orders;
    }

    public static Payments getPayments() {
        if(payments == null) {
            payments = new Payments();
        }
        return payments;
    }

    public static Products getProducts() {
        if(products == null) {
            products = new Products();
        }
        return products;
    }

    public static PayScreen getPayScreen() {
        if(payScreen == null) {
            payScreen = new PayScreen();
        }
        return payScreen;
    }

    public static Sessions getSessions() {
        if(sessions == null) {
            sessions = new Sessions();
        }
        return sessions;
    }
}
