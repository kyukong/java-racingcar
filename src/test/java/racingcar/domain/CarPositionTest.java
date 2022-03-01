package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarPositionTest {

    @DisplayName("위치 이동 확인")
    @Test
    void position_forward() {
        CarPosition position = new CarPosition();

        position.forward();

        assertEquals(position.getPosition(), 1);
    }
}
