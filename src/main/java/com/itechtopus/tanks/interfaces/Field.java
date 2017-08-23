package com.itechtopus.tanks.interfaces;

import com.itechtopus.tanks.interfaces.models.Position;

public interface Field {

    /**
     * An int value of width of game field
     * @return positive int value
     */
    int getWidth();

    /**
     * An int value of height of game field
     * @return positive int value
     */
    int getHeight();

    /**
     * An int value of player count in a field
     * @return positive int value
     */
    int getPlayerCount();

    /**
     * Returns an int value which represents a numeric
     * value of strength of the block in position (x, y)
     * @param x - X value of requesting block
     * @param y - Y value of requesting block
     * @return max_value..1 value if there is a block in a (x, y)
     * position and 0 if there is no block,
     * where max_value is defined by application
     */
    int getCellstrength(int x, int y);

    /**
     * Returns a position, representing location of a flag
     * of team according to teamId
     * @param tankId - id of team, which flag is requesting
     * @return a position of the flag
     */
    Position getFlagPosition(int tankId);


}
