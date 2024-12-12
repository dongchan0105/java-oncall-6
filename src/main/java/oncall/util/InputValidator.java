package oncall.util;

public class InputValidator {

    public static String validateEmpty(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("공란을 입력받을 수 없습니다.");
        }

        return input;
    }
}
