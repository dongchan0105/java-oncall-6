package oncall.exception;

public enum Error {

    CAPTION("[ERROR] "),
    EMPTY_VALUE(CAPTION.message+"공백 또는 빈 문자열은 입력할 수 없습니다"),
    NAME_LENGTH_RESTRICTION(CAPTION.message+"이름은 5자리까지만 가능합니다"),
    NUMBER_OF_PEOPLE_LIMITED(CAPTION.getMessage()+"비상근무자는 35명까지만 가능합니다"),
    DUPLICATED_WORKER(CAPTION.getMessage()+"중복된 근무자가 있으면 안됩니다");


    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
