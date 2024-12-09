package oncall.domain;

import static oncall.exception.Error.DUPLICATED_WORKER;
import static oncall.exception.Error.NUMBER_OF_PEOPLE_LIMITED;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmergencyWorkers {

    private final int MAX_WORKERS=35;

    private final List<EmergencyWorker> workers;

    public EmergencyWorkers(List<EmergencyWorker> workers) {
        validateDuplicateWorkers(workers);
        validateDuplicateWorkers(workers);
        this.workers = workers;
    }

    private void validateMaxWorkers(List<EmergencyWorker> workers) {
        if (workers.size()>MAX_WORKERS) {
            throw new IllegalArgumentException(NUMBER_OF_PEOPLE_LIMITED.getMessage());
        }
    }

    private void validateDuplicateWorkers(List<EmergencyWorker> workers) {
        Set<EmergencyWorker> duplicateWorkers = new HashSet<>(workers);
        if(duplicateWorkers.size()!=workers.size()) {
            throw new IllegalArgumentException(DUPLICATED_WORKER.getMessage());
        }
    }
}
