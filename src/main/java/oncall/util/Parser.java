package oncall.util;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import oncall.domain.EmergencyWorker;

public class Parser {

    private static final String DELIMITER = ",";

    public static Month parseToDate(String date) {

    }

    public static List<EmergencyWorker> parseToWorkers(String input) {
        return Arrays.stream(input.split(DELIMITER))
                .map(EmergencyWorker::new)
                .toList();
    }
}
