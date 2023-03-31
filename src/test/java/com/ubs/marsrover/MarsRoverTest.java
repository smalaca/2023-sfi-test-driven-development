package com.ubs.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    @Test
    void shouldLandOnZeroZero() {
        // given

        // when
        MartianCubit actual = new MarsRover().land();

        // then
        Assertions.assertThat(actual).isEqualTo(new MartianCubit(0, 0));
    }

}
