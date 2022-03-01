package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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

    @DisplayName("우승자가 한명인 경우")
    @Test
    void winner() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        car1.drive(() -> true);
        Cars cars = new Cars(List.of(car1, car2));

        List<Car> winners = cars.winners();

        assertThat(winners).containsExactly(car1);
    }

    @DisplayName("우승자가 두명인 경우")
    @Test
    void winners() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        car1.drive(() -> true);
        car2.drive(() -> true);
        Cars cars = new Cars(List.of(car1, car2, car3));

        List<Car> winners = cars.winners();

        assertThat(winners).containsExactly(car1, car2);
    }
}
