package com.itechtopus.tanks.interfaces;

import com.itechtopus.tanks.interfaces.field.Field;

import java.util.List;

public interface GameEngine {

    /**
     * Method to get a list of TankInfo's
     * representing enemy tanks which are yet alive
     * @return a list of all tanks
     */
    List<TankInfo> getEnemyInfo();

    /**
     * Method to get a link to a game Field
     * @return a link to a Field
     */
    Field getField();

    /**
     * To get a value of the current score
     * @param player - Tanker instance (must be "this");
     * @return an int value, representing a number of
     * player remaining lives
     */
    int getPlayerLifesLeft(Tanker player);
}
