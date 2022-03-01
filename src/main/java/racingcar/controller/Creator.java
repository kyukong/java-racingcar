package racingcar.controller;

import racingcar.domain.Attempt;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.Enter;
import racingcar.view.Enterable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static racingcar.view.Input.*;
import static racingcar.view.Output.printErrorMessage;

public class Creator {

    private static final Enterable enterable = new Enter();

    private Creator() {}

    public static Cars createCars() {
        try {
            String names = inputCars(enterable);
            return new Cars(getCars(names));
        } catch (IllegalArgumentException exception) {
            printErrorMessage(exception.getMessage());
            return createCars();
        }
    }

    public static Attempt createAttempt() {
        try {
            String attempt = inputAttempt(enterable);
            return new Attempt(Integer.parseInt(attempt));
        } catch (IllegalArgumentException exception) {
            printErrorMessage(exception.getMessage());
            return createAttempt();
        }
    }

    private static List<Car> getCars(String names) {
        return Arrays.stream(names.split(",", -1))
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
