package racingcar.domain;

import java.util.Objects;

public class Car {

    private final CarName name;
    private CarPosition position;

    public Car(final String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void drive(Movable movable) {
        if (movable.isMoving()) {
            position.forward();
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Car car = (Car) other;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
