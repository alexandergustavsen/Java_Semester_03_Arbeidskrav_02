package no.kristiania.pgr200.database;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class ConferenceTest {
    @Test
    public void shouldSetName()  throws Throwable  {
        ConferenceData conferenceData0 = new ConferenceData();
        conferenceData0.setCname("");
        String string0 = conferenceData0.getCname();
        assertEquals("", string0);
    }
    @Test
    public void shouldSetMoreNames()  throws Throwable  {
        ConferenceData conferenceData0 = new ConferenceData();
        conferenceData0.cname = null;
        conferenceData0.cname = "V@kki1$#,gi2Rg";
        String string0 = conferenceData0.getCname();
        assertEquals("V@kki1$#,gi2Rg", string0);
    }
    @Test
    public void shouldGetName()  throws Throwable  {
        ConferenceData conferenceData0 = new ConferenceData();
        String string0 = conferenceData0.getCname();
        assertNull(string0);
    }

}
