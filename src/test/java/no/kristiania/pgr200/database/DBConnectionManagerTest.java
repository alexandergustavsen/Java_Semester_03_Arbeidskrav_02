package no.kristiania.pgr200.database;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.Test;

import javax.sql.DataSource;

import java.sql.SQLException;

import static org.assertj.core.api.Fail.fail;
import static org.junit.Assert.assertNotSame;

public class DBConnectionManagerTest {
    @Test
    public void dataSourceNotSame()  throws Throwable  {
        DBConnectionManager dBConnectionManager0 = new DBConnectionManager();
        DataSource dataSource0 = dBConnectionManager0.connectToDB();
        DataSource dataSource1 = DBConnectionManager.createDataSource(dBConnectionManager0.properties);
        assertNotSame(dataSource1, dataSource0);
    }
    @Test
    public void executeQueryTest()  throws Throwable  {
        JdbcDataSource jdbcDataSource0 = new JdbcDataSource();
        jdbcDataSource0.setPassword((String) null);
        try {
            DBConnectionManager.executeQuery(jdbcDataSource0, (String) null, 0, (-755));
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
    }
    }

    @Test
    public void executeConnectionTest()  throws Throwable  {
        JdbcDataSource jdbcDataSource0 = new JdbcDataSource();
        try {
            DBConnectionManager.executeConnection(jdbcDataSource0, (String) null);
            fail("Expecting exception: SQLException");
        } catch(SQLException e) {
        }
    }
}
