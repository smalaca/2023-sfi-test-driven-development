package com.ubs.marsrover;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class MartianCubit {
    private final int xAxis;
    private final int yAxis;

    MartianCubit(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MartianCubit that = (MartianCubit) o;

        return new EqualsBuilder().append(xAxis, that.xAxis).append(yAxis, that.yAxis).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(xAxis).append(yAxis).toHashCode();
    }
}
