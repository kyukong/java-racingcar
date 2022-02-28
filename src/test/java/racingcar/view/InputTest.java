package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Enterable;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.view.Input.*;

public class InputTest {

    @DisplayName("자동차들이 null 일 경우")
    @Test
    void cars_null() {
        Enterable enterable = () -> null;
        assertThatThrownBy(() -> {
            String cars = inputCars(enterable);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차들이 빈값일 경우")
    @Test
    void cars_empty() {
        Enterable enterable = () -> "";
        assertThatThrownBy(() -> {
            String cars = inputCars(enterable);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("시도 횟수가 null 일 경우")
    @Test
    void attempt_null() {
        Enterable enterable = () -> null;
        assertThatThrownBy(() -> {
            String attempt = inputAttempt(enterable);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("시도 횟수가 빈값일 경우")
    @Test
    void attempt_empty() {
        Enterable enterable = () -> "";
        assertThatThrownBy(() -> {
            String attempt = inputAttempt(enterable);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("시도 횟수가 문자일 경우")
    @Test
    void attempt_not_number() {
        Enterable enterable = () -> "attempt";
        assertThatThrownBy(() -> {
            String attempt = inputAttempt(enterable);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
