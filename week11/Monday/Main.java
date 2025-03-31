import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Event donutsWithTheDirector = new Event("Donuts with the Director");
        donutsWithTheDirector.setLocation("East 2nd Floor");
        donutsWithTheDirector.setDate("March 25, 2025");

        System.out.println(donutsWithTheDirector); // implicitly calling the toString method

        FootballGame superbowl = new FootballGame("Super Bowl LIX", 4);
        superbowl.generateRandomScores();
        superbowl.printSportsEventScores();
        superbowl.setTeam1("Eagles");
        superbowl.setTeam2("Chiefs");
        superbowl.setSport("Football");

        System.out.println("\n\nCalling toString method for superbowl object");
        System.out.println(superbowl);



        SportsEvent worldCup = new SportsEvent("Qatar World Cup", 4);
        worldCup.generateRandomScores();
        worldCup.printSportsEventScores();


        Event event1 = new Event("May 17, 2025", "Carpenter Center", "Graduation!");
        Event event2 = new SportsEvent("Baseball game", 9);
        Event event3 = new FootballGame("Eagles vs Chiefs", 4);

        // polymorphic array
        Event[] allEvents = {superbowl, worldCup, event1, event2, event3};

        System.out.println("##################################");
        System.out.println("All my events!!!");
        for (int i = 0; i < allEvents.length; i++) {
            if (allEvents[i] instanceof FootballGame) {
                System.out.println("*** this is an object of class FootballGame");
            }
            System.out.println(allEvents[i]);
        }

        ArrayList<Integer>mynumbers = new ArrayList<>();
        // Integer[] myevents = new Integer[?];
        // class parameter

        mynumbers.add(1);
        mynumbers.add(20);
        mynumbers.add(3);
        mynumbers.add(99);
        mynumbers.add(5);

        System.out.println("The first number is: " + mynumbers.get(0));

        for (int i = 0; i < mynumbers.size(); i++) {
            System.out.println(mynumbers.get(i));
        }

        if (mynumbers.contains(5)) {
            System.out.println("Your list has the # 5 in it!");
        }
    }
}

class FootballGame extends SportsEvent {
    private int team1numTouchdowns;
    private int team2numTouchdowns;

    public FootballGame(String name, int numPeriods) {
        super(name, numPeriods);
    }

    @Override
    public void generateRandomScores() {
        Random rng = new Random();
        int[] possibleScores = {3, 6, 7, 10, 13, 14};
        for (int i = 0; i < super.getNumPeriods(); i++) {
            setTeam1score(i, possibleScores[rng.nextInt(0, possibleScores.length)]);
            setTeam2score(i, possibleScores[rng.nextInt(0, possibleScores.length)]);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" + super.getTeam1() + " # touchdowns: " + team1numTouchdowns +
                "\n" + super.getTeam2() + " # touchdowns: " + team2numTouchdowns + "\n";
    }
}

class SportsEvent extends Event {
    private int numPeriods;
    private String sport;
    private String team1, team2;
    private int[] team1score;
    private int[] team2score;

    public SportsEvent(String name, int numPeriods) {
        super(name); // call constructor in Event class
        this.numPeriods = numPeriods;
        team1score = new int[numPeriods];
        team2score = new int[numPeriods];
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void generateRandomScores() {
        Random rng = new Random();
        for (int i = 0; i < numPeriods; i++) {
            team1score[i] = rng.nextInt(1, 4);
            team2score[i] = rng.nextInt(1, 4);
        }
    }

    public void printSportsEventScores() {
        for (int i = 0; i < numPeriods; i++) {
            System.out.print("\nPeriod : " + (i+1));
            System.out.printf(" Team 1: %d", team1score[i]);
            System.out.printf(" Team 2: %d", team2score[i]);
        }
    }

    public int getNumPeriods() {
        return numPeriods;
    }

    public void setTeam1score(int period, int score) {
        team1score[period] = score;
    }

    public void setTeam2score(int period, int score) {
        team2score[period] = score;
    }

    @Override
    public String toString() {
        String scoresOutput = "";
        for (int i = 0; i < numPeriods; i++) {
            scoresOutput += "\nPeriod # " + (i+1);
            scoresOutput += " Team 1: "+ team1score[i];
            scoresOutput += " Team 2: "+ team2score[i] + "\n";
        }
        return  "This is a " + sport + " event.\n" +
                team1 + " vs " + team2 + "\n" +
                scoresOutput + "\n" +
                super.toString();
    }
}

class Event {
    private String date;
    private String name;
    private String location;

    public Event(String date, String location, String name) {
        this.date = date;
        this.location = location;
        this.name = name;
    }

    public Event(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
