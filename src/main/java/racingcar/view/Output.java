package racingcar.view;

import racingcar.controller.RoundResult;
import racingcar.domain.Car;

import java.util.HashMap;
import java.util.List;

public class Output {

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String EQUALS = " : ";
    private static final String STEP = "-";

    private Output() {}

    public static void printErrorMessage(final String errorMessage) {
        System.out.println(ERROR_PREFIX + errorMessage);
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printRegisterCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printSetAttempt() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printResultTitle() {
        System.out.println("\n실행 결과");
    }

    public static void printRoundResult(final RoundResult roundResult) {
        HashMap<String, Integer> results = roundResult.getRoundResult();
        for (String carName : results.keySet()) {
            System.out.println(carName + EQUALS + STEP.repeat(results.get(carName)));
        }
    }

    public static void printWinners(final List<String> winners) {
        System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
    }
}
