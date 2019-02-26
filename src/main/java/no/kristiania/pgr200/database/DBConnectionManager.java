package no.kristiania.pgr200.database;

import org.postgresql.ds.PGPoolingDataSource;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public class DBConnectionManager {

    public Properties properties = new Properties();
    public InputStream input = null;

    public DataSource connectToDB() {
        try {

            String fileName = "datasource.properties";
            input = getClass().getClassLoader().getResourceAsStream(fileName);
            properties.load(input);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        }
        PGPoolingDataSource dataSource = new PGPoolingDataSource();
        dataSource.setUrl(properties.getProperty("dataSource.url"));
        dataSource.setUser(properties.getProperty("dataSource.username"));
        dataSource.setPassword(properties.getProperty("dataSource.password"));

        return dataSource;
    }

    public static DataSource createDataSource(Properties properties) {
        PGPoolingDataSource dataSource = new PGPoolingDataSource();
        dataSource.setUrl(properties.getProperty("dataSource.url"));
        dataSource.setUser(properties.getProperty("dataSource.username"));
        dataSource.setPassword(properties.getProperty("dataSource.password"));
        return dataSource;
    }

    public static int executeConnection(DataSource data, String query) throws SQLException {
        return executeUpdate(data.getConnection(), query );
    }

    public static List<List<Object>> executeQuery(DataSource d, String query, int resultSetType, int resultSetConecurrency) throws SQLException {
        return executeQuery((DataSource) d.getConnection(), query, resultSetType, resultSetConecurrency);
    }

    public static int executeUpdate(Connection conn, String query) throws SQLException {
        if (conn == null) {
            System.err.println("Connection not reached!\n" + query);
            return -1;
        }
        Statement s = conn.createStatement();
        int r = s.executeUpdate(query);
        s.close();
        return r;
    }
}
