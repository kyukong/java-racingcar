package calculator;

public class StringCalculator {
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] splitText = text.split(",");

        int sumResult = 0;
        for (String number : splitText) {
            sumResult += Integer.parseInt(number);
        }
        return sumResult;
    }
}
