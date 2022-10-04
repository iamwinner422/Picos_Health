
package picos_health;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author iamwinner
 */
public class Cconnexion {
    private static String server = "localhost";
    private static String user = "root";
    private static String dbname = "picos_health";
    private static Integer port = 3306;
    private static String pass = "";
    public static Connection getConnection(){
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(server);
        datasource.setUser(user);
        datasource.setDatabaseName(dbname);
        datasource.setPassword(pass);
        datasource.setPortNumber(port);
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Cconnexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }
}
