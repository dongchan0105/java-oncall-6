package oncall.util;


import oncall.exception.Error;

public class InputValidator {

    public static String validateEmpty(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Error.EMPTY_VALUE.getMessage());
        }

        return input;
    }
}
