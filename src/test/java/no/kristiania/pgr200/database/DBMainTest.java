package no.kristiania.pgr200.database;
import org.junit.Test;
import static org.assertj.core.api.Fail.fail;

public class DBMainTest {

    @Test
    public void shouldGetInsertToConf()  throws Throwable  {
        DBMain DBMain0 = new DBMain();
        try {
            DBMain0.insertConf();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
        }
    }
    @Test
    public void shouldGetInsertToTalk()  throws Throwable  {
        DBMain DBMain0 = new DBMain();
        try {
            DBMain0.insertTalk();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
        }
    }
    @Test
    public void shouldGetInsertToDay()  throws Throwable  {
        DBMain DBMain0 = new DBMain();
        try {
            DBMain0.insertDay();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
        }
    }
}
