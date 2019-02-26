package no.kristiania.pgr200.database;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class TalkDataTest {


    @Test
    public void shouldSetMoreTopic()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.setTopic("TalkData{idTalks=0, title='jJyO=%.', description='null', topic='null'}");
        String string0 = talkData0.getTopic();
        assertEquals("TalkData{idTalks=0, title='jJyO=%.', description='null', topic='null'}", string0);
    }
    @Test
    public void shouldGetTopic()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.topic = "";
        String string0 = talkData0.getTopic();
        assertEquals("", string0);
    }
    @Test
    public void shouldSetTitlesomething()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.setTitle("jJyO=%.");
        String string0 = talkData0.getTitle();
        assertEquals("jJyO=%.", string0);
    }
    @Test
    public void shouldSetTilteNone()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.setTitle("");
        String string0 = talkData0.getTitle();
        assertEquals("", string0);
    }
    @Test
    public void shouldSetIdTalks()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.idTalks = 2256L;
        long long0 = talkData0.getIdTalks();
        assertEquals(2256L, long0);
    }
    @Test
    public void shouldSetIdTalks2()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.setIdTalks((-1L));
        long long0 = talkData0.getIdTalks();
        assertEquals((-1L), long0);
    }
    @Test
    public void shouldSetDescriptionSomething()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.setDescription("i_Go2T1n/su*eJcK");
        String string0 = talkData0.getDescription();
        assertEquals("i_Go2T1n/su*eJcK", string0);
    }
    @Test
    public void shouldSetDescription()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        talkData0.setDescription("");
        String string0 = talkData0.getDescription();
        assertEquals("", string0);
    }
    @Test
    public void topicShouldBeNull()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        String string0 = talkData0.getTopic();
        assertNull(string0);
    }
    @Test
    public void idTalksShouldBeNull()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        long long0 = talkData0.getIdTalks();
        assertEquals(0L, long0);
    }
    @Test
    public void titleShouldBeNull()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        String string0 = talkData0.getTitle();
        assertNull(string0);
    }
    @Test
    public void descriptionShouldBeNull()  throws Throwable  {
        TalkData talkData0 = new TalkData();
        String string0 = talkData0.getDescription();
        assertNull(string0);
    }

}
