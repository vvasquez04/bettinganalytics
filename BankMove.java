import java.time.LocalDateTime;

public class BankMove extends Activity {
    public boolean isWithdrawal;
    public boolean isDeposit;
    public double amount;
    public String sportsbook;

    public static void main(String[] args) {

    }

    public BankMove() {
        this.isWithdrawal = false;
        this.isDeposit = true;
        this.amount = 0.0;
        this.timeStamp = LocalDateTime.parse("2001-07-12T10:00");
        this.sportsbook = "";
    }

    public BankMove(boolean iIsWithdrawal, boolean iIsDeposit, double iAmount, LocalDateTime iTimeStamp, String iSportsbook) {
        this.isWithdrawal = iIsWithdrawal;
        this.isDeposit = iIsDeposit;
        this.amount = iAmount;
        this.timeStamp = iTimeStamp;
        this.sportsbook = iSportsbook;
    }
}