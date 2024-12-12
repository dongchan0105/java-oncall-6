package oncall.service;

import java.util.Map;
import oncall.domain.Employee;
import oncall.domain.Workers;
import oncall.domain.date.Days;
import oncall.domain.date.Month;

public class OncallService {

    private Month workMonth;
    private Days startDay;
    private Workers weekendWorker;
    private Workers holidayWorker;

    public void setMonthAndDay(Month workMonth,Days startDay) {
        this.workMonth = workMonth;
        this.startDay = startDay;
    }
    public void setWorkers(Workers weekendWorker,Workers holidayWorker) {
        this.weekendWorker = weekendWorker;
        this.holidayWorker = holidayWorker;
    }

    public Map<Boolean, Employee> makeSchedule(){
        for(int i = 1; i<= workMonth.getDays(); i++){

        }
    }

}
