package no.kristiania.pgr200.database;

import org.junit.Test;

import static org.assertj.core.api.Fail.fail;

public class DBHandlerTest {
    @Test
    public void clearTestDB() {
        try {
            DBHandler.clearTables();
            fail("Expecting exception: NullPointerException");
        } catch (Throwable throwable){
            throwable.printStackTrace();
        }

    }

    @Test
    public void creatingDB() throws Throwable {
        DBHandler dBHandler0 = new DBHandler();
    }
}
