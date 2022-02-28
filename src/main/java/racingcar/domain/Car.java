package racingcar.domain;

public class Car {

    private final CarName name;
    private CarPosition position;

    public Car(final String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }
}
