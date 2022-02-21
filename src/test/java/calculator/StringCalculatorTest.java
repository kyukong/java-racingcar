package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    public void splitAndSum_쉼표구분자_숫자2개() throws Exception {
        int result = StringCalculator.splitAndSum("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void splitAndSum_쉼표구분자_숫자2개_10이상() throws Exception {
        int result = StringCalculator.splitAndSum("1,12");
        assertThat(result).isEqualTo(13);
    }

    @Test
    public void splitAndSum_쉼표구분자_숫자3개() throws Exception {
        int result = StringCalculator.splitAndSum("1,2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_쉼표_또는_콜론_구분자() throws Exception {
        int result = StringCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_custom_구분자_변경() throws Exception {
        int result = StringCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_custom_구분자_포함() throws Exception {
        int result = StringCalculator.splitAndSum("//;\n1;2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_negative() throws Exception {
        assertThatThrownBy(() -> StringCalculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    public void splitAndSum_문자() throws Exception {
        assertThatThrownBy(() -> StringCalculator.splitAndSum("1,일곱,3"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    public void splitAndSum_중간_빈문자() throws Exception {
        int result = StringCalculator.splitAndSum("1,,3");
        assertThat(result).isEqualTo(4);
    }
}