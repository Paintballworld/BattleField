package com.itechtopus.tanks.interfaces;

import com.itechtopus.tanks.interfaces.models.Direction;
import com.itechtopus.tanks.interfaces.models.Position;

public interface TankInfo {

    /**
     * To get current coordinates and direction of the tank
     * @return the Position of the tank
     */
    Position getPosition(int tankId);

    /**
     * To get current direction of the tank
     * @return the Direction of the tank
     */
    Direction getDirection();

    /**
     * @return true if Tank, which is represented by this Tank info
     * is moving and false if it is not
     */
    boolean isMoving();

    /**
     * @return true if Tank, which is represented by this Tank info
     * is shooting and false if it is not.
     * When the ammo of the tank is currently flying - it is
     * considered as tank is shooting
     */
    boolean isShooting();

    /**
     * @return Direction of the Tank is shooting to, or null
     * if tank doesn't shoot at the time
     */
    Direction getShootingDirection();

    /**
     * Returns the Health of a tank
     * @return int value of the tank's heals
     */
    int getHealth();

}
