package no.kristiania.pgr200.database;

import javax.sql.DataSource;
import java.sql.*;

public class ConferenceTalkDao {

    public ConferenceTalkDao() {}

    public void inputConf(String cname) throws SQLException{
        DataSource dataSource = new DBConnectionManager().connectToDB();
        try (Connection conn = dataSource.getConnection()) {
            String sql = "INSERT INTO conference (cname) VALUES (?)";
            try (PreparedStatement statement = conn.prepareStatement(sql)){
                statement.setString(1, cname);
                statement.executeUpdate();
            }
        }
    }

    public void inputDay(int date, int time, String room) throws SQLException {
        DataSource dataSource = new DBConnectionManager().connectToDB();
        try (Connection conn = dataSource.getConnection()) {
        String sql = "INSERT INTO day (date, time, room) VALUES (?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, date);
                statement.setInt(2, time);
                statement.setString(3, room);
                statement.executeUpdate();
            }
        }
    }

    public void inputTalk(String title, String description, String topic) throws SQLException {
        DataSource dataSource = new DBConnectionManager().connectToDB();
        try(Connection connection = dataSource.getConnection()){
            String sql = "INSERT INTO talks (title, description, topic) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, title);
                statement.setString(2, description);
                statement.setString(3, topic);
                statement.executeUpdate();
            }
        }
    }
}