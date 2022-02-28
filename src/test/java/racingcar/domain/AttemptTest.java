package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AttemptTest {

    @DisplayName("시도 횟수가 음수인 경우")
    @Test
    void attempt_negative() {
        assertThatThrownBy(() -> {
            Attempt attempt = new Attempt(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
