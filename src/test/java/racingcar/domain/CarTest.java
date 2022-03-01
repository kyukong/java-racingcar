package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @DisplayName("자동차가 이동하는 경우")
    @Test
    void car_drive_true() {
        Car carDrive = new Car("drive");

        Movable movable = () -> true;
        carDrive.drive(movable);

        assertEquals(carDrive.getPosition(), 1);
    }

    @DisplayName("자동차가 대기하는 경우")
    @Test
    void car_drive_false() {
        Car carDrive = new Car("drive");

        Movable movable = () -> false;
        carDrive.drive(movable);

        assertEquals(carDrive.getPosition(), 0);
    }
}
