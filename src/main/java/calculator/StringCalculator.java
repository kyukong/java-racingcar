package calculator;

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

        return sum(splitText);
    }

    private static String replaceText(final String text) {
        if (text == null || text.isEmpty()) {
            return EMPTY_NUMBER;
        }
        return text;
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

    private static int sum(final String[] text) {
        int result = 0;
        for (String number : text) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
