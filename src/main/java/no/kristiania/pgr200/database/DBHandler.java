package no.kristiania.pgr200.database;

import org.flywaydb.core.Flyway;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {

    private static Properties properties;
    private static Flyway flyway;

    public static void flywayConnection() {

        properties = new Properties();

        try (InputStream is = new FileInputStream(new File("src/main/resources/datasource.properties") ) ) {
            properties.load(is);
        } catch (IOException e){
            e.printStackTrace();
        }
        flyway = Flyway.configure().dataSource(
                properties.getProperty("dataSource.url"),
                properties.getProperty("dataSource.username"),
                properties.getProperty("dataSource.password") ).load();
        flyway.isBaselineOnMigrate();

        DataSource dataSource = DBConnectionManager.createDataSource(properties);
        try{
            DBConnectionManager.executeConnection( dataSource, readFile("src/main/resources/db/migration/V001__create_table_conference.sql"));
            DBConnectionManager.executeConnection( dataSource, readFile("src/main/resources/db/migration/V002__create_table_day.sql"));
            DBConnectionManager.executeConnection( dataSource, readFile("src/main/resources/db/migration/V003__create_table_talks.sql"));
            DBConnectionManager.executeConnection( dataSource, readFile("src/main/resources/db/migration/V004__create_sequences.sql"));

        } catch (SQLException es){
            es.printStackTrace();
        }
    }

    public static String readFile(String filepath){
        try (FileInputStream is = new FileInputStream(new File( filepath) ) ){
            char[] charArray = new char[is.available()];
            while(is.available() > 0){
                charArray[charArray.length - is.available() ] = (char) is.read();
            }
            return new String(charArray);
        } catch (IOException io) {
            io.printStackTrace();
        }
        return "";
    }

    public static void clearTables() {
        DataSource dataSource = DBConnectionManager.createDataSource(properties);
        try{
            DBConnectionManager.executeConnection( dataSource, readFile("src/main/resources/db/migration/V005__clear_tables.sql"));
        } catch (SQLException es){
            es.printStackTrace();
        }
    }

}
