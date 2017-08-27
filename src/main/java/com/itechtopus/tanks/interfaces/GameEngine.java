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
     * An int value of player count in a field
     * @return positive int value
     */
    int getPlayerCount();

}
