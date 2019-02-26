package no.kristiania.pgr200.database;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class DBMain {

    private static ConferenceData cd;
    private static DayData dd;
    private static TalkData td;
    private static PSQLPrint jpsr;
    private static Connection c;
    private static Scanner inputScanner;
    private static DBHandler dbh;

    public DataSource dataSource;
    public ConferenceTalkDao dao;

    public DBMain() {
      this.dao = new ConferenceTalkDao();
    }

    public static void main(String[] args) throws SQLException {

        dbh.flywayConnection();

        inputScanner = new Scanner(System.in);
        System.out.println("\n" + "Welcome!"
                + "\n" + "You can either look at the upcoming talks,"
                + "\n" + "add a talk or clear the tables by using the following commands below!"
                + "\n"
                + "\n" + "- show"
                + "\n" + "- add"
                + "\n" + "- clear"
                + "\n"
                + "\n" + "Commandline:");
        String command = inputScanner.nextLine();
        if(command.equals("show")) {
            jpsr.listTalks();
            System.out.println("\n" + "\n" + "Type menu in the commandline to go back to the menu."
                    + "\n"
                    + "\n" + "Commandline:");
            String command2 = inputScanner.nextLine();
            if(command2.equals("menu")) {
                new DBMain().main(args);
            } else {
                System.out.println("Incorrect command!");
            }
        } else if (command.equals("add")) {
            cd = ParameterInput.confInput();
            dd = ParameterInput.dayInput();
            td = ParameterInput.talkInput();
            new DBMain().run(args);
            System.out.println("\n" + "\n" + "Type menu in the commandline to go back to the menu."
                    + "\n"
                    + "\n" + "Commandline:");
            String command2 = inputScanner.nextLine();
            if(command2.equals("menu")) {
            new DBMain().main(args);
            } else {
                System.out.println("Incorrect command!");
            }
        } else if(command.equals("clear")){
            dbh.clearTables();
            System.out.println("\n" + "Tables cleared!" + "\n");
            new DBMain().main(args);
        } else {
            System.out.println("Incorrect command!");
            new DBMain().main(args);
        }

    }

    public void run(String[] args) throws SQLException {
        insertConf();
        insertDay();
        insertTalk();
    }

    public void insertConf() throws SQLException {
        dao.inputConf(cd.getCname());
    }

    public void insertDay() throws SQLException {
        dao.inputDay(dd.getDate(), dd.getTime(), dd.getRoom());
    }

    public void insertTalk() throws SQLException {
        dao.inputTalk(td.getTitle(), td.getDescription(), td.getTopic());
    }

}