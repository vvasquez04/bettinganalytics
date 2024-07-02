import java.time.LocalDateTime;

public class Wager extends Activity {
    public double stakeAmt;
    public double margin;
    public boolean pending;
    public String sportsbook;
    public String result;
    public String action;
    public int odds;
    public LocalDateTime clearDate;

    public static void main(String[] args) {

    }

    public Wager() {
        this.stakeAmt = 0.0;
        this.margin = 0.0;
        this.pending = true;
        this.sportsbook = "";
        this.result = "";
        this.action = "";
        this.odds = 0;
        this.timeStamp = LocalDateTime.parse("2001-07-12T10:00");
        this.clearDate = LocalDateTime.parse("2001-07-12T10:00");
    }

    public Wager(double iStakeAmt, double iMargin, boolean iPending, String iSportsbook, String iResult, String iAction, int iOdds, LocalDateTime iTimeStamp, LocalDateTime iClearDate) {
        this.stakeAmt = iStakeAmt;
        this.margin = iMargin;
        this.pending = iPending;
        this.sportsbook = iSportsbook;
        this.result = iResult;
        this.action = iAction;
        this.odds = iOdds;
        this.timeStamp = iTimeStamp;
        this.clearDate = iClearDate;
    }
}