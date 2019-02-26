package no.kristiania.pgr200.database;

public class DayData {

    public long idDay;
    public int date, time;
    public String room;

    public long getIdDay() { return idDay; }

    public void setIdDay(long idDay) { this.idDay = idDay; }

    public int getDate() { return date; }

    public void setDate(int date) { this.date = date; }

    public int getTime() {
        return time;
    }

    public void setTime(int time) { this.time = time; }

    public String getRoom(){
        return room;
    }

    public void setRoom(String room){
        this.room = room;
    }

}
