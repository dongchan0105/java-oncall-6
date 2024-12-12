package oncall.util;

public class Parser {

    private static final String DELIMITER = ",";

    public static int parseToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 외의 값이 입력되었습니다.");
        }
    }

    public static String[] splitWithDelimiter(String input) {
        return input.split(DELIMITER);
    }

}
