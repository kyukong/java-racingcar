package racingcar.domain;

public class CarName {

    private static final int NAME_LENGTH_MAXIMUM = 5;

    private final String name;

    public CarName(final String name) {
        this.name = name;
        validateName();
    }

    public String getName() {
        return name;
    }

    private void validateName() {
        validateEmpty();
        validateNameLength();
    }

    private void validateEmpty() {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름에 빈값을 입력할 수 없습니다.");
        }
    }

    private void validateNameLength() {
        if (name.length() > NAME_LENGTH_MAXIMUM) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하로 작성해주세요.");
        }
    }
}
