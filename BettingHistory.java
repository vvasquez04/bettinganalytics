import java.util.ArrayList;

public class BettingHistory {
    public ArrayList<Day> days;
    public double balance;
    public double plusMinus;

    public static void main(String[] args) {

    }

    public BettingHistory() {
        this.days = new ArrayList<Day>();
        this.balance = 0.0;
        this.plusMinus = 0.0;
    }

    public BettingHistory(ArrayList<Day> iDays, double iBalance, double iPlusMinus) {
        this.days = iDays;
        this.balance = iBalance;
        this.plusMinus = iPlusMinus;
    }
}