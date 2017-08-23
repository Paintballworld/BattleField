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

    boolean isMoving(int tankId);

    boolean isShooting(int tankId);

    int getHealth(int tankId);


}
