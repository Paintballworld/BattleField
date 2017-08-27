package com.itechtopus.tanks.interfaces;

import com.itechtopus.tanks.interfaces.models.Direction;
import com.itechtopus.tanks.interfaces.models.MovingModel;
import com.itechtopus.tanks.interfaces.models.Position;

public interface Tank extends MovingModel{

    /**
     * Method to fire
     */
    void fire();

    /**
     * To retrieve if the tank is ready to shoot again
     * @return true if tank is ready to fire and false if not
     */
    boolean isRecharged();

    /**
     * To turn into a passed direction
     * @param direction - absolute (not relative)
     *                  direction to turn to
     */
    void turn(Direction direction);

    /**
     * To change direction of the tank to the left from current
     * direction, without actual moving
     * UP -> LEFT, LEFT -> DOWN ... e.t.c.
     */
    void turnLeft();

    /**
     * To change direction of the tank to the right from current
     * direction, without actual moving
     * UP -> RIGHT, RIGHT -> DOWN ... e.t.c.
     */
    void turnRight();

    /**
     * Reverse direction: UP -> DOWN , LEFT -> RIGHT ... e.t.c.
     */
    void reverse();

    /**
     * To actual move the tank towards current direction
     */
    void go();

    /**
     * To stop movement
     */
    void stop();

    /**
     * To get a value, which represents a health of the tank
     * @return int value of health
     */
    int getHealth();

    /**
     * @return true if tank is alive and false if not
     */
    boolean isAlive();

}
