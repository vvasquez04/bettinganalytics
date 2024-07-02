import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Day> days = new ArrayList<Day>();
        BettingHistory bettingHistory = new BettingHistory(days, 322.65, 0.0);

        System.out.println("Welcome to the bet tracker. Do you have an import file with your bets?");
    }
}