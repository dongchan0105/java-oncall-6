package oncall.domain;

import static oncall.exception.Error.NAME_LENGTH_RESTRICTION;

public class EmergencyWorker {

    private String name;

    public EmergencyWorker(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException(NAME_LENGTH_RESTRICTION.getMessage());
        }
    }
}
