package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @DisplayName("이름에 null 을 입력할 경우")
    @Test
    void car_name_null() {
        assertThatThrownBy(() -> {
            CarName carName = new CarName(null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름에 빈값을 입력할 경우")
    @Test
    void car_name_empty() {
        assertThatThrownBy(() -> {
            CarName carName = new CarName("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름이 5글자를 초과하는 경우")
    @Test
    void CarName_name_length() {
        assertThatThrownBy(() -> {
            CarName carName = new CarName("yukong");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
