package oncall.util;

import oncall.domain.Employee;
import oncall.domain.Workers;

public class WorkersValidator {

    public static void validateWorker(Workers weekend,Workers holidays) {
        Employee exceptionEmployee=holidays.getWorkers().stream().filter(employee ->
                !weekend.getWorkers().contains(employee))
                .findAny()
                .orElse(null);
        if (exceptionEmployee == null) {
            throw new IllegalArgumentException("휴일 근무자리스트는 평일 근무자 리스트와 같아야합니다.");
        }
    }
}
