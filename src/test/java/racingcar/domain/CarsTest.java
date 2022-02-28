package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarsTest {

    @DisplayName("자동차가 하나일 경우")
    @Test
    void cars_length_1() {
        List<Car> names = new ArrayList<>();
        names.add(new Car("car"));
        assertThatThrownBy(() -> {
            Cars cars = new Cars(names);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차들의 이름이 중복될 경우")
    @Test
    void cars_name_duplicate() {
        List<Car> names = new ArrayList<>();
        names.add(new Car("car"));
        names.add(new Car("car"));
        names.add(new Car("car2"));
        assertThatThrownBy(() -> {
            Cars cars = new Cars(names);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
