package com.itechtopus.tanks.interfaces.field;

import com.itechtopus.tanks.interfaces.models.BlockType;
import com.itechtopus.tanks.interfaces.models.Position;

public interface Field {

    /**
     * An int value of width of game field
     * @return positive int value
     * by default - it is always 52
     */
    int getWidth();

    /**
     * An int value of height of game field
     * @return positive int value
     * by default - it is always 52
     */
    int getHeight();

    /**
     * Returs BlockType of block, which is located in (x, y)
     * @param x - X coordinate
     * @param y - Y coordinate
     * @return a BlockType or null, if there is not block
     */
    BlockType getBlockAt(int x, int y);

    /**
     * Returns a position, representing location of a flag
     * of team according to teamId
     * @param tankId - id of team, which flag is requesting
     * @return a position of the flag
     */
    Position getFlagPosition(int tankId);

    /**
     * Returns an array of BlockTypes of all field
     * @return an matrix of BlockTypes
     */
    BlockType[][] getAllBlocks();


}
