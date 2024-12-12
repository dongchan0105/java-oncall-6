package oncall.domain;

public enum Days {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3),THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private final int day;

    Days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }


}
