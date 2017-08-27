package com.itechtopus.tanks.interfaces.models;

public interface MovingModel {

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
     * To get if current model is collides with one, which
     * position is passed as a parameter
     * @param target - position of object to collide
     * @return true if two models are colliding and false if not
     */
    boolean collidesWith(Position target);
}
