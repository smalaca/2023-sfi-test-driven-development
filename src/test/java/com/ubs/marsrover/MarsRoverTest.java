package com.ubs.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
// mvn test - run tests fix

    @Test
    void shouldLandOnZeroZero() {
        // given

        // when
        MartianCubit actual = new MarsRover().getPosition();

        // then
        Assertions.assertThat(actual).isEqualTo(new MartianCubit(0, 0));
    }

}
