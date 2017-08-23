package com.itechtopus.tanks.interfaces.models;

import java.util.stream.Stream;

public enum Direction {
    LEFT(0), UP(1), RIGHT(2), DOWN(3);

    private int direction;

    /**
     * Constructor
     * @param direction takes an int, representing direction
     *                  and initialize an Enum instance
     *                  which represents a direction
     */
    Direction(int direction) {
        this.direction = direction;
    }

    /**
     * Turn LEFT of current direction method
     * @param direction - initial direction to turn from
     * @return a new direction, to which an entity is turned,
     * after method invocation
     */
    public static Direction turnLeftOf(Direction direction) {
        return of((direction.direction + 3) % 4);
    }

    /**
     * Turn RIGHT of current direction method
     * @param direction - initial direction to turn from
     * @return a new direction, to which an entity is turned,
     * after method invocation
     */
    public static Direction turnRightOf(Direction direction) {
        return of((direction.direction + 1) % 4);
    }

    /**
     * Turn the OPPOSITE of current direction method
     * @param direction - initial direction to turn from
     * @return a new direction, to which an entity is turned,
     * after method invocation
     */
    public static Direction oppositeOf(Direction direction){
        return of((direction.direction + 2) % 4);
    }

    /**
     * Method returns a direction according to passed value
     * @param dir - direction numeric value
     * @return a new direction
     */
    public static Direction of(int dir) {
        return Stream
                .of(Direction.values())
                .filter(o -> o.direction == dir)
                .findFirst().orElse(null);
    }

    /**
     * method to retrieve x coordinate delta value, corresponding
     * to X component of this
     * @return -1, 0 or 1
     */
    public int xDelta(){
        return this == LEFT ? -1 : this == RIGHT ? 1 : 0;
    }

    /**
     * method to retrieve x coordinate delta value, corresponding
     * to X component of this
     * @return -1, 0 or 1
     */
    public int yDelta(){
        return this == UP ? -1 : this == DOWN ? 1 : 0;
    }
}
