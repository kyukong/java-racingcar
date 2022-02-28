package racingcar.domain;

public class Attempt {

    private final int attempt;

    public Attempt(final int attempt) {
        this.attempt = attempt;
        validateAttempt();
    }

    private void validateAttempt() {
        if (this.attempt < 0) {
            throw new IllegalArgumentException("시도 횟수는 음수를 입력할 수 없습니다.");
        }
    }
}
