import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

public class SQL {
    public static String makeSelection(String tableName, String[] fieldNames, String target) {
        StringBuilder query = new StringBuilder("SELECT * FROM ");
        query.append(tableName);

        if(fieldNames.length > 0 && !fieldNames[0].equals("")) {
            String prefix = tableName.substring(0, 2);
            for (int i = 2; i < tableName.length(); i++) {
                char c = tableName.charAt(i);
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    prefix += c + "_";
                    break;
                }
            }
            query.append(" WHERE ");


            for (int i = 0; i < fieldNames.length; i++) {
                String fieldName = fieldNames[i];
                if (fieldName.equals("id")) {
                    if (target.matches(".\\d")) {
                        query.append(prefix);
                        query.append("id=");
                        query.append(target);
                        query.append(" OR ");
                    }
                } else {
                    query.append(prefix);
                    query.append(fieldName);
                    query.append("='");
                    query.append(target);
                    query.append("'");
                    if (i != fieldNames.length - 1)
                        query.append(" OR ");
                }
            }
        }
        query.append(";");

        return query.toString();
    }
    public static ResultSet consult(String query) throws SQLException {
       Statement s = getConnection().createStatement();
       return s.executeQuery(query);
    }
    public static void searchAction(String target, String tableName, String columnNames, JTable table) {
        String[] columns = columnNames.split(", ");
        String query;
        query = SQL.makeSelection(tableName, columns, target);
        try {
            ResultSet rs = SQL.consult(query);
            SQL.updateTable(table, rs);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert(String query) {

    }

    public static void delete(String query) {

    }

    public static void update(String query) throws SQLException {

    }

    public static void updateTable(JTable table, ResultSet rs) throws SQLException {
        int columnCount = rs.getMetaData().getColumnCount();
        DefaultTableModel prevModel = (DefaultTableModel) table.getModel();
        DefaultTableModel newModel = new DefaultTableModel();

        for(int i = 0; i < columnCount; i++)
            newModel.addColumn(prevModel.getColumnName(i));

        while(rs.next()) {
            Vector<Object> row = new Vector<>();
            for(int i = 1; i <= columnCount; i++)
                row.add(rs.getObject(i));
            newModel.addRow(row);
        }
        table.setModel(newModel);
    }

    private static Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, pass);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    private static final String url = "jdbc:mariadb://localhost:3306/toy_storee";
    private static final String user = "root";
    private static final String pass = "5@%gFtF$rx";
    private static Connection connection;
}