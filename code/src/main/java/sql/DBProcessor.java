package sql;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProcessor {
    private Connection connection;
    public static final String URL = "jdbc:mysql://localhost:3306/MySQL?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "lesha";
    public static final String PASSWORD = "1111";

    private static volatile DBProcessor instance = null;

    public DBProcessor() throws SQLException {
        DriverManager.registerDriver(new FabricMySQLDriver());
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static DBProcessor getInstance() throws SQLException {

        DBProcessor localInstance = instance;

        if (instance == null) {
            synchronized (DBProcessor.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DBProcessor();
                }

            }

        }
        return instance;

    }



    public Connection getConnection() {
        return connection;
    }

}