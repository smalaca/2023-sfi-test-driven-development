package com.ubs.marsrover;

public class MarsRover {
    private MartianCubit martianCubit = new MartianCubit(0, 0);

    public MartianCubit getPosition() {
        return martianCubit;
    }

    void move(String path) {
        martianCubit = new MartianCubit(1, 0);
    }
}
