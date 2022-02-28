package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {

    public static final int CAR_COUNT_MINIMUM = 2;
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
        validateCars(cars);
    }

    private void validateCars(final List<Car> cars) {
        validateCarsCount(cars);
        validateDuplicated(cars);
    }

    private void validateCarsCount(final List<Car> cars) {
        if (cars.size() < CAR_COUNT_MINIMUM) {
            throw new IllegalArgumentException("두 개 이상의 자동차를 등록해주세요.");
        }
    }

    private void validateDuplicated(final List<Car> cars) {
        List<String> names = getCarNamesAsString(cars);
        Set<String> distinctNames = new HashSet<>(names);

        if (names.size() != distinctNames.size()) {
            throw new IllegalArgumentException("자동차들의 이름이 중복되지 않게 등록해주세요.");
        }
    }

    private List<String> getCarNamesAsString(List<Car> cars) {
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
