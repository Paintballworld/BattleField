package com.itechtopus.tanks.interfaces.models;

public interface Position {

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
