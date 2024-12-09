package oncall.exception;

public enum Error {

    CAPTION("[ERROR] "),
    EMPTY_VALUE(CAPTION.message+"공백 또는 빈 문자열은 입력할 수 없습니다");


    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
