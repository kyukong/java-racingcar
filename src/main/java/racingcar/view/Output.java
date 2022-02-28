package racingcar.view;

public class Output {

    private static final String ERROR_PREFIX = "[ERROR] ";

    private Output() {}

    public static void printErrorMessage(String errorMessage) {
        System.out.println(ERROR_PREFIX + errorMessage);
    }

    public static void printRegisterCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }
}
