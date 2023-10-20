package hw_10_10_2023.month;


public enum MonthTemp {
    JANUARY("Зима", -5),
    FEBRUARY("Зима", -4),
    MARCH("Весна", 2),
    APRIL("Весна", 11.3),
    MAY("Весна", 18),
    JUNE("Лето", 22.7),
    JULY("Лето", 24),
    AUGUST("Лето", 21.5),
    SEPTEMBER("Осень", 15),
    OCTOBER("Осень", 8),
    NOVEMBER("Осень", 1),
    DECEMBER("Зима", -3);

    private final String monthSeason;
    private final double temperature;

    MonthTemp(String monthSeason, double temperature) {
        this.monthSeason = monthSeason;
        this.temperature = temperature;
    }


    public String getMonthSeason() {
        return monthSeason;
    }

    public double getTemperature() {
        return temperature;
    }

}


