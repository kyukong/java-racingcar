package racingcar.controller;

import racingcar.domain.Attempt;
import racingcar.domain.Cars;

import static racingcar.view.Creator.createAttempt;
import static racingcar.view.Creator.createCars;
import static racingcar.view.Output.*;

public class RacingGame {

    private RacingGame() {}

    public static void play() {
        Cars cars = registerCars();
        Attempt attempt = setUpAttempt();

        // TODO: 자동차들을 경주한다.

        // TODO: 최종 우승자를 출력한다.
    }

    private static Cars registerCars() {
        printRegisterCars();
        return createCars();
    }

    private static Attempt setUpAttempt() {
        printSetAttempt();
        return createAttempt();
    }
}
