package no.kristiania.pgr200.database;

import java.util.Scanner;

public class ParameterInput {

    public static ConferenceData confInput() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Conference name: ");
        String cname = reader.nextLine();

        ConferenceData cd = new ConferenceData();

        cd.setCname(cname);

        return cd;
    }

    public static DayData dayInput() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Date (ddmmyy): ");
        int date = reader.nextInt();

        System.out.println("Time (hhmm): ");
        int time = reader.nextInt();

        System.out.println("Room (X000): ");
        String room = reader.next();

        DayData dd = new DayData();

        dd.setDate(date);
        dd.setTime(time);
        dd.setRoom(room);

        return dd;
    }

    public static TalkData talkInput() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Title: ");
        String title = reader.nextLine();

        System.out.println("Description: ");
        String description = reader.nextLine();

        System.out.println("Topic: ");
        String topic = reader.nextLine();

        TalkData td = new TalkData();

        td.setTitle(title);
        td.setDescription(description);
        td.setTopic(topic);

        return td;
    }
}