// Abstract Class
abstract class FootballPlayer {
    protected String name;
    protected int goals;
    protected int matchesPlayed;
    private double monthlySalary; // Confidential
    // Constructor
    public FootballPlayer(String name, int goals, int matchesPlayed, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.matchesPlayed = matchesPlayed;
        this.monthlySalary = monthlySalary;
    }
    // Getter for salary (optional, not printed)
    public double getMonthlySalary() {
        return monthlySalary;
    }
    // Abstract method
    public abstract double calculateGoalRate();
    // Method to display player details
    public void displayDetails(String league) {
        System.out.println("Player Name: " + name);
        System.out.println("League: " + league);
        System.out.println("Goals Scored: " + goals);
        System.out.println("Goal Rate: " + calculateGoalRate());
        System.out.println("----------------------------------------");
    }
}
// Subclass for LaLiga
class LaLigaPlayer extends FootballPlayer {
    public LaLigaPlayer(String name, int goals, int matchesPlayed, double monthlySalary) {
        super(name, goals, matchesPlayed, monthlySalary);
    }
    @Override
    public double calculateGoalRate() {
        return (double) goals / matchesPlayed;
    }
}
// Subclass for Premier League
class PremierLeaguePlayer extends FootballPlayer {

    public PremierLeaguePlayer(String name, int goals, int matchesPlayed, double monthlySalary) {
        super(name, goals, matchesPlayed, monthlySalary);
    }
    @Override
    public double calculateGoalRate() {
        return (double) goals / matchesPlayed;
    }
}
// Main Class
public class Main {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Messi", 73, 40, 5000000);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 23, 32, 4500000);
        messi.displayDetails("LaLiga");
        ronaldo.displayDetails("Premier League");
    }
}