package racingcar.controller;

import racingcar.domain.Attempt;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;
import java.util.stream.Collectors;

import static racingcar.controller.Creator.*;
import static racingcar.view.Output.*;

public class RacingController {

    private RacingController() {}

    public static void run() {
        Cars cars = registerCars();
        Attempt attempt = setUpAttempt();

        playRacing(cars, attempt);

        selectWinners(cars);
    }

    private static Cars registerCars() {
        printRegisterCars();
        return createCars();
    }

    private static Attempt setUpAttempt() {
        printSetAttempt();
        return createAttempt();
    }

    private static void playRacing(final Cars cars, final Attempt attempt) {
        printResultTitle();
        RoundResult roundResult = new RoundResult();
        for (int i = 0; i < attempt.getAttempt(); i++) {
            cars.round(roundResult);
            printRoundResult(roundResult);
            printNewLine();
        }
    }

    private static void selectWinners(final Cars cars) {
        List<String> winners = getWinners(cars);
        printWinners(winners);
    }

    private static List<String> getWinners(final Cars cars) {
        List<Car> winners = cars.winners();
        return winners.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
