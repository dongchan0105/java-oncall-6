package oncall.domain;

import java.time.DayOfWeek;

public enum Days {

    SUNDAY("일",DayOfWeek.SUNDAY),
    MONDAY("월", DayOfWeek.MONDAY),
    TUESDAY("화",DayOfWeek.TUESDAY),
    WEDNESDAY("수",DayOfWeek.WEDNESDAY),
    THURSDAY("목",DayOfWeek.THURSDAY),
    FRIDAY("금",DayOfWeek.FRIDAY),
    SATURDAY("토",DayOfWeek.SATURDAY);


    private final String name;
    private final DayOfWeek dayOfWeek;

    Days(String name, DayOfWeek dayOfWeek) {
        this.name = name;
        this.dayOfWeek = dayOfWeek;
    }





}
