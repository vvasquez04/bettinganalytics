import java.time.LocalDateTime;

public class Activity {
    public LocalDateTime timeStamp;

    public static void main(String[] args) {

    }

    public Activity() {
        this.timeStamp = LocalDateTime.parse("2001-07-12T10:00");
    }

    public Activity(LocalDateTime iTimeStamp) {
        this.timeStamp = iTimeStamp;
    }
}