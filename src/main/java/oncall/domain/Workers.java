package oncall.domain;

import java.util.Deque;

public class Workers {

    private Deque<Employee> workers;

    public Workers(Deque<Employee> workers) {
        validateNumberOfEmployees(workers);
        this.workers = workers;
    }

    private void validateNumberOfEmployees(Deque<Employee> workers){
        if (workers.size()>35){
            throw new IllegalArgumentException("비상 근무자는 35명을 넘을 수 없습니다");
        }
    }

    public Deque<Employee> getWorkers() {
        return workers;
    }
}
