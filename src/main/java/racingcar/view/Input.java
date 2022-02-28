package racingcar.view;

import racingcar.domain.Enterable;

public class Input {

    private Input() {}

    public static String inputCars(final Enterable enterable) {
        String input = enterable.enter();
        validateCars(input);
        return input;
    }

    private static void validateCars(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름에 빈값을 입력할 수 없습니다.");
        }
    }
}
