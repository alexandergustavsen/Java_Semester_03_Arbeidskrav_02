package no.kristiania.pgr200.database;

public class TalkData {

    public long idTalks;
    public String title, description, topic;

    public long getIdTalks() { return idTalks; }

    public void setIdTalks(long idTalks) { this.idTalks = idTalks; }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getTopic() { return topic; }

    public void setTopic(String topic) { this.topic = topic; }
}
