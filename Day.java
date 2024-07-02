import java.util.ArrayList;

public class Day {
    public ArrayList<Activity> dailyActivities;

    public static void main(String[] args) {

    }

    public Day() {
        this.dailyActivities = new ArrayList<Activity>();
    }

    public Day(ArrayList<Activity> iDailyActivities) {
        this.dailyActivities = iDailyActivities;
    }
}