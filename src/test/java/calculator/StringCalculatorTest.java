package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @Test
    public void splitAndSum_null_또는_빈문자() throws Exception {
        int result = StringCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);

        result = StringCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void splitAndSum_숫자하나_1() throws Exception {
        int result = StringCalculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void splitAndSum_숫자하나_2() throws Exception {
        int result = StringCalculator.splitAndSum("2");
        assertThat(result).isEqualTo(2);
    }
}