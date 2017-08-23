package com.itechtopus.tanks.interfaces.models;

public interface Position {

    /**
     * Make a move according to entity's current direction
     */
    void move();

    /**
     * Make a move according to passed direction
     */
    void move(Direction direction);

    /**
     * Return a Position of hypothetical movement to current direction
     * THIS coordinates are not mentioned to change
     * @return a Pos instance
     */
    Position ifMove();

    /**
     * Return a Position of hypothetical movement to passed direction
     * THIS coordinates are not mentioned to change
     * @return a Pos instance
     */
    Position ifMove(Direction direction);

    /**
     * To retrieve a direction
     * @return a Direction instance, representing current direction
     */
    Direction getDirection();

    /**
     * @return X - component of position
     */
    float getX();

    float getY();
}
