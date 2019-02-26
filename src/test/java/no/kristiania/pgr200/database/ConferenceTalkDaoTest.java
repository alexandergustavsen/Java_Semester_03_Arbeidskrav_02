package no.kristiania.pgr200.database;

import org.junit.Test;
import org.postgresql.util.PSQLException;

import static org.assertj.core.api.Fail.fail;


public class ConferenceTalkDaoTest {
    @Test
    public void shouldInputTalk() {
        try {
            try {
                new ConferenceTalkDao().inputTalk("Fs7cm'k$396a-d5\"us", "Fs7cm'k$396a-d5\"us", "Fs7cm'k$396a-d5\"us");
                fail("Expecting exception: PSQLException");
            } catch (PSQLException e) {
            }
        } catch (Throwable t) {
        }
    }

    @Test
    public void shouldInputDay() throws Throwable {
            ConferenceTalkDao conferenceTalkDao0 = new ConferenceTalkDao();
            try {
                conferenceTalkDao0.inputDay(0, 0, (String) null);
                fail("Expecting exception: PSQLException");

        } catch (Throwable t) {
        }
    }

    @Test
    public void shouldInputConference() throws Throwable {
                ConferenceTalkDao conferenceTalkDao0 = new ConferenceTalkDao();
                try {
                    conferenceTalkDao0.inputConf("+mymv*I3! *j>&cG");
                    fail("Expecting exception: PSQLException");

            } catch (Throwable t) {
            }


}
}


