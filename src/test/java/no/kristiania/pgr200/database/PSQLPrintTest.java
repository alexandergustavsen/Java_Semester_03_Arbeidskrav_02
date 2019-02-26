package no.kristiania.pgr200.database;

import org.junit.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Fail.fail;

public class PSQLPrintTest {
    @Test
    public void createJPSR()  throws Throwable {
        PSQLPrint PSQLPrint0 = new PSQLPrint();
    }
    @Test
    public void listingTalks() throws SQLException{
            try {
                PSQLPrint.listTalks();
                fail("Expecting exception: PSQLException");
        } catch(Throwable t) {
        }
    }

}

