package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static final String EMPTY_NUMBER = "0";
    public static final String DEFAULT_DELIMITER = ",|:";
    public static final int DELIMITER_PART = 1;
    public static final int NUMBERS_PART = 2;

    public static int splitAndSum(final String text) {
        String calculatorText = replaceText(text);
        String[] splitText = split(calculatorText);

        return sum(stringArrayToIntArray(splitText));
    }

    private static String replaceText(final String text) {
        if (isEmpty(text)) {
            return EMPTY_NUMBER;
        }
        return text;
    }

    private static boolean isEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    private static String[] split(final String text) {
        String numbers = text;
        String delimiter = DEFAULT_DELIMITER;

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
        if (m.find()) {
            delimiter = getCustomDelimiter(m.group(DELIMITER_PART));
            numbers = m.group(NUMBERS_PART);
        }
        return numbers.split(delimiter);
    }

    private static String getCustomDelimiter(final String delimiter) {
        return String.join("|", DEFAULT_DELIMITER, delimiter);
    }

    private static int[] stringArrayToIntArray(final String[] splitText) {
        return Arrays.stream(splitText)
                .filter(StringCalculator::isValidText)
                .map(StringCalculator::replaceText)
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue).toArray();
    }

    private static boolean isValidText(final String text) {
        if (!isNumber(text)) {
            throw new RuntimeException();
        }
        return true;
    }

    private static boolean isNumber(final String text) {
        return text.matches("[0-9]*");
    }

    private static int sum(final int[] text) {
        int result = 0;
        for (int number : text) {
            checkNegative(number);
            result += number;
        }
        return result;
    }

    private static void checkNegative(final int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
    }
}
