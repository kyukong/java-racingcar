package racingcar.view;

public class Input {

    private Input() {}

    public static String inputCars(final Enterable enterable) {
        String input = enterable.enter();
        validateCars(input);
        return input;
    }

    public static String inputAttempt(final Enterable enterable) {
        String input = enterable.enter();
        validateAttempt(input);
        return input;
    }

    private static void validateCars(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException("자동차 이름에 빈값을 입력할 수 없습니다.");
        }
    }

    private static boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }

    private static void validateAttempt(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException("시도 횟수에 빈값을 입력할 수 없습니다.");
        }
        if (!isNumber(input)) {
            throw new IllegalArgumentException("시도 횟수에 문자를 입력할 수 없습니다.");
        }
    }

    private static boolean isNumber(String input) {
        return input.matches("-?[0-9]+");
    }
}
