package com.itechtopus.tanks.interfaces.models;

public interface Position {

    /**
     * Return a Position of hypothetical movement to current direction
     * THIS coordinates are not mentioned to change
     * @return a Pos instance
     */
    Position getPositionAhead();


    /**
     * Return a Position of hypothetical movement to passed direction
     * THIS coordinates are not mentioned to change
     * @return a Pos instance
     */
    Position getPositionFor(Direction direction);

    /**
     * To retrieve a direction
     * @return a Direction instance, representing current direction
     */
    Direction getDirection();

    /**
     * @return X - component of position
     */
    float getX();

    /**
     * @return Y - component of position
     */
    float getY();
}