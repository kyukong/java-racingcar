package racingcar.controller;

import racingcar.domain.Attempt;
import racingcar.domain.Cars;

import static racingcar.controller.Creator.*;
import static racingcar.view.Output.*;

public class RacingController {

    private RacingController() {}

    public static void run() {
        Cars cars = registerCars();
        Attempt attempt = setUpAttempt();

        playRacing(cars, attempt);

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

    private static void playRacing(final Cars cars, final Attempt attempt) {
        printResultTitle();
        RoundResult roundResult = new RoundResult();
        for (int i = 0; i < attempt.getAttempt(); i++) {
            cars.round(roundResult);
            printRoundResult(roundResult);
            printNewLine();
        }
    }
}
