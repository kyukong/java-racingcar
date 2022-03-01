package racingcar.domain;

import racingcar.controller.RoundResult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {

    public static final int CAR_COUNT_MINIMUM = 2;

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = new ArrayList<>(cars);
        validateCars(cars);
    }

    public void round(RoundResult roundResult) {
        Movable movable = new Moving();
        for (Car car : cars) {
            car.drive(movable);
            roundResult.setRoundResult(car.getName(), car.getPosition());
        }
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

    private List<String> getCarNamesAsString(final List<Car> cars) {
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
