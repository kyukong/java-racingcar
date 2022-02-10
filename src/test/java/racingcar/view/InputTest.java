package racingcar.view;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InputTest {

    static Input input = new Input();

    @ParameterizedTest
    @ValueSource(strings = {" "})
    void 자동차_이름_공백_테스트(String name) {
        assertTrue(input.isBlank(name));
    }

    @Test
    void 자동차_개수_테스트() {
        assertFalse(input.isCars(split("pobi")));
    }

    @Test
    void 자동차_이름_중복_테스트() {
        assertTrue(input.isDuplicated(split("pobi,jun,pobi")));
    }

    @Test
    void 자동차_이름_길이_테스트() {
        assertFalse(input.isValidLength("gooddd"));
    }

    @Test
    void 시도횟수_공백_테스트() {
        assertTrue(input.isBlank(" "));
    }

    @Test
    void 시도횟수_문자_예외_테스트() {
        assertFalse(input.isNumber("횟수"));
    }

    @Test
    void 시도횟수_음수_테스트() {
        assertTrue(input.isNegative("-1"));
    }

    String[] split(String text) {
        return text.split(",");
    }
}