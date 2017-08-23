package com.itechtopus.tanks.interfaces;

import java.util.List;

public interface GameEngine {


    /**
     * Method to get a list of TankInfo's
     * representing tanks which are yet alive
     * @return a list of all tanks
     */
    List<TankInfo> getAllTankInfo();

    /**
     * Method to get a list of id's
     * representing enemy's tanks which are yet alive
     * @return a list of Integer values
     */
    List<Integer> getEnemyIdList();

    /**
     * Method to get a link to a game Field
     * @return a link to a Field
     */
    Field getField();


}
