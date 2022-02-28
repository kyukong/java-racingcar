package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Enter;
import racingcar.domain.Enterable;

import static racingcar.view.Creator.createCars;
import static racingcar.view.Output.*;
import static racingcar.view.Input.*;

public class RacingGame {

    private static final Enterable enterable = new Enter();

    private RacingGame() {}

    public static void play() {
        Cars cars = registerCars();

        // TODO: 시도할 횟수를 등록한다.

        // TODO: 자동차들을 경주한다.

        // TODO: 최종 우승자를 출력한다.
    }

    private static Cars registerCars() {
        printRegisterCars();
        return createCars();
    }
}
