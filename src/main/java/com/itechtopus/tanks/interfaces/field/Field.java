package com.itechtopus.tanks.interfaces.field;

import com.itechtopus.tanks.interfaces.models.*;

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
     * Will return a block type, which is located in the
     * point at (point.getX(), point.getY())
     * @param point - point
     * @return BlockType or null, if block is empty
     */
    BlockType getBlockAt(Point point);

    /**
     * Will return an array of blockTypes that are located
     * right in front of the tank towards its current direction.
     * From left to right, or from top to the bottom
     * @return an BlockType array, considering that if a block is empty
     * array value of this block will be null
     */
    BlockType[] getBlocksAhead();

    /**
     * Returns an array of BlockTypes of all field
     * @return an matrix of BlockTypes
     */
    BlockType[][] getAllBlocks();

    /**
     * Returns a position, representing location of a flag
     * of team according to teamId
     * @param tankId - id of team, which flag is requesting
     * @return a position of the flag
     */
    Position getFlagPosition(int tankId);

    /**
     * Get the farthest position which tank can go
     * @return a Position instance, which shows a maximum
     * position that this tank could get, moving to current direction
     * Position of the model is not changing
     */
    Position getFarthestPosition();

    /**
     * Return a Position of hypothetical movement to passed direction
     * tank's coordinates are not mentioned to change
     * @return a Position instance, which shows a maximum
     * position that this tank could get, moving to given direction
     */
    Position getFarthestPosition(Direction direction);

    /**
     * In order to find if current tank is in that position
     * from where it can not move any further towards current direction
     * @return true if tank can not move further and false if it can
     *
     * It is necessary to understand, that solid block ahead, means that
     * tank is not able to go further and it is the dead end.
     *
     * Brick walls are not dead ends.
     */
    boolean deadEnd();





}
