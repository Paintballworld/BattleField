package com.itechtopus.tanks.interfaces;

import com.itechtopus.tanks.interfaces.models.Direction;
import com.itechtopus.tanks.interfaces.models.Position;

public interface Tank {

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
     * @param direction - direction to turn to
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
     * To get current coordinates and direction of the tank
     * @return the Position of the tank
     */
    Position getPosition();

    /**
     * To get current direction of the tank
     * @return the Direction of the tank
     */
    Direction getDirection();

    /**
     * To get a value, which represents a health of the tank
     * @return int value of health
     */
    int getHealth();

    /**
     * To find ut if tank is able to move to passed direction
     * @param direction - direction to check
     * @return true if road is open and false if not
     */
    boolean canGo(Direction direction);

    /**
     * @return true if tank is alive and false if not
     */
    boolean isAlive();

}
