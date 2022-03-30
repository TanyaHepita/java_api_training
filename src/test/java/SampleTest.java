package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SampleTest {

    private final Sample sample = new Sample();
    @Test
    void fact_of_negative_number_throws() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive");
    }
    @Test
    void fact_of_3_is_6() {
        int result = sample.fact(3);
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void adding_10_by_2_should_produce_12() {
        int dividend = 10; // (1)
        int divisor = 2;
        int quotient = Sample.op(Sample.Operation.ADD,dividend, divisor); // (2)
        assertThat(quotient).as("10 + 2")
            .isEqualTo(12); // (3)
    }
}
