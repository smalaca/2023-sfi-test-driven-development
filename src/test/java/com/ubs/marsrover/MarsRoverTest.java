package com.ubs.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void shouldLandOnZeroZero() {
        // given

        // when
        MartianCubit actual = new MarsRover().getPosition();

        // then
        Assertions.assertThat(actual).isEqualTo(new MartianCubit(0, 0));
    }

    @Test
    void shouldMoveForward() {
        // given
        MarsRover marsRover = new MarsRover();

        // when
        marsRover.move("F");

        // then
        MartianCubit actual = marsRover.getPosition();
        Assertions.assertThat(actual).isEqualTo(new MartianCubit(1, 0));
    }

    @Test
    void shouldTurnLeft() {
        // given
        MarsRover marsRover = new MarsRover();

        // when
        marsRover.move("L");

        // then
        MartianCubit actual = marsRover.getPosition();
        Assertions.assertThat(actual).isEqualTo(new MartianCubit(0, 0));
    }
}
