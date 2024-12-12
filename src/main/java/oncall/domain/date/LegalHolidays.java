package oncall.domain.date;

public enum LegalHolidays {
    NEW_YEARS_DAY(1,1),
    SAMILJEOL(3,1),
    CHILDREN_DAY(5,5),
    MEMORIAL_DAY(6,6),
    LIBERATION_DAY(8,15),
    NATIONAL_FOUNDATION_DAY(10,3),
    HANGUL_DAY(10,9),
    CHRISTMAS_DAY(12,25);


    private final int month;
    private final int day;

    LegalHolidays(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
