package Model;

import java.time.LocalDateTime;
import java.util.Random;

class Weather {
    public static final String WINTER = "Winter";
    public static final String SPRING = "Spring";
    public static final String SUMMER = "Summer";
    public static final String FALL = "Fall";
    private static final String[] seasons = {
            WINTER, WINTER,
            SPRING, SPRING, SPRING,
            SUMMER, SUMMER, SUMMER,
            FALL, FALL, FALL,
            WINTER
    };
    private Random a = new Random();

    private String getSeason() {
        return seasons[LocalDateTime.now().getMonthValue()];
    }

    public double getSeasonDelay() {
        switch (getSeason()){
            case SUMMER:
                return a.nextDouble() % 0.1;

            case SPRING:
                return a.nextDouble() % 0.3;

            case FALL:
                return a.nextDouble() % 0.35;

            default:
                return a.nextDouble() % 0.6;
        }
    }
}
