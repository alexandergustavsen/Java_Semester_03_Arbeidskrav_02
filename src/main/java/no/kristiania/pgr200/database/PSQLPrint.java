package no.kristiania.pgr200.database;

import javax.sql.DataSource;
import java.sql.*;

public class PSQLPrint {

    public static void listTalks() throws SQLException {
        DataSource dataSource = new DBConnectionManager().connectToDB();
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pst = conn.prepareStatement("SELECT conference.cname, day.date, day.time, day.room, talks.title, talks.description, talks.topic\n" +
                    "FROM conference\n" +
                    "LEFT JOIN day ON conference.idconference = day.conference_idconference\n" +
                    "LEFT JOIN talks ON day.idDay = talks.day_idDay;");
            try (ResultSet rs = pst.executeQuery()) {
                int i = 1;
                while (rs.next()) {
                    if (i <= 9) {
                        System.out.println("\n" + "\n" + "- Talk Nr." + i + " -");
                    } else {
                        System.out.println("\n" + "\n" + "- Talk Nr." + i + "  -");
                    }
                    System.out.println("Conference: " + rs.getString(1));
                    System.out.println("Date: " + rs.getInt(2));
                    System.out.println("Time: " + rs.getString(3));
                    System.out.println("Room: " + rs.getString(4));
                    System.out.println("Talks: " + rs.getString(5));
                    System.out.println("Description: " + rs.getString(6));
                    System.out.println("Topic: " + rs.getString(7));
                    if (i <= 9) {
                        System.out.println("- - - - - - -");
                    } else {
                        System.out.println("- - - - - - - -");
                    }
                    i++;
                }
            }
        }
    }
}