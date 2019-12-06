package Model;

import java.time.LocalDateTime;
import java.util.Random;

class Weather {
    private static final String[] seasons = {
            "Winter", "Winter",
            "Spring", "Spring", "Spring",
            "Summer", "Summer", "Summer",
            "Fall", "Fall", "Fall",
            "Winter"
    };
    private Random a = new Random();

    private String getSeason() {
        return seasons[LocalDateTime.now().getMonthValue()];
    }

    public double getSeasonDelay() {
        switch (getSeason()){
            case "Summer":
                return a.nextDouble() % 0.1;

            case "Spring":
                return a.nextDouble() % 0.3;

            case "Fall":
                return a.nextDouble() % 0.35;

            default:
                return a.nextDouble() % 0.6;
        }
    }
}
