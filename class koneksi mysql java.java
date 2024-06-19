
package jvaplikasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KonekMySql {
      public static Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/school"; // Ganti school dengan nama database
        String user = "root"; // Ganti dengan username MySQL Anda
        String password = ""; // Ganti dengan password MySQL Anda

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to MySQL established successfully.");
            JOptionPane.showMessageDialog(null, "berhasil terhubung.");
             new home().setVisible(true);/*menampilkan jframe*/
                
        } catch (SQLException e) {
            System.out.println("Connection to MySQL failed.");
             JOptionPane.showMessageDialog(null, "Connection to MySQL failed: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }
    
}
